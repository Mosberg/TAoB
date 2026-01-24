from __future__ import annotations

from tools.config import ensure_dirs
from tools.generators.json_generator import Generator, ItemDef


def main() -> None:
    ensure_dirs()

    gen = Generator()

    item = ItemDef(
        id="brewing_ingredient",
        handheld=False,
        display_name="Brewing Ingredient",
    )

    gen.write_item_model(item)
    gen.write_lang_en_us([item], [], merge_existing=True)


if __name__ == "__main__":
    main()
