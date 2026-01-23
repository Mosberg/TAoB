file 4

I can’t fit **python_tools_template.md** (the “6 production-ready modules”) in a single message without truncation, so I’m going to deliver it as **File 4A / 4B / 4C** (all are part of the same file). Copy all three parts into one local file named `python_tools_template.md` (or directly split into the actual `tools/*.py` files as indicated).

This design aligns with Fabric’s documented model generation concepts (blockstates + models) even though we’re generating JSON directly rather than via `FabricModelProvider`. 

***

## File 4A — `python_tools_template.md` (Part 1/3)

```md
# python_tools_template.md — TAoB Python Tools (Templates)

Target: Minecraft 1.21.11 Fabric mod (Yarn, split-sources).
Goal: Deterministically generate correct assets/data JSON and validate PNG textures.

This “single document” contains the exact code for these 6 modules:

- tools/config.py
- tools/logger_setup.py
- tools/utils/naming_utils.py
- tools/utils/json_utils.py
- tools/generators/json_generator.py
- tools/main.py

Optional (recommended if you generate/validate PNGs):
- tools/generators/png_generator.py
- tools/validators/png_validator.py

You can:
1) copy the relevant code blocks into real files, OR  
2) keep this file as reference and copy sections as needed.

---

## tools/config.py

```python
from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Final


# ============================================================================
# Core mod metadata
# ============================================================================

@dataclass(frozen=True, slots=True)
class ModMeta:
    mod_id: str = "taob"
    mod_name: str = "The Art of Brewing"
    minecraft_version: str = "1.21.11"
    java_version: int = 21


MOD: Final[ModMeta] = ModMeta()


# ============================================================================
# Paths (repo-root relative)
# ============================================================================

def repo_root() -> Path:
    """
    Resolve repository root by walking up from tools/ directory.

    Assumes this file lives at: <repo>/tools/config.py
    """
    return Path(__file__).resolve().parents[1]


@dataclass(frozen=True, slots=True)
class Paths:
    root: Path

    # sources
    src_main: Path
    src_client: Path

    # resources
    res_main: Path
    res_client: Path

    # canonical output roots
    assets_root: Path
    data_root: Path

    # assets/<modid>
    assets_mod: Path
    textures: Path
    textures_item: Path
    textures_block: Path
    models: Path
    models_item: Path
    models_block: Path
    blockstates: Path
    lang: Path

    # data/<modid>
    data_mod: Path
    recipes: Path
    tags: Path
    tags_items: Path
    tags_blocks: Path
    loot_tables: Path
    advancements: Path

    # tools
    tools_dir: Path
    logs_dir: Path
    tmp_dir: Path


def compute_paths(root: Path, mod_id: str) -> Paths:
    src_main = root / "src" / "main"
    src_client = root / "src" / "client"

    res_main = src_main / "resources"
    res_client = src_client / "resources"

    assets_root = res_main / "assets"
    data_root = res_main / "data"

    assets_mod = assets_root / mod_id
    textures = assets_mod / "textures"
    models = assets_mod / "models"

    data_mod = data_root / mod_id

    tools_dir = root / "tools"
    logs_dir = tools_dir / "logs"
    tmp_dir = tools_dir / "tmp"

    return Paths(
        root=root,
        src_main=src_main,
        src_client=src_client,
        res_main=res_main,
        res_client=res_client,
        assets_root=assets_root,
        data_root=data_root,
        assets_mod=assets_mod,
        textures=textures,
        textures_item=textures / "item",
        textures_block=textures / "block",
        models=models,
        models_item=models / "item",
        models_block=models / "block",
        blockstates=assets_mod / "blockstates",
        lang=assets_mod / "lang",
        data_mod=data_mod,
        recipes=data_mod / "recipes",
        tags=data_mod / "tags",
        tags_items=data_mod / "tags" / "items",
        tags_blocks=data_mod / "tags" / "blocks",
        loot_tables=data_mod / "loot_tables",
        advancements=data_mod / "advancements",
        tools_dir=tools_dir,
        logs_dir=logs_dir,
        tmp_dir=tmp_dir,
    )


PATHS: Final[Paths] = compute_paths(repo_root(), MOD.mod_id)


