from __future__ import annotations

from tools.config import ensure_dirs
from tools.generators.json_generator import Generator, BlockDef


def main() -> None:
    ensure_dirs()
    gen = Generator()

    block = BlockDef(
        id="brewing_vat",
        display_name="Brewing Vat",
    )

    gen.write_block_model(block)
    gen.write_blockstate(block)
    gen.write_block_item_model(block)
    gen.write_lang_en_us([], [block], merge_existing=True)


if __name__ == "__main__":
    main()
