file 5

Copy this into your repo as: `validation_checklist.md`

This checklist aligns with Fabric’s guidance that datagen commonly covers JSON-based content like recipes and translations (language entries), even if your pipeline is Python-driven. [1][2][3]

```md
# TAoB Validation Checklist (Python tools + resources)

Target: Minecraft 1.21.11 Fabric, Yarn mappings, split-sources.  
Goal: ensure generated JSON/PNG outputs are valid, correctly located, and internally consistent.

---

## 0) Repo assumptions (must be true)

- You have:
  - `src/main/resources/` for shared resources (assets + data). [web:4]
  - (Optional) `src/client/resources/` for client-only resources in split-source layouts. [page:1]
- You are generating:
  - Resourcepack assets under `assets/<modid>/...`
  - Datapack JSON under `data/<modid>/...`

---

## 1) Configuration consistency

### 1.1 mod_id consistency
- [ ] `mod_id` is one canonical value everywhere.
- [ ] `fabric.mod.json` uses that `id`.
- [ ] Your Python tools use the same `MOD.mod_id`.

### 1.2 Output root policy
Pick ONE and stick to it:
- [ ] A) Generate into `src/main/resources` directly, OR
- [ ] B) Generate into `src/main/generated` and include/merge (recommended, aligns with Fabric datagen defaults). [web:4]

---

## 2) Directory structure validation

After generation, verify these exist:

### 2.1 Resourcepack paths
- [ ] `src/main/resources/assets/<modid>/models/item/`
- [ ] `src/main/resources/assets/<modid>/models/block/`
- [ ] `src/main/resources/assets/<modid>/blockstates/`
- [ ] `src/main/resources/assets/<modid>/textures/item/`
- [ ] `src/main/resources/assets/<modid>/textures/block/`
- [ ] `src/main/resources/assets/<modid>/lang/en_us.json`

### 2.2 Datapack paths
- [ ] `src/main/resources/data/<modid>/recipes/`
- [ ] `src/main/resources/data/<modid>/tags/items/` (if used)
- [ ] `src/main/resources/data/<modid>/tags/blocks/` (if used)
- [ ] `src/main/resources/data/<modid>/loot_tables/` (if used)
- [ ] `src/main/resources/data/<modid>/advancements/` (if used)

---

## 3) JSON validity (syntax)

### 3.1 Required property: valid JSON
- [ ] Every `*.json` file under `src/main/resources/assets/<modid>/` parses.
- [ ] Every `*.json` file under `src/main/resources/data/<modid>/` parses.

#### Script (quick parse check)
Run from repo root:

```bash
python - <<'PY'
import json
from pathlib import Path

roots = [
    Path("src/main/resources"),
    Path("src/client/resources"),
]
roots = [r for r in roots if r.exists()]

bad = 0
for root in roots:
    for p in root.rglob("*.json"):
        try:
            json.loads(p.read_text(encoding="utf-8"))
        except Exception as e:
            bad += 1
            print("BAD JSON:", p, "->", e)

print("DONE. bad =", bad)
raise SystemExit(1 if bad else 0)
PY
```

---

## 4) Model ↔ texture reference checks

Fabric docs show a typical cube_all model uses a texture reference like `<modid>:block/<name>` and blockstate variants map to a model like `<modid>:block/<name>`. [web:47]

### 4.1 Item models
For every file:
`assets/<modid>/models/item/<id>.json`
- [ ] `parent` is one of:
  - `item/generated` (flat)
  - `item/handheld` (tools)  
- [ ] `textures.layer0` exists and points to a file:
  - `assets/<modid>/textures/item/<id>.png` (if you follow 1:1 naming)

### 4.2 Block models + blockstates
For every block `<id>`:
- [ ] `assets/<modid>/models/block/<id>.json` exists.
- [ ] `assets/<modid>/blockstates/<id>.json` exists.
- [ ] blockstate `"variants": { "": { "model": "<modid>:block/<id>" } }` is valid for blocks with no state properties. [web:47]
- [ ] block model uses `block/cube_all` for simple cube blocks. [web:47]
- [ ] referenced texture exists:
  - `assets/<modid>/textures/block/<id>.png`

### 4.3 Cross-check script (models to textures)
```bash
python - <<'PY'
import json
from pathlib import Path

modid = "taob"
assets = Path("src/main/resources/assets") / modid
models_item = assets / "models/item"
models_block = assets / "models/block"
textures = assets / "textures"

bad = 0

def tex_to_path(tex: str) -> Path:
    # tex like "taob:item/foo" or "taob:block/bar"
    ns, rest = tex.split(":", 1)
    if ns != modid:
        return None
    kind, name = rest.split("/", 1)
    return textures / kind / (name + ".png")

for p in list(models_item.rglob("*.json")) + list(models_block.rglob("*.json")):
    data = json.loads(p.read_text(encoding="utf-8"))
    tex = (data.get("textures") or {}).get("layer0") or (data.get("textures") or {}).get("all")
    if not tex:
        continue
    out = tex_to_path(tex)
    if out is None:
        continue
    if not out.exists():
        bad += 1
        print("MISSING TEXTURE for", p, "->", tex, "expected", out)

