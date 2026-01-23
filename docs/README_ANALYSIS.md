# TAoB Repository Analysis - Documentation Index

Project: **The Art of Brewing** (TAoB)  
Target: **Minecraft Java Edition 1.21.11**, Fabric, Yarn mappings, split-sources.  
Repo: https://github.com/Mosberg/TAoB

## Important note (downloads)
These documents are delivered as text in chat. To “download” them, create files in your local repo and paste the corresponding code block into each filename, then commit and push.

## Document list (6 files)

### 1) README_ANALYSIS.md (this file)
Navigation and “what to do next”.

### 2) ANALYSIS_SUMMARY.md
Executive summary + roadmap (what to implement first, what success looks like).

### 3) taob_analysis.md
Deep technical analysis: how TAoB should structure assets/data + how tools should generate them.

### 4) python_tools_template.md
Complete Python toolchain templates (6 modules) designed to generate assets/data consistently for a Fabric/Yarn split-source mod.

### 5) validation_checklist.md
Concrete checks + scripts to validate JSON, PNG, paths, outputs, and consistency.

### 6) example_implementations.md
Real-world examples (item + block + batch generation patterns).

## Recommended reading order
1. **ANALYSIS_SUMMARY.md** (fast overview, decide scope)
2. **python_tools_template.md** (implement tools)
3. **validation_checklist.md** (verify correctness)
4. **example_implementations.md** (copy patterns into your actual content)
5. **taob_analysis.md** (deep reference)

## What “correct” means for TAoB
Your tooling should reliably generate:
- `src/main/resources/assets/<modid>/...` (textures/models/lang/blockstates)
- `src/main/resources/data/<modid>/...` (recipes/tags/loot_tables/advancements)
- JSON should be valid and stable-formatted (deterministic ordering/indent).
- Texture PNGs should be valid Minecraft textures and match referenced IDs.
- IDs should be stable and follow Minecraft conventions: lowercase `snake_case`.

## How to integrate tools into your workflow
### Option A: Run tools manually
- `python tools/main.py`
- Then run `./gradlew build`

### Option B: Make it part of Gradle (recommended)
- Add a Gradle task that runs `python tools/main.py` before `processResources` or before `build`.
- Keep tools deterministic so CI builds reproduce identical outputs.

## Why the docs mention Yarn + intermediary
In a Loom dev environment you write against Yarn names, but production jars are remapped; Yarn names are development-facing while intermediary names are what exist outside dev. This matters if you do reflection or string-based lookups. [page:0]

## Why the docs mention Fabric datagen
Fabric supports generating JSON-based content programmatically (recipes, tags, loot tables, language, models, etc.) via a datagen entrypoint and `runDatagen`. Even if you keep Python tools, knowing the official datagen pipeline helps align outputs and directory expectations. [page:1]

## Next step
Reply with **“File 2”** to receive `ANALYSIS_SUMMARY.md` in full, then **“File 3”** for `taob_analysis.md`, etc.