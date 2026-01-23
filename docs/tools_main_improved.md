'''json
{
  "schemaVersion": 1,
  "id": "${mod_id}",
  "version": "${mod_version}",
  "name": "${mod_name}",
  "description": "${mod_description}",
  "authors": ["${mod_author}"],
  "contact": {
    "homepage": "${mod_homepage}",
    "sources": "${mod_sources}",
    "issues": "${mod_issues}"
  },
  "license": "${mod_license}",
  "icon": "icon.png",
  "environment": "*",
  "entrypoints": {
    "main": ["dk.mosberg.taob.TAoB"],
    "client": ["dk.mosberg.taob.client.TAoBClient"],
    "fabric-datagen": ["dk.mosberg.taob.client.datagen.TAoBDataGenerator"]
  },
  "depends": {
    "fabricloader": ">=${loader_version}",
    "minecraft": "${minecraft_version}",
    "java": ">=${java_version}",
    "fabric-api": "*"
  }
}
'''

'''properties
# ═══════════════════════════════════════════════════════════════════════════════
# Gradle JVM Configuration - Optimized for Fabric Development
# ═══════════════════════════════════════════════════════════════════════════════

org.gradle.jvmargs=-Xmx4G -XX:+UseG1GC -XX:+ParallelRefProcEnabled -XX:MaxGCPauseMillis=200
org.gradle.parallel=true
org.gradle.caching=true
org.gradle.configuration-cache=true

# ═══════════════════════════════════════════════════════════════════════════════
# Mod Metadata
# ═══════════════════════════════════════════════════════════════════════════════

maven_group=dk.mosberg.taob
archives_base_name=taob

mod_id=taob
mod_version=1.0.0
mod_name=The Art of Brewing
mod_description=The Art of Brewing adds a variety of new brewing mechanics, alcohol beverages and recipes to enhance the potion-making experience in Minecraft by expanding the possibilities of potion creation with alcoholic beverages.
mod_author=Mosberg
mod_homepage=https://mosberg.github.io/TAoB
mod_sources=https://github.com/mosberg/TAoB
mod_issues=https://github.com/mosberg/TAoB/issues
mod_license=MIT

# ═══════════════════════════════════════════════════════════════════════════════
# Minecraft & Fabric Versions
# ═══════════════════════════════════════════════════════════════════════════════

minecraft_version=1.21.11
yarn_mappings=1.21.11+build.4
loader_version=0.18.4
loom_version=1.15-SNAPSHOT
fabric_version=0.141.1+1.21.11
java_version=21

# ═══════════════════════════════════════════════════════════════════════════════
# Library Versions
# ═══════════════════════════════════════════════════════════════════════════════

gson_version=2.13.2
slf4j_version=2.0.17
annotations_version=26.0.2

# ═══════════════════════════════════════════════════════════════════════════════
# Testing Framework
# ═══════════════════════════════════════════════════════════════════════════════

junit_version=6.0.2
'''

item/block IDs should automatically be generated based of the textures/ *.png names.

so tailor `tools/main.py`’s `build_default_content()` to your real TAoB content list.

Got it. With your `mod_id=taob`, package base `dk.mosberg.taob`, and the requirement “IDs are derived from texture PNG filenames”, the right approach is:

- Scan `src/main/resources/assets/taob/textures/item/*.png` and `.../textures/block/*.png`
- Derive IDs from the filenames (without `.png`)
- Normalize to valid Minecraft IDs (lowercase snake_case)
- Generate:
  - item models for every item texture
  - block models + blockstates + block-item models for every block texture
  - optional lang entries (either generated display names from IDs, or only for missing keys)

Below is a **tailored replacement** for `tools/main.py` that implements that.  
It assumes you already have the modules from File 4A/4B/4C in place (especially `config.py`, `naming_utils.py`, `json_generator.py`).

> Note: This does not infer “is_handheld”; it defaults items to flat `item/generated`. You can add a heuristic (e.g. filenames ending with `_sword`, `_axe`) later.

### `tools/main.py` (replace entirely)