print("DONE. missing textures =", bad)
raise SystemExit(1 if bad else 0)
PY
```

---

## 5) Blockstate correctness (variants)

If your block has properties (axis/facing/activated/etc.), you must define all variants or use multipart; otherwise the model won’t match for some states. Fabric’s blockstate docs show multiple variant keys when properties exist. [web:80]

- [ ] Blocks without properties: 1 variant `""` is correct.
- [ ] Blocks with properties: variant keys include all states (e.g. `facing=north`, `activated=true`, etc.). [web:80]

---

## 6) Recipe correctness

Fabric’s recipe generation docs cover shaped/shapeless and how providers produce these JSON files. [web:45]

For every `data/<modid>/recipes/<id>.json`:
- [ ] `"type"` exists and is correct (`minecraft:crafting_shaped`, `minecraft:crafting_shapeless`, etc.).
- [ ] Shaped:
  - [ ] `"pattern"` is a list of equal-length strings.
  - [ ] Every pattern symbol (except space) is present in `"key"`.
- [ ] `"result.item"` is namespaced and matches a registered item/block.
- [ ] `"result.count"` is an integer >= 1.

---

## 7) Language file correctness

Fabric’s translation generation docs describe generating translation keys for language files. [page:1]

For `assets/<modid>/lang/en_us.json`:
- [ ] All keys are unique.
- [ ] Keys follow:
  - `item.<modid>.<id>`
  - `block.<modid>.<id>`
- [ ] Values are human-readable names.

---

## 8) PNG validation (optional but recommended)

Texture constraints (recommended):
- [ ] Must be `.png`.
- [ ] Must be RGB or RGBA.
- [ ] Must be 16x16, 32x32, 64x64, or 128x128.
- [ ] Must be reasonably small (< 100 KB recommended).

### 8.1 PNG validation script (requires Pillow)
```bash
python - <<'PY'
from pathlib import Path
from PIL import Image

modid = "taob"
assets = Path("src/main/resources/assets") / modid / "textures"

allowed_sizes = {(16,16), (32,32), (64,64), (128,128)}
allowed_modes = {"RGB", "RGBA"}
max_bytes = 100_000

bad = 0
for p in assets.rglob("*.png"):
    size_bytes = p.stat().st_size
    img = Image.open(p)
    ok = True
    if img.mode not in allowed_modes:
        ok = False
    if img.size not in allowed_sizes:
        ok = False
    if size_bytes > max_bytes:
        ok = False
    if not ok:
        bad += 1
        print("BAD PNG:", p, "mode", img.mode, "size", img.size, "bytes", size_bytes)

print("DONE. bad =", bad)
raise SystemExit(1 if bad else 0)
PY
```

---

## 9) Build integration checks

### 9.1 Manual
- [ ] Run `python tools/main.py`
- [ ] Run `./gradlew build`

### 9.2 CI
- [ ] Add GitHub Actions step that runs:
  - `python tools/main.py --check`
  - `./gradlew build`

---

## 10) Common failure modes (fast diagnosis)

- “Purple/black missing texture”:
  - missing file under `textures/...` or wrong model texture reference.
- “Model not found”:
  - missing block model, wrong blockstate model id, wrong namespace.
- “Recipe not working”:
  - wrong `type`, invalid pattern/key mismatch, wrong result id.
- “Language key displays raw key”:
  - missing translation key or wrong key prefix (`item.<modid>.<id>`).

---
```

Reply **“File 6”** to receive `example_implementations.md`.

Citat:
[1] Data Generation Setup https://docs.fabricmc.net/develop/data-generation/setup
[2] Recipe Generation https://docs.fabricmc.net/develop/data-generation/recipes
[3] TAoB https://github.com/Mosberg/TAoB
[4] Models | NeoForged docs https://docs.neoforged.net/docs/1.20.6/resources/client/models/
[5] [1.9] Can a JSON model have multiple parents? https://forums.minecraftforge.net/topic/39030-19-can-a-json-model-have-multiple-parents/
[6] Block Model Generation https://docs.fabricmc.net/develop/data-generation/block-models
[7] Model Generator - Minecraft 1.20, 1.21, 26.1 https://misode.github.io/assets/model/
[8] Complex Block Models - Minecraft Modding Wiki - Fandom https://mcmodhelp.fandom.com/wiki/Complex_Block_Models
[9] BlockState JSONs/1.18 https://forge.gemwire.uk/wiki/BlockState_JSONs/1.18
[10] Minecraft JSON Recipe Format Explained (All Core ... https://www.youtube.com/watch?v=v5oznXX-8I8
[11] Block Models Breakdown (Custom Models Tutorial) https://www.youtube.com/watch?v=3lECPqoSNeg
[12] BlockState JSONs - Forge Community Wiki https://forge.gemwire.uk/wiki/BlockState_JSONs
[13] Recipes | NeoForged docs https://docs.neoforged.net/docs/resources/server/recipes/
[14] [Question] about Block Models: How to use "parent": "builtin ... https://www.reddit.com/r/Minecraft/comments/6sosew/question_about_block_models_how_to_use_parent/
[15] Block States https://docs.fabricmc.net/develop/blocks/blockstates
[16] Using rich lore JSON format in craft recipe does not work https://www.reddit.com/r/MinecraftCommands/comments/1de6ir3/using_rich_lore_json_format_in_craft_recipe_does/
[17] models - EliteFantasy ResourcePack Guide https://guide.elitefantasy.net/resourcepack-guide/beginning/models
[18] [1.18.1] [Forge] Create BlockStates .json with Variants via code https://www.reddit.com/r/feedthebeast/comments/rm6ayf/1181_forge_create_blockstates_json_with_variants/
