# Copilot Instructions for TAoB Mod Project

## Project Overview

This is a Minecraft mod project using Gradle for builds. The codebase is organized by environment (client/main/test) and follows conventions typical for Fabric modding, but with custom structure and workflows.

## Architecture & Structure

- **Source Code:**
  - Main mod logic: `src/main/java/`
  - Client-specific code: `src/client/java/`
  - Resources (assets, mod metadata): `src/main/resources/`, `src/client/resources/`
- **Build Outputs:**
  - Compiled classes: `build/classes/java/{main,client,test}`
  - JARs and processed artifacts: `build/tmp/`, `build/libs/`
- **Configuration:**
  - Mod metadata: `src/main/resources/fabric.mod.json`
  - Gradle build: `build.gradle`, `settings.gradle`, `gradle.properties`

## Developer Workflows

- **Build:**
  - Use `./gradlew build` to compile and package the mod.
  - Artifacts are output to `build/libs/`.
- **Run/Debug:**
  - Use `./gradlew runClient` for client testing, `./gradlew runServer` for server testing.
  - Custom run configs may be found in `build/loom-cache/argFiles/`.
- **Data Generation:**
  - Run `./gradlew runDatagen` to generate mod data (loot tables, recipes, etc.).
  - Output is in `build/datagen/`.

## Patterns & Conventions

- **Environment Separation:**
  - Client-only code is in `src/client/java/` and `src/client/resources/`.
  - Shared/main code is in `src/main/java/` and `src/main/resources/`.
- **Resource Packs & Assets:**
  - Mod assets are under `src/main/resources/assets/`.
  - Default resource packs: `build/datagen/data/fabric_default_resource_packs.json`.
- **Testing:**
  - Test sources: `src/main/test/` (if present).
  - No standard test framework detected; manual testing via Minecraft run configs is typical.

## Integration Points

- **Fabric Loader:**
  - Mod entrypoints and metadata are defined in `fabric.mod.json`.
- **External Libraries:**
  - Dependencies managed via Gradle in `build.gradle`.
  - Custom dev libraries: `build/devlibs/`.

## Examples

- To add a new item, create its class in `src/main/java/` and register it in the mod initializer (see main mod package).
- To add client-only features (e.g., rendering), use `src/client/java/` and guard with environment checks.

## References

- Key files: `build.gradle`, `fabric.mod.json`, `src/main/java/`, `src/client/java/`, `src/main/resources/assets/`
- For modding conventions, see [Fabric Wiki](https://fabricmc.net/wiki/)
- Remote indexing, see [remote-index.md](remote-index.md)
- Javadocs, see [Javadocs Folder](javadocs/)

---

**Update this file as project structure or workflows change.**
