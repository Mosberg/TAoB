# GitHub Copilot Instructions – Minecraft Fabric Mod (1.21.11)

These instructions describe how to work effectively in this repository when developing a _Minecraft: Java Edition_ Fabric mod targeting _1.21.11_ with _Yarn mappings_, _Loom_, _Fabric API_, _Java 21_, and _Gradle 9.2.1_ in _VS Code_.

Whitespace and formatting are for humans; treat every sentence here as a constraint or guideline.

---

## Project overview

- This repository is a Minecraft: Java Edition _Fabric_ mod template targeting _Minecraft 1.21.11_, using _Fabric Loader 0.18.4_, _Fabric API 0.141.1+1.21.11_, _Yarn mappings 1.21.11+build.4_, _Loom 1.15-SNAPSHOT_, _Java 21_, and _Gradle 9.3.0_.
- The mod uses a _split-source_ structure (main, client, test, datagen, etc.) and is designed for _Yarn-named Fabric development_ with clear separation between API, implementation, and data-driven content.
- Development is done primarily in _VS Code_ with the Gradle and Java tooling; Copilot should assume VS Code as the default IDE workflow.
- The codebase is organized by environment (client/main/test) and follows conventions typical for Fabric modding, but with custom structure and workflows. See below for details.

When generating code, prefer _clarity, maintainability, and API-oriented design_ over micro-optimizations unless explicitly asked otherwise.

---

## Repository layout

Assume a conventional Gradle Java/Fabric layout unless the actual tree contradicts this:

- gradle/, gradlew, gradlew.bat, settings.gradle: Gradle wrapper and multi-project configuration.
- build.gradle: Root Gradle build; may also contain Loom, Fabric, mappings, and dependency configuration.
- src/main/java: Primary mod source (entrypoints, content, logic).
- src/client/java: Client-specific code (rendering, screens, keybindings, etc.).
- src/main/resources: fabric.mod.json, assets, data packs, lang files, loot tables, tags, recipes, models, and blockstate JSON.
- src/client/resources: Client-only resources (if present).
- src/test/java (if present): JUnit tests; prefer writing small, deterministic tests when adding new behavior.
- src/datagen/java and/or src/datagen/resources (if present): Data generators and generated outputs; do not hand-edit generated files.
- .github/ workflows (if present): CI pipelines; generated code must keep these passing.
- build/classes/java/{main,client,test}: Compiled classes.
- build/libs/: JARs and processed artifacts.
- build/datagen/: Output from data generation (loot tables, recipes, etc.).
- build/loom-cache/argFiles/: Custom run configs for Loom.

When uncertain about a file’s purpose, _inspect nearby files and follow existing patterns_ rather than inventing new structures.

---

## Tooling and versions

Always assume and respect the following versions unless the build files show different ones:

- _Minecraft_: 1.21.11
- _Fabric Loader_: 0.18.4
- _Fabric API_: 0.141.1+1.21.11
- _Yarn mappings_: 1.21.11+build.4
- _Loom_: 1.15-SNAPSHOT
- _Java_: 21
- _Gradle_: 9.3.0

Guidelines:

- Generate _Java 21_ code (records, pattern matching, switch expressions, sealed types, etc.) only when it fits the existing style.
- Use _Yarn-named_ Minecraft classes and methods; do not suggest Mojang-mapped or obfuscated names.
- Use _Fabric API_ abstractions and events instead of direct vanilla hacks whenever practical.

---

## Fabric and Yarn conventions

Follow standard Fabric/Yarn best practices:

- Use @Environment(EnvType.CLIENT) only where client-only logic is required.
- Register content and events in appropriate lifecycle hooks (e.g. onInitialize, onInitializeClient, datagen entrypoints).
- Keep _client-only_ and _server-agnostic_ code separated; avoid referencing client classes (rendering, keybindings, screens) from shared or dedicated-server code.
- Prefer _composition over inheritance_ when extending Minecraft behavior (e.g. helper classes, delegates, interfaces, and mixin-based injections).
- For registry entries (blocks, items, entities, etc.), centralize _Identifiers_ and registration logic in clearly named utility classes (e.g. ModBlocks, ModItems).

When unsure, infer patterns from existing code in this repo before introducing new architectural concepts.

---

## Coding standards

Match the existing style in this repository; if no strong precedent exists, apply these defaults:

- _Language_: Java 21, Yarn-style Fabric modding.
- _Naming_:
  - Classes: PascalCase.
  - Methods and fields: camelCase.
  - Constants: UPPER_SNAKE_CASE.
  - Registry IDs: modid:path_like_this.
