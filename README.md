# The Art of Brewing

The Art of Brewing adds a variety of new brewing mechanics, alcohol beverages and recipes to enhance the potion-making experience in Minecraft by expanding the possibilities of potion creation with alcoholic beverages.

## Features

- New brewing mechanics
- Variety of alcoholic beverages (using vanilla minecraft ingredients)
- New items (flasks, barrels, etc.)
- New blocks (barrels, etc.)
- New recipes (for different flask sizes, barrels and brewing alcoholic beverages)
- Enhanced potion-making experience with alcoholic beverages

## **Core Features**

- **Advanced Brewing Mechanics**
  Fermentation stages, aging cycles, infusion steps, and potency variations turn brewing into a layered craft rather than a single‑step process.

- **Alcoholic Beverages Made from Vanilla Ingredients**
  Craft ales from wheat, meads from honey, grog from sugarcane, and tinctures infused with herbs, fruits, and classic potion reagents.

- **New Items & Containers**
  Barrels and multi‑size Flasks allow players to store, age, and transport their concoctions with style and purpose.

- **New Blocks for a Brewer’s Workshop**
  Barrels for storing liquid, aging, and distillation to create a fully realized brewing environment.

- **Expanded Recipes & Crafting Paths**
  Multiple flask sizes, barrel tiers, and brewing recipes open up a wide range of drink types—from mild ales to potent magical tinctures.

## **Technical & Modding Patterns**

- **Dynamic Registration:**
  - All barrels and flasks are registered dynamically using resource scanning.
  - No static registry classes are used; new types can be added by updating enums and resource files.

- **Resource-Driven Content:**
  - Block and item definitions are loaded from JSON resources, enabling easy extension and modpack compatibility.
  - The `DynamicRegistry` and `ResourceScanner` utilities enable runtime discovery of new content.

- **Fluid Data Handling:**
  - All fluid content for items and blocks is managed via `ModDataComponents.FluidContent`, ensuring robust, future-proof NBT and component storage.

- **Config, Mechanics, and Settings:**
  - All gameplay options, mechanics toggles, and settings are managed in dedicated utility classes (`ModConfigs`, `ModMechanics`, `ModOptions`, `ModSettings`).
  - This allows for easy customization and future expansion.

## **Advanced Mechanics, Settings, and Extensibility**

- **Advanced Brewing Logic:** Multi-stage brewing, custom fermentation/aging, and dynamic ingredient effects are defined via JSON schemas and templates in `src/schemas/mechanics/` and `src/templates/mechanics/`.
-
- **Dynamic Fluid Properties:** Viscosity, color blending, and custom interactions are schema-driven and extensible via resource files.
-
- **Progression System:** Unlock recipes, tools, and mechanics through a config-driven progression system.
-
- **Configurable Mechanics & Options:** All toggles and options are managed in `ModConfigs`, `ModMechanicsConfigs`, `ModOptions`, and `ModSettings` (see `src/main/java/dk.mosberg/config/`).
-
- **How to Extend:**
  - Add or modify schemas/templates in `src/schemas/mechanics/` and `src/templates/mechanics/`.
  - Add new config toggles or options in the config utility classes.
