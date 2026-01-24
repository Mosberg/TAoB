from __future__ import annotations

import argparse
import sys
from typing import List

from tools.config import MOD, PATHS, ensure_dirs
from tools.logger_setup import setup_logger
from tools.utils.json_utils import is_valid_json
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
        ItemDef(
            id="brewing_ingredient", handheld=False, display_name="Brewing Ingredient"
        ),
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
    for p in list(PATHS.assets_mod.rglob("*.json")) + list(
        PATHS.data_mod.rglob("*.json")
    ):
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
    parser.add_argument(
        "--check", action="store_true", help="Validate outputs only; do not generate."
    )
    args = parser.parse_args(argv)

    if args.check:
        return validate_outputs()

    # --- New logic: scan textures/ and generate JSON for all PNGs ---
    from pathlib import Path
    from tools.generators.json_generator import ItemDef, BlockDef, Generator
    from tools.utils.naming_utils import normalize_id
    import re

    ensure_dirs()
    gen = Generator()

    # 1. Scan for all PNGs
    pngs = list(PATHS.textures.rglob("*.png"))
    items = []
    blocks = []
    # 2. Classify and collect asset definitions
    for png in pngs:
        rel = png.relative_to(PATHS.textures)
        parts = rel.parts
        # Example: block/barrels/oak_iron_barrel.png or item/flasks/small/small_oak_glass_flask.png
        if parts[0] == "block":
            # block/<category>/<name>.png or block/<name>.png
            block_id = normalize_id("_".join(parts[1:]).replace(".png", ""))
            blocks.append(BlockDef(id=block_id, display_name=None))
        elif parts[0] == "item":
            # item/<category>/<name>.png or item/<name>.png
            item_id = normalize_id("_".join(parts[1:]).replace(".png", ""))
            items.append(ItemDef(id=item_id, handheld=False, display_name=None))
        # Optionally handle overlays, fluids, etc. here if needed

    # Remove duplicates (in case of multiple PNGs for same id)
    items = {i.id: i for i in items}.values()
    blocks = {b.id: b for b in blocks}.values()

    # 3. Generate JSON files for all found assets
    for it in items:
        gen.write_item_model(it)
    for bl in blocks:
        gen.write_block_model(bl)
        gen.write_blockstate(bl)
        gen.write_block_item_model(bl)

    # 4. Update lang file (names will be auto-generated if not present)
    gen.write_lang_en_us(items, blocks, merge_existing=True)

    return validate_outputs()


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