def ensure_dirs() -> None:
    """
    Create all directories required for generation.
    Safe to call multiple times.
    """
    dirs = [
        PATHS.assets_mod,
        PATHS.textures_item,
        PATHS.textures_block,
        PATHS.models_item,
        PATHS.models_block,
        PATHS.blockstates,
        PATHS.lang,
        PATHS.data_mod,
        PATHS.recipes,
        PATHS.tags_items,
        PATHS.tags_blocks,
        PATHS.loot_tables,
        PATHS.advancements,
        PATHS.logs_dir,
        PATHS.tmp_dir,
    ]
    for d in dirs:
        d.mkdir(parents=True, exist_ok=True)
```

---

## tools/logger_setup.py

```python
from __future__ import annotations

import logging
from logging.handlers import RotatingFileHandler
from pathlib import Path

from tools.config import PATHS


def setup_logger(name: str, level: int = logging.INFO) -> logging.Logger:
    """
    Consistent console + rotating file logging.
    """
    logger = logging.getLogger(name)

    # Avoid double handlers if re-imported
    if logger.handlers:
        return logger

    logger.setLevel(level)

    fmt = logging.Formatter(
        fmt="%(asctime)s | %(levelname)s | %(name)s | %(message)s",
        datefmt="%Y-%m-%d %H:%M:%S",
    )

    console = logging.StreamHandler()
    console.setLevel(level)
    console.setFormatter(fmt)
    logger.addHandler(console)

    log_file: Path = PATHS.logs_dir / "tools.log"
    log_file.parent.mkdir(parents=True, exist_ok=True)

    file_handler = RotatingFileHandler(
        log_file,
        maxBytes=2_000_000,
        backupCount=5,
        encoding="utf-8",
    )
    file_handler.setLevel(logging.DEBUG)
    file_handler.setFormatter(fmt)
    logger.addHandler(file_handler)

    return logger
```

---

## tools/utils/naming_utils.py

```python
from __future__ import annotations

import re


_VALID_ID = re.compile(r"^[a-z0-9_]+$")


def normalize_id(value: str) -> str:
    """
    Convert arbitrary string into a valid Minecraft identifier:
    - lower-case
    - spaces/dashes -> underscores
    - strip invalid characters
    - collapse multiple underscores
    """
    v = value.strip().lower()
    v = v.replace("-", "_").replace(" ", "_")
    v = re.sub(r"[^a-z0-9_]", "", v)
    v = re.sub(r"_+", "_", v)
    v = v.strip("_")
    return v


def assert_valid_id(value: str) -> None:
    """
    Raise ValueError if not a valid Minecraft identifier.
    """
    if not value or not _VALID_ID.match(value):
        raise ValueError(f"Invalid Minecraft id: {value!r}")


def namespaced(mod_id: str, path: str) -> str:
    assert_valid_id(mod_id)
    assert_valid_id(path)
    return f"{mod_id}:{path}"
```

---

## tools/utils/json_utils.py

```python
from __future__ import annotations

import json
from pathlib import Path
from typing import Any

from tools.logger_setup import setup_logger

log = setup_logger(__name__)


def write_json(path: Path, data: Any) -> None:
    """
    Deterministic JSON writer:
    - UTF-8
    - indent=2
    - sort_keys=True
    - newline at EOF
    """
    path.parent.mkdir(parents=True, exist_ok=True)
    encoded = json.dumps(data, ensure_ascii=False, indent=2, sort_keys=True)
    path.write_text(encoded + "\n", encoding="utf-8")
    log.info("Wrote JSON: %s", path.as_posix())


def read_json(path: Path) -> Any:
    return json.loads(path.read_text(encoding="utf-8"))


def is_valid_json(path: Path) -> bool:
    try:
        read_json(path)
        return True
    except Exception:
        return False
```

---
```

Reply **“File 4B”** for Part 2/3 (the JSON generator module).

Citat:
[1] TAoB https://github.com/Mosberg/TAoB

---***---

file 4b

## File 4B — `python_tools_template.md` (Part 2/3)

This part adds the core JSON generation module that produces **block models + blockstates** consistent with Fabric’s documented patterns (cube_all model + single variant blockstate). [1]

```md
---

## tools/generators/json_generator.py

```python
from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Any, Dict, Iterable, List, Optional

from tools.config import MOD, PATHS
from tools.logger_setup import setup_logger
from tools.utils.json_utils import write_json
from tools.utils.naming_utils import assert_valid_id, namespaced

log = setup_logger(__name__)


# ============================================================================
# Data objects (simple typed structures for generation inputs)
# ============================================================================

@dataclass(frozen=True, slots=True)
class ItemDef:
    id: str
    texture_layer0: Optional[str] = None  # if None, uses "taob:item/<id>"
    handheld: bool = False
    display_name: Optional[str] = None