- _Formatting_:
  - Use standard Java formatting (4-space indents, no tabs unless the repo clearly uses tabs).
  - Keep lines reasonably short and readable.
  - Add imports explicitly; avoid wildcard imports except when the project already uses them consistently.
- _Comments and documentation_:
  - Add concise Javadoc for public API types and methods that are meant to be reused.
  - Write brief, high-value comments that explain _why_, not _what_, especially around mixins, workarounds, and tricky vanilla behavior.
- _Error handling_:
  - Prefer explicit null checks and meaningful error messages over silent failures.
  - Avoid swallowing exceptions unless there is a clear reason; log or rethrow when failures matter.

Always align with the _existing code’s style_ when it conflicts with any rule above.

---

## Gradle and build usage

Default commands (run from the repository root):

- _Bootstrap / dependency refresh_:
  - ./gradlew --refresh-dependencies (or gradlew on Windows) when dependencies change.
- _Build_:
  - ./gradlew build
- _Run client_ (if tasks are configured as usual by Loom):
  - ./gradlew runClient
- _Run server_:
  - ./gradlew runServer
- _Tests_:
  - ./gradlew test
- _Data generation_:
  - ./gradlew runDatagen (output in build/datagen/)

Assumptions:

- The Gradle wrapper script (gradlew) must be used; _do not_ suggest using a globally installed Gradle version.
- Build logic and plugin configuration should be added to existing build.gradle files and follow Loom/Fabric plugin patterns.
- If you add tasks, make them _incremental_ and avoid breaking default Fabric/Loom tasks.
- Artifacts are output to build/libs/.

If proposing changes to build scripts, keep them minimal, compatible with the existing DSL (Groovy), and annotated with brief comments when non-obvious.

---

## VS Code and Copilot–specific guidance

- Assume _VS Code_ with:
  - Java extensions,
  - Gradle support,
  - GitHub Copilot and Copilot Chat enabled with _instruction files_ allowed.
- Generated code should:
  - Compile under Java 21,
  - Integrate cleanly with project imports and package structure,
  - Avoid adding editor-specific files beyond .vscode/ configuration when truly useful.

When suggesting configuration:

- Prefer updating .vscode/settings.json and .vscode/launch.json in line with existing patterns and tasks.
- For debug runs, use Loom-provided run configurations as the basis.

---

## Data-driven content and JSON

When adding or editing data/assets:

- Place _data pack_ JSON in src/main/resources/data/<modid>/... and _assets_ JSON in src/main/resources/assets/<modid>/....
- For loot tables, recipes, tags, and models:
  - Follow vanilla/Fabric conventions, including namespace and path structure.
  - Avoid hardcoding unlocalized strings; use lang keys (block.modid.name, item.modid.name, etc.).
- If the project uses _datagen_:
  - Add new content definitions to Java datagen providers rather than directly editing generated JSON outputs.
  - Treat generated resources directories as read-only.

Prefer _schema-consistent, minimal JSON_ that matches patterns already present in this repository.

---

## Behavior when editing and generating code

When responding to requests in this repository:

- _Prefer small, focused changes_ that align with how the surrounding code is written.
- _Preserve public APIs_ unless explicitly asked to refactor; be conservative about breaking changes.
- When introducing new features:
  - Reuse existing helpers, registries, base classes, and utility methods.
  - Keep new classes cohesive and single-responsibility where possible.
- For significant changes, propose:
  - Necessary registrations,
  - Required JSON assets/data,
  - Any updates to fabric.mod.json or configuration.

When uncertain about behavior or structure, _infer from existing code in the same package or module_, then propose minimal, consistent additions.

---

## What not to do

- Do not:
  - Suggest other mod loaders (Forge, NeoForge, Quilt) or Mojang-mapped APIs for this repository.
  - Introduce frameworks or libraries that significantly increase complexity without clear benefit.
  - Add style, formatting, or documentation rules that contradict existing project conventions.
  - Generate long, speculative explanations unrelated to the requested change.

Keep outputs _concrete, repository-aware, and actionable_ for Minecraft Fabric modding with Yarn mappings on 1.21.11.

---

## References

- Key files: build.gradle, fabric.mod.json, src/main/java/, src/client/java/, src/main/resources/assets/
- For modding conventions, see [Fabric Wiki](https://fabricmc.net/wiki/)
- Remote indexing, see [remote-index.md](remote-index.md)
- Javadocs, see [javadocs/](javadocs/)

---

**Update this file as project structure or workflows change.**