```python
from __future__ import annotations

import argparse
import sys
from pathlib import Path
from typing import Iterable, List, Tuple

from tools.config import MOD, PATHS, ensure_dirs
from tools.logger_setup import setup_logger
from tools.utils.json_utils import is_valid_json, read_json
from tools.utils.naming_utils import normalize_id, assert_valid_id
from tools.generators.json_generator import (
    BlockDef,
    Generator,
    ItemDef,
)

log = setup_logger(__name__)


def _iter_png_ids(dir_path: Path) -> List[str]:
    """
    Return sorted list of normalized IDs derived from *.png filenames in dir_path.
    """
    if not dir_path.exists():
        return []

    ids: List[str] = []
    for p in dir_path.glob("*.png"):
        stem = p.stem  # filename without .png
        norm = normalize_id(stem)

        # If a filename normalizes to empty or invalid, fail fast
        assert_valid_id(norm)

        ids.append(norm)

    # Deduplicate + deterministic ordering
    return sorted(set(ids))


def build_default_content() -> Tuple[List[ItemDef], List[BlockDef]]:
    """
    Real TAoB content list derived from existing textures:

    - Items from:  assets/taob/textures/item/*.png
    - Blocks from: assets/taob/textures/block/*.png

    ID = normalized png stem.
    """
    item_ids = _iter_png_ids(PATHS.textures_item)
    block_ids = _iter_png_ids(PATHS.textures_block)

    items = [
        ItemDef(
            id=i,
            handheld=False,
            # If you want auto display names: "brewing_vat" -> "Brewing Vat"
            # Set display_name=None to avoid touching lang file automatically.
            display_name=None,
        )
        for i in item_ids
    ]

    blocks = [
        BlockDef(
            id=b,
            display_name=None,
        )
        for b in block_ids
    ]

    log.info("Discovered %d item texture(s) in %s", len(items), PATHS.textures_item.as_posix())
    log.info("Discovered %d block texture(s) in %s", len(blocks), PATHS.textures_block.as_posix())

    if items:
        log.debug("Item IDs: %s", ", ".join(i.id for i in items))
    if blocks:
        log.debug("Block IDs: %s", ", ".join(b.id for b in blocks))

    return items, blocks


def _merge_lang_entries(
    out_path: Path,
    new_entries: dict[str, str],
) -> None:
    """
    Merge new entries into existing en_us.json without overwriting existing keys.
    """
    base: dict[str, str] = {}
    if out_path.exists() and is_valid_json(out_path):
        existing = read_json(out_path)
        if isinstance(existing, dict):
            # ensure string->string only
            base = {str(k): str(v) for k, v in existing.items()}

    for k, v in new_entries.items():
        base.setdefault(k, v)  # do NOT overwrite

    from tools.utils.json_utils import write_json
    write_json(out_path, base)


def _title_case_from_id(id_: str) -> str:
    return " ".join(part.capitalize() for part in id_.split("_") if part)


def generate_all(generate_lang_missing: bool) -> None:
    ensure_dirs()
    gen = Generator()

    items, blocks = build_default_content()

    log.info("Generating assets/data for mod_id=%s minecraft=%s", MOD.mod_id, MOD.minecraft_version)

    # 1) Item models from item textures
    for it in items:
        gen.write_item_model(it)

    # 2) Block model + blockstate + block item model from block textures
    for bl in blocks:
        gen.write_block_model(bl)
        gen.write_blockstate(bl)
        gen.write_block_item_model(bl)

    # 3) Language: optional “fill missing” mode
    if generate_lang_missing:
        lang_path = PATHS.lang / "en_us.json"
        auto_entries: dict[str, str] = {}

        for it in items:
            auto_entries[f"item.{MOD.mod_id}.{it.id}"] = _title_case_from_id(it.id)

        for bl in blocks:
            auto_entries[f"block.{MOD.mod_id}.{bl.id}"] = _title_case_from_id(bl.id)

        _merge_lang_entries(lang_path, auto_entries)
        log.info("Language merge complete (missing keys only): %s", lang_path.as_posix())


def validate_outputs() -> int:
    problems = 0

    # JSON parsing check
    for p in list(PATHS.assets_mod.rglob("*.json")) + list(PATHS.data_mod.rglob("*.json")):
        if not is_valid_json(p):
            log.error("Invalid JSON: %s", p.as_posix())
            problems += 1

    # Reference checks: ensure every item model references an existing texture (layer0)
    # and every cube_all block model references an existing texture ("all").
    import json

    def _tex_exists(tex_ref: str) -> bool:
        # expects "taob:item/name" or "taob:block/name"
        try:
            ns, rest = tex_ref.split(":", 1)
            kind, name = rest.split("/", 1)
        except ValueError:
            return False
        if ns != MOD.mod_id:
            return True  # allow external namespaces
        expected = PATHS.textures / kind / f"{name}.png"
        return expected.exists()

    for p in PATHS.models_item.rglob("*.json"):
        data = json.loads(p.read_text(encoding="utf-8"))
        tex = (data.get("textures") or {}).get("layer0")
        if isinstance(tex, str) and not _tex_exists(tex):
            log.error("Missing referenced item texture: %s -> %s", p.as_posix(), tex)
            problems += 1

    for p in PATHS.models_block.rglob("*.json"):
        data = json.loads(p.read_text(encoding="utf-8"))
        tex = (data.get("textures") or {}).get("all")
        if isinstance(tex, str) and not _tex_exists(tex):
            log.error("Missing referenced block texture: %s -> %s", p.as_posix(), tex)
            problems += 1

    # Blockstates -> block models
    for p in PATHS.blockstates.rglob("*.json"):
        data = json.loads(p.read_text(encoding="utf-8"))
        variants = data.get("variants") or {}
        v = variants.get("") or {}
        model = v.get("model")
        if isinstance(model, str) and model.startswith(f"{MOD.mod_id}:block/"):
            model_name = model.split("/", 1)[1]
            expected = PATHS.models_block / f"{model_name}.json"
            if not expected.exists():
                log.error("Missing referenced block model: %s -> %s", p.as_posix(), expected.as_posix())
                problems += 1

    if problems == 0:
        log.info("Validation OK")
        return 0

    log.error("Validation failed with %d problem(s)", problems)
    return 1


def main(argv: List[str]) -> int:
    parser = argparse.ArgumentParser(prog="taob-tools")
    parser.add_argument("--check", action="store_true", help="Validate outputs only; do not generate.")
    parser.add_argument(
        "--lang-missing",
        action="store_true",
        help="Generate language entries only for missing keys (does not overwrite).",
    )
    args = parser.parse_args(argv)

    if args.check:
        return validate_outputs()

    generate_all(generate_lang_missing=args.lang_missing)
    return validate_outputs()


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
```

### Usage

From repo root:

```bash
# generate models/blockstates from existing textures
python tools/main.py

# generate and also fill missing lang keys (without overwriting existing ones)
python tools/main.py --lang-missing

# validate only
python tools/main.py --check
```

### One important question
Should **block item models** be generated from *block textures* even if you don’t have a corresponding registered BlockItem yet? (Current script does generate them.)

