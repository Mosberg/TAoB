---
## Fast Class Search in VS Code

To quickly search for classes in this codebase using VS Code:
  - Press `Ctrl+P` (or `Cmd+P` on Mac), then type `#` followed by the class name (e.g., `#NbtCompound`, `#NbtCompoundArgumentType`).
  - This will instantly locate Java classes, interfaces, and other symbols for rapid navigation and inspection.
  - Use this for exploring Minecraft/Fabric API classes, mod source, or generated code.
---

## Project Metadata (for AI agents)

maven_group=dk.mosberg.taob
archives_base_name=taob

mod_id=taob
mod_version=1.0.0
mod_name=The Art of Brewing
mod_description=The Art of Brewing adds a variety of new brewing mechanics, alcohol beverages and recipes to enhance the potion-making experience in Minecraft by expanding the possibilities of potion creation with alcoholic beverages.
mod_author=Mosberg
mod_homepage=https://mosberg.github.io/TAoB
mod_sources=https://github.com/mosberg/TAoB
mod_issues=https://github.com/mosberg/TAoB/issues
mod_license=MIT

minecraft_version=1.21.11
yarn_mappings=1.21.11+build.4
loader_version=0.18.4
loom_version=1.15-SNAPSHOT
fabric_version=0.141.2+1.21.11
java_version=21

gson_version=2.13.2
slf4j_version=2.0.17
annotations_version=26.0.2

junit_version=6.0.2

# Copilot Instructions – The Art of Brewing (TAoB) Fabric Mod

These instructions are for AI coding agents working in the TAoB codebase (Minecraft: Java Edition, Fabric 1.21.11, Yarn mappings, Java 21, Gradle 9.3.0). They focus on dynamic, schema-driven, and resource-driven mod development.

---

## Essential Architecture & Patterns

- **Dynamic Registration:**
  - All barrels, flasks, and recipes are registered at runtime using resource scanning and `DynamicRegistry` utilities. No static registry classes or hardcoded lists.
  - New types are added by updating resource files (see `src/main/resources/data/taob/containers/` and tags).
- **Resource-Driven Content:**
  - Block/item/fluid definitions are loaded from JSON in `src/main/resources/data/taob/containers/` and `alcohol_fluid_properties/`.
  - Use `ResourceScanner`, `TagLoader`, and `FluidPropertiesLoader` for runtime discovery and loading.
- **Schema-First Extensibility:**
  - All new data types (blocks, items, fluids, recipes) must be defined by JSON schema and loaded dynamically.
  - Prefer datagen and schema-driven patterns for extensibility and modpack compatibility.
- **Fluid Data Handling:**
  - All fluid content for items/blocks is managed via `ModDataComponents.FluidContent` (NBT/component storage).
  - Fluid properties (viscosity, color, interactions) are loaded from `alcohol_fluid_properties/*.json` and accessed at runtime.

---

## Key Workflows

- **Build:** `./gradlew build` (output in `build/libs/`)
- **Run Client:** `./gradlew runClient`
- **Run Server:** `./gradlew runServer`
- **Data Generation:** `./gradlew runDatagen` (output in `build/datagen/`)
- **Test:** `./gradlew test`

---

## Project-Specific Conventions

- **No static registry maps:** All registration is dynamic and resource-driven.
- **Config-driven features:** Use `ModConfigs`, `ModOptions`, and `ModSettings` for toggles and settings.
- **Separation of concerns:** Keep client/server logic, registration, and data loading modular (see `TAoB.java` for entrypoint and orchestration).
- **Canonical references:** Always use `remote-index.md` for file/API links.
- **Do not edit generated or auto-managed files** (e.g., `.github/javadocs/`, `.github/sources/`, `remote-index.md`).

---

## Examples & Key Files

