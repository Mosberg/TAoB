from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Any, Dict, Iterable, List, Optional

from tools.config import MOD, PATHS
from tools.logger_setup import setup_logger
from tools.utils.json_utils import write_json
from tools.utils.naming_utils import assert_valid_id

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
    return {"variants": {"": {"model": model_id}}}


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
        model = (
            _item_model_handheld(layer0)
            if item.handheld
            else _item_model_generated(layer0)
        )

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
