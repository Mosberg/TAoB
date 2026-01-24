from __future__ import annotations

from tools.config import ensure_dirs, MOD
from tools.generators.json_generator import recipe_shaped, write_recipe

def main() -> None:
    ensure_dirs()

    r = recipe_shaped(
        pattern=["CCC", "PCP", "PSP"],
        key={
            "C": {"item": "minecraft:cauldron"},
            "P": {"item": "minecraft:oak_planks"},
            "S": {"item": "minecraft:stick"},
        },
        result_item=f"{MOD.mod_id}:brewing_vat",
        count=1,
    )

    write_recipe("brewing_vat", r)

if __name__ == "__main__":
    main()