- `src/main/java/dk/mosberg/taob/TAoB.java`: Entrypoint, dynamic registration, resource scanning.
- `src/main/java/dk/mosberg/taob/util/DynamicRegistry.java`: Generic runtime registry utility.
- `src/main/java/dk/mosberg/taob/util/ResourceScanner.java`: Resource scanning for JSON/assets.
- `src/main/java/dk/mosberg/taob/util/TagLoader.java`: Loads tag JSON for ID lists.
- `src/main/java/dk/mosberg/taob/util/FluidPropertiesLoader.java`: Loads and provides fluid property schemas.
- `src/main/java/dk/mosberg/taob/component/ModDataComponents.java`: Fluid content NBT/component logic.
- `src/main/resources/data/taob/containers/`: All container/block/item/fluid JSON definitions.
- `src/main/resources/data/taob/alcohol_fluid_properties/`: Fluid property schemas.

---

## What NOT to do

- Do not use static registry classes or hardcoded lists for content registration.
- Do not suggest Forge/NeoForge/Quilt APIs or non-Fabric conventions.
- Do not edit auto-generated or schema-derived files by hand.
- Do not break schema/data-driven extensibility patterns.

---

**Update this file as project structure or workflows change.**

# Copilot Instructions — minecraft-data-docs

These instructions define the quality bar and contribution rules for this repository.
Follow them by default; only deviate when explicitly asked.

## What this repo is

This repository documents Minecraft data formats and provides JSON Schemas for validating those formats (block models, item models, block states, NBT, etc.).

Primary goal: accurate, maintainable reference documentation + validation schemas that stay in sync.

## Where things live

- `docs/`: Human-readable Markdown documentation.
- `schemas/`: JSON Schema files (including `schemas/nbt/`).
- `README.md`: Navigation hub and entrypoint.
- `remote-indexes.md`: Curated link index for internal files and external references.

## High-level rules (always)

- Prefer correctness over creativity; do not invent fields, tags, or semantics.
- Keep documentation and schemas paired: if one changes, update the other.
- Maintain cross-links (README ↔ docs ↔ schemas) so readers can navigate quickly.
- Be consistent with existing style and file layout; avoid “new patterns” unless clearly better and applied consistently.

## Naming & file conventions

- Markdown docs: kebab-case (example: `block-models.md`, `armor-stand-nbt.md`).
- Schemas: snake_case + `.schema.json` (example: `block_model.schema.json`, `armor_stand_nbt.schema.json`).
- Keep names aligned between doc and schema (same concept, predictable mapping).

## Documentation authoring standards (`docs/`)

- Write for technical readers: concise definitions, then structured details.
- Use headings to mirror the data structure (top-level → nested).
- Use Markdown tables for field/property definitions where practical:
  - Column suggestions: Name, Type, Required, Description.
- Provide minimal, valid JSON examples:
  - One “smallest valid” example.
  - One “common real-world” example (only if it adds clarity).
- Prefer stable internal links (relative paths). Avoid linking to moving targets when possible.

## JSON Schema standards (`schemas/`)

- Follow existing schema patterns in this repo for consistency.
- Use `$ref` to reuse definitions rather than duplicating structures.
- Keep schemas readable:
  - Group related definitions under `$defs` (or the repo’s existing pattern).
  - Use `title`/`description` meaningfully for editor/tooling UX.
- Be explicit about constraints when known:
  - Use `enum` for closed sets.
  - Use `minimum`/`maximum`, `pattern`, `minItems`, etc., where appropriate.
- Avoid over-constraining when the game format is permissive/unknown:
  - Prefer “allow but document” when unsure.
  - If uncertain, add a short note in the doc describing the ambiguity.

## Change workflow (what to update when)

When adding a new format/type:

1. Add the Markdown doc in the appropriate folder under `docs/` (use kebab-case).
2. Add the matching schema in `schemas/` (use snake_case + `.schema.json`).
3. Link both from `README.md` (and from any relevant overview docs).
4. Update `remote-indexes.md` with quick links to the new doc + schema.

When editing an existing format/type:

- Update the doc and schema together unless the change is strictly editorial (spelling/formatting).
- If you rename/move files, fix all inbound links (README and other docs).

## Safety / review mindset

- Do not make sweeping “cleanup” changes across many files unless requested.
- Prefer small, reviewable commits: one concept per change set.
- If requirements are unclear, ask a clarifying question before restructuring schemas or rewriting large documentation sections.
