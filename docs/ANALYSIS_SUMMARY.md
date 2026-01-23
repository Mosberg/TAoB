# TAoB Repository Analysis — Summary

Target: Minecraft Java 1.21.11, Fabric, Yarn mappings, split-sources mod “The Art of Brewing”.

This summary explains what to implement, why it matters, and the recommended tool architecture for generating assets/data reliably.

---

## Core goals

- Keep your generated assets/data deterministic and correctly structured under `src/main/resources`.  
- Ensure generated JSON references (models ↔ textures, blockstates ↔ models, recipes ↔ items) always match.  
- Make the tools fit a split-sources Fabric project (main/client/datagen sources) without “inventing” directories.

---

## Key constraints (Fabric/Yarn)

- In a normal Loom dev environment, **Yarn** names are used to provide meaningful names for Minecraft code, while **intermediary** is the stable mapping used by Fabric; Yarn names are dev-only, and outside dev only intermediary names exist—important if doing reflection or string-based lookups. [web:13][web:55]  
- Fabric’s official data generation workflow is run via `./gradlew runDatagen`, and generated files are created under `src/main/generated` by default. [web:4]

(Your Python tools can still output into `src/main/resources` directly; just keep it clean and deterministic, and optionally adopt `src/main/generated` as an intermediate output like Fabric does.)

---

## What should be generated (minimum)

### Assets (resource pack side)
`src/main/resources/assets/<modid>/`
- `textures/item/*.png`
- `textures/block/*.png`
- `models/item/*.json`
- `models/block/*.json`
- `blockstates/*.json`
- `lang/en_us.json`

### Data (data pack side)
`src/main/resources/data/<modid>/`
- `recipes/*.json`
- `loot_tables/**/*.json` (if applicable)
- `tags/items/*.json`, `tags/blocks/*.json` (if applicable)
- `advancements/**/*.json` (if applicable)

---

## Recommended Python tool architecture

Keep tools in `tools/` and design them like a small build system:

- `tools/config.py`
  - Reads/defines `MOD_ID`, and paths computed from repo root using `pathlib.Path`.
- `tools/logger_setup.py`
  - Consistent logs; tool output should be auditable.
- `tools/utils/`
  - Naming normalization, path helpers, JSON writing helpers.
- `tools/generators/`
  - `json_generator.py`: item models, block models, blockstates, recipes, tags, lang.
  - `png_generator.py`: validate/generate textures.
- `tools/main.py`
  - Orchestrator: ensure dirs, generate everything, validate outputs, fail fast.

---

## Deterministic output rules (important)

1. Always write JSON with:
   - UTF-8
   - fixed indentation (2 spaces)
   - stable key ordering (sort keys)  
2. Normalize every identifier to `lower_snake_case`.
3. Never overwrite user-authored files unless explicitly allowed:
   - Either generate into `src/main/generated` (recommended), then copy/merge,
   - Or keep a strict “generated-only” sub-tree.
4. Validate after generation:
   - JSON parses
   - Files exist where referenced
   - PNG dimensions and mode are correct

---

## Integration options

### Option A: run manually
- `python tools/main.py`
- `./gradlew build`

### Option B: integrate into Gradle
- Add a Gradle task that runs the Python generator before `processResources` / `build`.
- Fail build if generator validation fails.

### Option C: use Fabric datagen for “official” pieces
Fabric datagen setup includes a `runDatagen` task and a `fabric-datagen` entrypoint. [web:4]  
You can mix approaches: use Java datagen for registries/tags/recipes and Python only for textures/models/lang if you prefer.

---

## Roadmap (practical)

### Phase 1 — foundation (1 session)
- Create `tools/config.py` with correct repo-root path resolution.
- Create safe JSON write helpers and logging.

### Phase 2 — models + lang
- Generate `models/item` for items and `models/block` for blocks.
- Generate `blockstates` for blocks.
- Generate or merge `lang/en_us.json`.

### Phase 3 — data pack JSON
- Generate recipes/tags/loot tables/advancements as needed.

### Phase 4 — validation + CI
- Add `python tools/main.py --check` mode (validate only).
- Run it in GitHub Actions before builds.

---

## Success criteria

- `python tools/main.py` produces **no warnings/errors** and exits 0.
- Every model’s texture path exists as a `.png`.
- Every blockstate references an existing model.
- All JSON files parse.
- Minecraft launches in dev and assets appear correctly.
- No accidental overwrites of hand-edited files.

---

## Next file
Reply **“File 3”** to receive `taob_analysis.md` (deep technical analysis).