@dataclass(frozen=True, slots=True)
class BlockDef:
    id: str
    texture_all: Optional[str] = None  # if None, uses "taob:block/<id>"
    display_name: Optional[str] = None
    # In the future: add state properties, rotations, multipart, etc.


# ============================================================================
# JSON templates
# ============================================================================

def _item_model_generated(layer0: str) -> Dict[str, Any]:
    return {
        "parent": "item/generated",
        "textures": {"layer0": layer0},
    }


def _item_model_handheld(layer0: str) -> Dict[str, Any]:
    return {
        "parent": "item/handheld",
        "textures": {"layer0": layer0},
    }


def _block_model_cube_all(all_tex: str) -> Dict[str, Any]:
    # Fabric docs show cube_all model generation as the simplest block model. [1]
    return {
        "parent": "block/cube_all",
        "textures": {"all": all_tex},
    }


def _blockstate_single_variant(model_id: str) -> Dict[str, Any]:
    # Fabric docs show that blocks with no properties can use one variant. [1]
    return {
        "variants": {
            "": {"model": model_id}
        }
    }


def _block_item_model_from_block(block_model_id: str) -> Dict[str, Any]:
    return {"parent": block_model_id}


# ============================================================================
# Generators
# ============================================================================

class Generator:
    """
    High-level generator that writes:
    - item models
    - block models
    - blockstates
    - block item models
    - language file entries (optional)
    - recipes (separate helper below)
    """

    def __init__(self) -> None:
        pass

    # ----------------------
    # Items
    # ----------------------

    def write_item_model(self, item: ItemDef) -> Path:
        assert_valid_id(item.id)

        layer0 = item.texture_layer0 or f"{MOD.mod_id}:item/{item.id}"
        model = _item_model_handheld(layer0) if item.handheld else _item_model_generated(layer0)

        out = PATHS.models_item / f"{item.id}.json"
        write_json(out, model)
        return out

    # ----------------------
    # Blocks
    # ----------------------

    def write_block_model(self, block: BlockDef) -> Path:
        assert_valid_id(block.id)

        tex = block.texture_all or f"{MOD.mod_id}:block/{block.id}"
        model = _block_model_cube_all(tex)

        out = PATHS.models_block / f"{block.id}.json"
        write_json(out, model)
        return out

    def write_blockstate(self, block: BlockDef) -> Path:
        assert_valid_id(block.id)

        model_id = f"{MOD.mod_id}:block/{block.id}"
        blockstate = _blockstate_single_variant(model_id)

        out = PATHS.blockstates / f"{block.id}.json"
        write_json(out, blockstate)
        return out

    def write_block_item_model(self, block: BlockDef) -> Path:
        assert_valid_id(block.id)

        parent_model = f"{MOD.mod_id}:block/{block.id}"
        model = _block_item_model_from_block(parent_model)

        out = PATHS.models_item / f"{block.id}.json"
        write_json(out, model)
        return out

    # ----------------------
    # Language
    # ----------------------

    def write_lang_en_us(
        self,
        items: Iterable[ItemDef],
        blocks: Iterable[BlockDef],
        extra: Optional[Dict[str, str]] = None,
        merge_existing: bool = True,
    ) -> Path:
        """
        Writes assets/<modid>/lang/en_us.json.

        merge_existing=True will preserve any existing keys and overwrite only
        keys we generate.
        """
        out = PATHS.lang / "en_us.json"

        data: Dict[str, str] = {}
        if merge_existing and out.exists():
            try:
                import json
                data = json.loads(out.read_text(encoding="utf-8"))
            except Exception:
                # If it's broken, we overwrite it with generated content.
                data = {}

        for it in items:
            if it.display_name:
                data[f"item.{MOD.mod_id}.{it.id}"] = it.display_name

        for bl in blocks:
            if bl.display_name:
                data[f"block.{MOD.mod_id}.{bl.id}"] = bl.display_name

        if extra:
            data.update(extra)

        write_json(out, data)
        return out


# ============================================================================
# Recipes (minimal helpers)
# ============================================================================

def recipe_shaped(
    pattern: List[str],
    key: Dict[str, Dict[str, str]],
    result_item: str,
    count: int = 1,
) -> Dict[str, Any]:
    """
    Create a crafting_shaped recipe JSON dict.

    `key` format example:
      { "A": {"item": "minecraft:stick"}, "B": {"item": "taob:foo"} }
    """
    if not pattern or any(len(r) != len(pattern) for r in pattern):
        raise ValueError("Pattern must be non-empty and all rows same length.")
    if count < 1:
        raise ValueError("Result count must be >= 1.")

    return {
        "type": "minecraft:crafting_shaped",
        "pattern": pattern,
        "key": key,
        "result": {"item": result_item, "count": count},
    }


