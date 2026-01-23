file 3

Copy this into your repo as: `taob_analysis.md`

```md
# TAoB Repository Analysis (Deep Technical)

Project: The Art of Brewing (TAoB)  
Target: Minecraft Java 1.21.11, Fabric, Yarn mappings, split-sources.

This document is a deep technical reference for how TAoB should structure resources/data and how Python tooling in `tools/` should generate correct, consistent files.

---

## Repository shape (expected)

A modern Fabric project uses `src/main/resources` for shared resources and `src/client/resources` for client-only resources. [page:1]

A split-sources setup typically looks like:

- `src/main/java/...` common code (runs on server + client)
- `src/client/java/...` client-only code
- `src/main/resources/...` common resources
- `src/client/resources/...` client-only resources [page:1]

### Where datagen fits
Fabric supports a “data generation” system for JSON-based content (recipes, advancements, tags, models, lang, loot tables, etc.). [page:0]  
When using Fabric’s datagen task (`./gradlew runDatagen`), output is typically placed in `src/main/generated`. [page:0]

TAoB can:
- Use Java/Fabric datagen (official) and commit generated output, or
- Use Python tools to generate directly into `src/main/resources`, or
- Use Python to generate into `src/main/generated` and have Gradle include it.

---

## Asset and data layouts (must match MC expectations)

### Resourcepack side: `assets/<modid>`
All client-visible assets live here (textures, models, blockstates, lang).

Paths (for `modid = taob`):
- `src/main/resources/assets/taob/lang/en_us.json`
- `src/main/resources/assets/taob/models/item/<id>.json`
- `src/main/resources/assets/taob/models/block/<id>.json`
- `src/main/resources/assets/taob/textures/item/<id>.png`
- `src/main/resources/assets/taob/textures/block/<id>.png`
- `src/main/resources/assets/taob/blockstates/<id>.json`

Fabric’s project-structure guide explicitly notes that `src/main/resources` stores textures/models and mirrors resource-pack structure. [page:1]

### Datapack side: `data/<modid>`
Game data (recipes, tags, loot tables, advancements).

- `src/main/resources/data/taob/recipes/<id>.json`
- `src/main/resources/data/taob/tags/items/<tag>.json`
- `src/main/resources/data/taob/tags/blocks/<tag>.json`
- `src/main/resources/data/taob/loot_tables/...`
- `src/main/resources/data/taob/advancements/...`

---

## What your Python tooling must guarantee

### Hard requirements
- Deterministic output (same input => same file bytes).
- Stable formatting: 2-space indent, sorted keys, newline at EOF.
- Valid JSON (parseable).
- Asset references exist:
  - model -> texture
  - blockstate -> model
  - recipe -> item IDs are valid and registered
- ID normalization: lowercase snake_case.

### Output policy (recommended)
Avoid clobbering hand-edited resources:
- Either generate everything into `src/main/generated` and copy/merge into `src/main/resources` deliberately, aligning with Fabric datagen’s default output location. [page:0]
- Or mark certain directories as generated-only.

---

## Split-sources implications

### Client vs common resources
- If a resource is only used client-side, it can live in `src/client/resources`.
- If it is needed by the server too (most JSON data pack files), keep it in `src/main/resources`.

Fabric notes the dedicated `src/client/resources` folder for client-only resources. [page:1]  
In practice, *textures/models/lang* are always client concerns, but it’s still common to ship them from `src/main/resources` so the built jar includes everything; only truly client-exclusive assets belong in `src/client/resources`.

### Datagen entrypoint placement (Java datagen)
Fabric’s datagen setup guide demonstrates a datagen entrypoint class placed under `src/client/java/.../datagen/...` and registered via the `fabric-datagen` entrypoint in `fabric.mod.json`. [page:0]  
If you later choose Java datagen, TAoB should follow this.

---

## File-type specifics (what “correct” means)

### 1) Item model JSON
Common pattern for flat items:
```json
{
  "parent": "item/generated",
  "textures": {
    "layer0": "taob:item/<id>"
  }
}
```

Tooling responsibilities:
- Create the model json under `assets/taob/models/item/<id>.json`
- Ensure the referenced texture exists at `assets/taob/textures/item/<id>.png`

### 2) Block model JSON + blockstate JSON
A simple cube block:
```json
{
  "parent": "block/cube_all",
  "textures": {
    "all": "taob:block/<id>"
  }
}
```

And corresponding blockstate:
```json
{
  "variants": {
    "": { "model": "taob:block/<id>" }
  }
}
```

Tooling responsibilities:
- Generate `assets/taob/models/block/<id>.json`
- Generate `assets/taob/blockstates/<id>.json`
- Ensure texture exists at `assets/taob/textures/block/<id>.png`
- Generate item model for the block item either as:
```json
{ "parent": "taob:block/<id>" }
```
under `assets/taob/models/item/<id>.json`

### 3) Language file
`assets/taob/lang/en_us.json`:
- Keys should follow Minecraft conventions:
  - `item.taob.<id>`
  - `block.taob.<id>`
  - optionally `itemGroup.taob...`, etc.
- Tool should merge entries (preserve existing keys unless explicitly overwritten).

### 4) Recipes
Shaped crafting:
```json
{
  "type": "minecraft:crafting_shaped",
  "pattern": ["ABC", "DEF", "GHI"],
  "key": {
    "A": { "item": "minecraft:stick" }
  },
  "result": { "item": "taob:<id>", "count": 1 }
}
```

Tooling responsibilities:
- Validate:
  - `pattern` rows are same length
  - keys used in pattern are defined
  - item IDs are namespaced (`minecraft:` or `taob:`)
- Output in `data/taob/recipes/<id>.json`

---

## Tool design: architecture + style constraints

### Suggested tool tree
```
tools/
  config.py
  logger_setup.py
  main.py
  generators/
    json_generator.py
    png_generator.py
  utils/
    naming_utils.py
    path_utils.py
    json_utils.py
  validators/
    json_validator.py
    png_validator.py
```

### Code style expectations (matches your preferences)
- `pathlib.Path` everywhere.
- No hardcoded absolute paths.
- All writes go through a single `write_json(path, data)` helper with:
  - indent=2, sort_keys=True, ensure_ascii=False
- Strong logging:
  - “Generating X -> path”
  - “Validating X -> ok/fail”
- Fail-fast mode (`--check` to validate only).

---

## How this aligns with Fabric’s official approach

Fabric’s datagen guide defines datagen as programmatic generation for “recipes, advancements, tags, item models, language files, loot tables, and basically anything JSON-based.” [page:0]  
It also states `./gradlew runDatagen` outputs to `src/main/generated`. [page:0]

Even if TAoB uses Python generation, aligning with this separation makes your repo easier to maintain:
- Generated outputs are identifiable.
- The build can include generated resources consistently.

---

## Practical recommendation for TAoB

### Recommended approach (best balance)
- Generate into `src/main/generated` (Python), then either:
  - Copy into `src/main/resources` only for files you want committed, or
  - Configure Gradle to include `src/main/generated` in resources.

This mirrors Fabric’s documented datagen output location, improving long-term maintainability. [page:0]

### Minimum “safe” approach
- Generate only into clearly marked generated directories:
  - `assets/taob/models/generated/...`
  - `data/taob/recipes/generated/...`
…but note: Minecraft expects many resources in exact canonical locations (e.g., models must be in `models/item`), so prefer the `src/main/generated` separation.

---

## Next file
Reply **“File 4”** to receive `python_tools_template.md` (the 6-module Python toolchain).
```

Reply **“File 4”** and I’ll deliver the next file.

