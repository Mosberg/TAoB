from __future__ import annotations

from tools.config import ensure_dirs, MOD
from tools.generators.json_generator import BlockDef, Generator, ItemDef, recipe_shapeless, write_recipe

ITEMS = [
    ItemDef(id="catnip", display_name="Catnip"),
    ItemDef(id="mistleaf", display_name="Mistleaf"),
    ItemDef(id="sunpetal", display_name="Sunpetal"),
]

BLOCKS = [
    BlockDef(id="brewing_vat", display_name="Brewing Vat"),
]

def main() -> None:
    ensure_dirs()
    gen = Generator()

    for it in ITEMS:
        gen.write_item_model(it)

    for bl in BLOCKS:
        gen.write_block_model(bl)
        gen.write_blockstate(bl)
        gen.write_block_item_model(bl)

    gen.write_lang_en_us(ITEMS, BLOCKS, merge_existing=True)

    # Example shapeless recipe: combine 3 herbs => brewing_ingredient
    r = recipe_shapeless(
        ingredients=[
            {"item": f"{MOD.mod_id}:catnip"},
            {"item": f"{MOD.mod_id}:mistleaf"},
            {"item": f"{MOD.mod_id}:sunpetal"},
        ],
        result_item=f"{MOD.mod_id}:brewing_ingredient",
        count=1,
    )
    write_recipe("brewing_ingredient_from_herbs", r)

if __name__ == "__main__":
    main()