def recipe_shapeless(
    ingredients: List[Dict[str, str]],
    result_item: str,
    count: int = 1,
) -> Dict[str, Any]:
    if count < 1:
        raise ValueError("Result count must be >= 1.")
    return {
        "type": "minecraft:crafting_shapeless",
        "ingredients": ingredients,
        "result": {"item": result_item, "count": count},
    }


def write_recipe(recipe_id: str, recipe_json: Dict[str, Any]) -> Path:
    assert_valid_id(recipe_id)
    out = PATHS.recipes / f"{recipe_id}.json"
    write_json(out, recipe_json)
    return out
```

---
```

Reply **“File 4C”** for Part 3/3 (the `tools/main.py` orchestrator + optional PNG generator/validator scaffold).

Citat:
[1] Block Model Generation https://docs.fabricmc.net/develop/data-generation/block-models
[2] Block Models https://docs.fabricmc.net/develop/blocks/block-models
[3] Blockstate model data generation (1.21.5) https://www.reddit.com/r/fabricmc/comments/1l9xrew/blockstate_model_data_generation_1215/
[4] Fabric Modding Tutorial - Minecraft 1.21: Blockstates Explained | #13 https://www.youtube.com/watch?v=676AIyk9wBE
[5] i know this most probably isnt the community for it but i cant access blockstates? im making a mod for fabric 1.20.1 and have no idea on how to solve this https://www.reddit.com/r/MinecraftCommands/comments/1c6lord/i_know_this_most_probably_isnt_the_community_for/
[6] Model Predicate Providers (before 1.21.4) https://wiki.fabricmc.net/tutorial:model_predicate_providers
[7] How do I add rotation and blockstates for my block? https://www.reddit.com/r/fabricmc/comments/1o4ldtg/how_do_i_add_rotation_and_blockstates_for_my_block/
[8] Model Generation https://wiki.fabricmc.net/tutorial:datagen_model
[9] Fabric 1.21.1 Modding Tutorial - Data Generation https://www.youtube.com/watch?v=fafTGIVvHHQ
[10] How to make a model provider in 1.21.4 #4273 https://github.com/orgs/FabricMC/discussions/4273
[11] Fabric 1.21.1 Modding Tutorial - Block Entity Renderer https://www.youtube.com/watch?v=8I4moC7F4rM
[12] Adding an Item https://wiki.fabricmc.net/tutorial:items
[13] Minecraft 1.19.1 Fabric Modding Tutorial | CUSTOM BLOCK MODELS | #21 https://www.youtube.com/watch?v=slrd3HKXAsQ
[14] Getting started with Data Generation https://wiki.fabricmc.net/tutorial:datagen_setup
[15] Minecraft 1.18.1 Fabric Modding | BLOCKSTATES EXPLAINED https://www.youtube.com/watch?v=O_QX-59iMuY

---***---

file 4c

## File 4C — `python_tools_template.md` (Part 3/3)

This part includes the orchestrator (`tools/main.py`) and an optional PNG generator/validator scaffold. It also notes that Fabric’s official datagen docs cover recipe + translation generation for **1.21.11**, which is useful as a reference even if you generate JSON with Python. [1]

```md
---

## tools/main.py

```python
from __future__ import annotations

import argparse
import sys
from pathlib import Path
from typing import List

from tools.config import MOD, PATHS, ensure_dirs
from tools.logger_setup import setup_logger
from tools.utils.json_utils import is_valid_json
from tools.utils.naming_utils import normalize_id
from tools.generators.json_generator import (
    BlockDef,
    Generator,
    ItemDef,
    recipe_shaped,
    write_recipe,
)

log = setup_logger(__name__)


def build_default_content() -> tuple[List[ItemDef], List[BlockDef]]:
    """
    Replace this with your actual TAoB registries list or a JSON/YAML source-of-truth.

    The key idea:
    - keep one canonical list of item/block IDs
    - generate assets/data from it deterministically
    """
    items = [
        ItemDef(id="brewing_ingredient", handheld=False, display_name="Brewing Ingredient"),
    ]
    blocks = [
        BlockDef(id="brewing_vat", display_name="Brewing Vat"),
    ]
    return items, blocks


