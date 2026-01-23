file 6

Copy this into your repo as: `example_implementations.md`

These examples follow Fabric’s documented concepts for blockstates “variants” (single variant for blocks without properties; multiple variants when properties exist). [1][2] They also align with Fabric’s recipe generation guidance (shaped/shapeless patterns) even though we’re writing JSON directly via Python. [3]

```md
# TAoB Example Implementations (Python tools)

Target: Minecraft 1.21.11 Fabric + Yarn + split-sources.  
Purpose: show realistic “copy, adapt, run” patterns using the tool templates from `python_tools_template.md`.

---

## Example A — Minimal item (flat model + lang)

### Goal
Create:
- `assets/taob/models/item/brewing_ingredient.json`
- (optional) `assets/taob/textures/item/brewing_ingredient.png`
- `assets/taob/lang/en_us.json` entry

### Code
Create `tools/examples/example_item.py`:

```python
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
```

Run:
```bash
python tools/examples/example_item.py
```

---

## Example B — Minimal cube block (block model + blockstate + item model + lang)

### Why this matters
Every block needs a blockstate definition; for blocks with no properties it can be a single variant. [web:80][web:84]

### Goal
Create:
- `assets/taob/models/block/brewing_vat.json` (cube_all)
- `assets/taob/blockstates/brewing_vat.json` (single variant)
- `assets/taob/models/item/brewing_vat.json` (block item model points at block model)
- `assets/taob/lang/en_us.json` entry

### Code
Create `tools/examples/example_block_cube.py`:

```python
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
```

Run:
```bash
python tools/examples/example_block_cube.py
```

---

## Example C — Recipe (shaped) for brewing_vat

Fabric’s recipe docs explain shaped/shapeless patterns; your Python generator writes the equivalent JSON. [web:45]

### Goal
Create:
- `data/taob/recipes/brewing_vat.json`

### Code
Create `tools/examples/example_recipe.py`:

```python
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
```

Run:
```bash
python tools/examples/example_recipe.py
```

---

## Example D — Block with a property (variants example)

If your block has a boolean property like `activated`, blockstates must include all variants you intend to support. Fabric’s blockstate docs show variant keys like `activated=false` and `activated=true`. [web:80]

This example shows how you’d *manually* generate such a blockstate JSON using `write_json`.

Create `tools/examples/example_blockstates_variants.py`:

```python
from __future__ import annotations

from tools.config import ensure_dirs, MOD, PATHS
from tools.utils.json_utils import write_json

def main() -> None:
    ensure_dirs()

    block_id = "fermenter"
    # You would also generate:
    # - models/block/fermenter.json
    # - models/block/fermenter_on.json
    # and textures, etc.

    blockstate = {
        "variants": {
            "activated=false": {"model": f"{MOD.mod_id}:block/{block_id}"},
            "activated=true":  {"model": f"{MOD.mod_id}:block/{block_id}_on"},
        }
    }

    write_json(PATHS.blockstates / f"{block_id}.json", blockstate)

if __name__ == "__main__":
    main()
```

Run:
```bash
python tools/examples/example_blockstates_variants.py
```

---

## Example E — Batch generation pattern

This pattern is the scalable way: define a “source of truth” list and generate everything from it.

Create `tools/examples/example_batch.py`:

```python
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
```

Run:
```bash
python tools/examples/example_batch.py
```

---

## “Does it work?” quick checks

1) JSON parse check:
```bash
python tools/main.py --check
```

2) Ensure files exist:
- `src/main/resources/assets/taob/models/item/*.json`
- `src/main/resources/assets/taob/models/block/*.json`
- `src/main/resources/assets/taob/blockstates/*.json`
- `src/main/resources/data/taob/recipes/*.json`

---

## Next step
At this point you have all 6 documents delivered (Files 1–6).

If you want, share:
- your actual `mod_id` in `gradle.properties`
- a list of TAoB items/blocks you want generated

…and the generator can be adapted to read from a single schema (JSON/YAML) so you never hardcode lists in Python.
```

You now have Files 1–6 delivered. If you want, paste your `gradle.properties` and `fabric.mod.json` (or just the `mod_id`, package base, and any planned item/block IDs), and I’ll tailor `tools/main.py`’s `build_default_content()` to your real TAoB content list.

Citat:
[1] Block States https://docs.fabricmc.net/develop/blocks/blockstates
[2] Giving a block state https://wiki.fabricmc.net/tutorial:blockstate
[3] Recipe Generation https://docs.fabricmc.net/develop/data-generation/recipes
[4] Block Model Generation https://docs.fabricmc.net/develop/data-generation/block-models
[5] Block Models https://docs.fabricmc.net/develop/blocks/block-models
[6] Adding a Block https://wiki.fabricmc.net/tutorial:blocks
[7] Updating Yarn and intermediary to a new Minecraft version https://wiki.fabricmc.net/tutorial:updating_yarn
[8] Adding a BlockEntity https://wiki.fabricmc.net/tutorial:blockentity
[9] Recipe Generation https://wiki.fabricmc.net/tutorial:datagen_recipe
[10] Fabric Loom https://wiki.fabricmc.net/documentation:fabric_loom
[11] Model Generation https://wiki.fabricmc.net/tutorial:datagen_model
[12] Creating a Custom Recipe Type https://wiki.fabricmc.net/tutorial:recipe_type
[13] Mappings https://wiki.fabricmc.net/tutorial:mappings
[14] Rendering Blocks and Items Dynamically using a custom ... https://wiki.fabricmc.net/tutorial:custom_model
[15] Recipe Documentation - Shapeless Recipe https://learn.microsoft.com/en-us/minecraft/creator/reference/content/recipereference/examples/recipedefinitions/minecraftrecipe_shapeless?view=minecraft-bedrock-stable
