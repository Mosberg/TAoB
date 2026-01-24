# TAoB Mod Improvement Suggestions

Below is a “fix-first, extend-second” documentation set for TAoB, focused on changes that will make the mod production-safe, easier to scale, and closer to true data-pack-driven behavior.

## Resource loading & packaging

Right now TAoB loads “tag” JSON using hard-coded filesystem paths like `src/main/resources/...`, which will not exist when the mod is shipped as a JAR. See `TagLoader.loadIds("src/main/resources/data/taob/tags/...")` usage in [`TAoB.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/TAoB.java) and the `FileReader` implementation in [`TagLoader.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/TagLoader.java).
Implement a server-data reload listener (`ResourceManagerHelper.get(ResourceType.SERVER_DATA)` + `SimpleSynchronousResourceReloadListener`) and read resources via `ResourceManager` + `Identifier` instead of `FileReader` paths, so your “data-driven” content works in dev, JAR, and data packs. [`TagLoader.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/TagLoader.java)

Practical improvements:

- Replace `TagLoader.loadIds(String filePath)` with `TagLoader.loadIds(ResourceManager rm, Identifier id)` and load from e.g. `new Identifier("taob", "tags/barrels.json")`. [`TagLoader.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/TagLoader.java)
- Add validation + fail-fast: don’t `e.printStackTrace()`; log and surface which identifier failed, and decide whether to abort load or skip entry. [`TagLoader.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/TagLoader.java)

## Data-pack alignment (tags, recipes, loot)

You already have proper data-pack folder roots like `src/main/resources/data/taob/containers`, `.../recipes`, `.../loot_tables`, and `.../tags`, which is a good base. The repo tree shows these directories exist under `src/main/resources/data/taob/`.
To improve modpack compatibility, prefer **vanilla** systems where possible: real Minecraft tags in `data/taob/tags/{items,blocks,fluids}/...` and vanilla recipes as JSON under `data/taob/recipes/...`, instead of custom “tag list” files + manual scanning.

Practical improvements:

- Split your current custom `tags/*.json` lists into standard tag folders (e.g., barrels → `tags/blocks/barrels.json`, flasks → `tags/items/flasks_small.json`, etc.).
- Keep your “containers/\*.json” as your mod’s custom data, but load it via `ResourceManager` so datapacks can override/extend it cleanly.

## Registration & recipe handling

`scanAndRegisterRecipes()` currently constructs paths under `src/main/resources/data/taob/recipes/...` and calls `RecipeRegistrar.registerRecipe(...)`. [`TAoB.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/TAoB.java)
But `RecipeRegistrar` is explicitly a stub that only parses JSON and logs “Loaded recipe”, with a `TODO` to actually register anything. [`RecipeRegistrar.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/RecipeRegistrar.java)

Recommended direction:

- If recipes are vanilla crafting/smelting/etc., delete the runtime “recipe registration” path entirely and just ship JSON recipes (Minecraft loads them automatically). [`RecipeRegistrar.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/RecipeRegistrar.java)
- If you truly need dynamic recipes, implement a proper custom recipe type + serializer and load it through the normal data-pack recipe pipeline (still JSON-driven, but via the recipe manager), rather than ad-hoc file reading. [`RecipeRegistrar.java`](https://github.com/Mosberg/TAoB/blob/main/src/main/java/dk/mosberg/taob/util/RecipeRegistrar.java)

## Container schema improvements

Your container JSONs are already detailed (capacity, transfer amounts, interaction rules, UI ordering), but you can reduce duplication and make toggles real rather than incidental. [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)
A clean next step is adding a `features` block (sealing, locking, comparator, automation) and making actions check features directly, while also removing duplicated sound fields (`fill_sound` + `sounds.fill.id`). [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)

Concrete upgrades:

- Introduce a `features` object (example: `features: { "sealing": true, "locking": true }`) and gate `seal/unseal/toggle_lock` on it. [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)
- Normalize one sound format (prefer `sounds.*` and drop `*_sound` fields) to avoid drift. [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)
- Replace “magic threshold” numbers (like “capacity minus transfer plus 1”) with intent fields (`requires_free_capacity`, `min_amount`) and compute thresholds inside code. [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)

## Documentation & project hygiene

Your README sets an ambitious scope (advanced brewing mechanics, dynamic registration, schema/templates), so the docs should reflect what’s implemented today vs what’s planned. See the feature list and “Technical & Modding Patterns” section in [`README.md`](https://github.com/Mosberg/TAoB/blob/main/README.md).
Also, `docs/data-files.md` currently contains a review-style text rather than a spec/reference doc, so it should be replaced with canonical documentation (schemas, folder layout, examples, and “how to add a new container”). [`docs/data-files.md`](https://github.com/Mosberg/TAoB/blob/main/docs/data-files.md)

Suggested doc structure:

- `docs/data-files.md`: authoritative schema reference (field list, defaults, examples, validation rules).
- `docs/architecture.md`: how resources load (reload listeners), how registries are populated, and how datapacks extend content.
- `docs/contributing.md`: formatting rules, ID conventions, and a checklist for adding a new barrel/flask (data + assets + tags + recipes + loot).

If you want, I can draft a replacement `docs/data-files.md` that matches your current JSON format (including sealing/locking/automation) and includes a “minimal container file” and “full container file” example based on your current barrel+flask definitions. [ppl-ai-file-upload.s3.amazonaws](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/9838088/c5e71973-194f-425b-ab0e-84f8cffdbf48/paste.txt)