def generate_all() -> None:
    ensure_dirs()

    gen = Generator()

    items, blocks = build_default_content()

    log.info("Generating for mod_id=%s minecraft=%s", MOD.mod_id, MOD.minecraft_version)

    # 1) item models
    for it in items:
        gen.write_item_model(it)

    # 2) block models + states + block-item models
    for bl in blocks:
        gen.write_block_model(bl)
        gen.write_blockstate(bl)
        gen.write_block_item_model(bl)

    # 3) language
    gen.write_lang_en_us(items, blocks, merge_existing=True)

    # 4) example recipe (customize/remove)
    # Brewing vat example shaped recipe
    vat_recipe = recipe_shaped(
        pattern=["CCC", "PCP", "PSP"],
        key={
            "C": {"item": "minecraft:cauldron"},
            "P": {"item": "minecraft:oak_planks"},
            "S": {"item": "minecraft:stick"},
        },
        result_item=f"{MOD.mod_id}:brewing_vat",
        count=1,
    )
    write_recipe("brewing_vat", vat_recipe)


def validate_outputs() -> int:
    """
    Basic validation:
    - JSON parses
    - required directories exist
    More checks can be added (reference checks, png checks, etc.)
    """
    problems = 0

    # JSON parsing check
    for p in list(PATHS.assets_mod.rglob("*.json")) + list(PATHS.data_mod.rglob("*.json")):
        if not is_valid_json(p):
            log.error("Invalid JSON: %s", p.as_posix())
            problems += 1

    if problems == 0:
        log.info("Validation OK")
    else:
        log.error("Validation failed with %d problem(s)", problems)

    return 0 if problems == 0 else 1


def main(argv: List[str]) -> int:
    parser = argparse.ArgumentParser(prog="taob-tools")
    parser.add_argument("--check", action="store_true", help="Validate outputs only; do not generate.")
    args = parser.parse_args(argv)

    if args.check:
        return validate_outputs()

    generate_all()
    return validate_outputs()


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
```

---

## OPTIONAL: tools/generators/png_generator.py

> Only needed if you generate/validate PNG textures via Python.
> If you don’t want Pillow dependency, skip this.

```python
from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Tuple

from tools.logger_setup import setup_logger

log = setup_logger(__name__)

try:
    from PIL import Image  # type: ignore
except Exception:  # pragma: no cover
    Image = None  # type: ignore


@dataclass(frozen=True, slots=True)
class PngRules:
    max_bytes: int = 100_000
    allowed_sizes: Tuple[Tuple[int, int], ...] = ((16, 16), (32, 32), (64, 64), (128, 128))
    allowed_modes: Tuple[str, ...] = ("RGB", "RGBA")


RULES = PngRules()


def validate_png(path: Path) -> bool:
    if Image is None:
        raise RuntimeError("Pillow is not installed. Install with: pip install pillow")

    if not path.exists():
        log.error("PNG missing: %s", path.as_posix())
        return False

    if path.suffix.lower() != ".png":
        log.error("Not a PNG: %s", path.as_posix())
        return False

    size_bytes = path.stat().st_size
    if size_bytes > RULES.max_bytes:
        log.error("PNG too large (%d bytes): %s", size_bytes, path.as_posix())
        return False

    img = Image.open(path)
    if img.mode not in RULES.allowed_modes:
        log.error("Bad PNG mode (%s): %s", img.mode, path.as_posix())
        return False

    if img.size not in RULES.allowed_sizes:
        log.error("Bad PNG size (%s): %s", img.size, path.as_posix())
        return False

    return True


def write_solid_png(path: Path, size: Tuple[int, int], rgba: Tuple[int, int, int, int]) -> None:
    if Image is None:
        raise RuntimeError("Pillow is not installed. Install with: pip install pillow")

    path.parent.mkdir(parents=True, exist_ok=True)
    img = Image.new("RGBA", size, rgba)
    img.save(path, "PNG", optimize=True)
    log.info("Wrote PNG: %s", path.as_posix())
```

---

## Notes: Aligning with official Fabric datagen docs

Fabric’s official docs for **1.21.11** include:
- Recipe generation guidance (providers, shaped/shapeless patterns). [page:0]
- Translation generation guidance (language providers, translation keys). [page:1]

Even when using Python, these docs are useful as a reference for the *kinds* of files and keys you should generate, and how Minecraft expects them to behave.

---
```

### Next files
Reply **“File 5”** to receive `validation_checklist.md`.

Citat:
[1] TAoB https://github.com/Mosberg/TAoB
