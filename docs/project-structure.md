# Project Structure

```
TAoB
├─ build.gradle
├─ docs
│  └─ data-files.md
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
├─ LICENSE
├─ README.md
├─ settings.gradle
└─ src
   ├─ client
   │  ├─ java
   │  │  └─ dk
   │  │     └─ mosberg
   │  │        └─ taob
   │  │           └─ client
   │  │              ├─ datagen
   │  │              │  └─ TAoBDataGenerator.java
   │  │              └─ TAoBClient.java
   │  └─ resources
   └─ main
      ├─ generated
      │  └─ resources
      │     └─ .cache
      ├─ java
      │  └─ dk
      │     └─ mosberg
      │        └─ taob
      │           ├─ block
      │           │  └─ BarrelBlock.java
      │           ├─ component
      │           │  └─ ModDataComponents.java
      │           ├─ config
      │           │  ├─ ModConfigs.java
      │           │  ├─ ModMechanics.java
      │           │  ├─ ModOptions.java
      │           │  └─ ModSettings.java
      │           ├─ item
      │           │  ├─ BarrelItem.java
      │           │  ├─ LargeFlaskItem.java
      │           │  ├─ MediumFlaskItem.java
      │           │  └─ SmallFlaskItem.java
      │           ├─ TAoB.java
      │           └─ util
      │              ├─ DynamicRegistry.java
      │              ├─ RecipeRegistrar.java
      │              ├─ ResourceScanner.java
      │              └─ TagLoader.java
      └─ resources
         ├─ assets
         │  └─ taob
         │     ├─ blockstates
         │     │  └─ block
         │     │     └─ barrels
         │     │        ├─ acacia_copper_barrel.json
         │     │        ├─ acacia_copper_exposed_barrel.json
         │     │        ├─ acacia_copper_oxidized_barrel.json
         │     │        ├─ acacia_copper_weathered_barrel.json
         │     │        ├─ acacia_gold_barrel.json
         │     │        ├─ acacia_iron_barrel.json
         │     │        ├─ acacia_netherite_barrel.json
         │     │        ├─ bamboo_copper_barrel.json
         │     │        ├─ bamboo_copper_exposed_barrel.json
         │     │        ├─ bamboo_copper_oxidized_barrel.json
         │     │        ├─ bamboo_copper_weathered_barrel.json
         │     │        ├─ bamboo_gold_barrel.json
         │     │        ├─ bamboo_iron_barrel.json
         │     │        ├─ bamboo_netherite_barrel.json
         │     │        ├─ birch_copper_barrel.json
         │     │        ├─ birch_copper_exposed_barrel.json
         │     │        ├─ birch_copper_oxidized_barrel.json
         │     │        ├─ birch_copper_weathered_barrel.json
         │     │        ├─ birch_gold_barrel.json
         │     │        ├─ birch_iron_barrel.json
         │     │        ├─ birch_netherite_barrel.json
         │     │        ├─ cherry_copper_barrel.json
         │     │        ├─ cherry_copper_exposed_barrel.json
         │     │        ├─ cherry_copper_oxidized_barrel.json
         │     │        ├─ cherry_copper_weathered_barrel.json
         │     │        ├─ cherry_gold_barrel.json
         │     │        ├─ cherry_iron_barrel.json
         │     │        ├─ cherry_netherite_barrel.json
         │     │        ├─ crimson_copper_barrel.json
         │     │        ├─ crimson_copper_exposed_barrel.json
         │     │        ├─ crimson_copper_oxidized_barrel.json
         │     │        ├─ crimson_copper_weathered_barrel.json
         │     │        ├─ crimson_gold_barrel.json
         │     │        ├─ crimson_iron_barrel.json
         │     │        ├─ crimson_netherite_barrel.json
         │     │        ├─ dark_oak_copper_barrel.json
         │     │        ├─ dark_oak_copper_exposed_barrel.json
         │     │        ├─ dark_oak_copper_oxidized_barrel.json
         │     │        ├─ dark_oak_copper_weathered_barrel.json
         │     │        ├─ dark_oak_gold_barrel.json
         │     │        ├─ dark_oak_iron_barrel.json
         │     │        ├─ dark_oak_netherite_barrel.json
         │     │        ├─ jungle_copper_barrel.json
         │     │        ├─ jungle_copper_exposed_barrel.json
         │     │        ├─ jungle_copper_oxidized_barrel.json
         │     │        ├─ jungle_copper_weathered_barrel.json
         │     │        ├─ jungle_gold_barrel.json
         │     │        ├─ jungle_iron_barrel.json
         │     │        ├─ jungle_netherite_barrel.json
         │     │        ├─ mangrove_copper_barrel.json
         │     │        ├─ mangrove_copper_exposed_barrel.json
         │     │        ├─ mangrove_copper_oxidized_barrel.json
         │     │        ├─ mangrove_copper_weathered_barrel.json
         │     │        ├─ mangrove_gold_barrel.json
         │     │        ├─ mangrove_iron_barrel.json
         │     │        ├─ mangrove_netherite_barrel.json
         │     │        ├─ oak_copper_barrel.json
         │     │        ├─ oak_copper_exposed_barrel.json
         │     │        ├─ oak_copper_oxidized_barrel.json
         │     │        ├─ oak_copper_weathered_barrel.json
         │     │        ├─ oak_gold_barrel.json
         │     │        ├─ oak_iron_barrel.json
         │     │        ├─ oak_netherite_barrel.json
         │     │        ├─ pale_oak_copper_barrel.json
         │     │        ├─ pale_oak_copper_exposed_barrel.json
         │     │        ├─ pale_oak_copper_oxidized_barrel.json
         │     │        ├─ pale_oak_copper_weathered_barrel.json
         │     │        ├─ pale_oak_gold_barrel.json
         │     │        ├─ pale_oak_iron_barrel.json
         │     │        ├─ pale_oak_netherite_barrel.json
         │     │        ├─ spruce_copper_barrel.json
         │     │        ├─ spruce_copper_exposed_barrel.json
         │     │        ├─ spruce_copper_oxidized_barrel.json
         │     │        ├─ spruce_copper_weathered_barrel.json
         │     │        ├─ spruce_gold_barrel.json
         │     │        ├─ spruce_iron_barrel.json
         │     │        ├─ spruce_netherite_barrel.json
         │     │        ├─ warped_copper_barrel.json
         │     │        ├─ warped_copper_exposed_barrel.json
         │     │        ├─ warped_copper_oxidized_barrel.json
         │     │        ├─ warped_copper_weathered_barrel.json
         │     │        ├─ warped_gold_barrel.json
         │     │        ├─ warped_iron_barrel.json
         │     │        └─ warped_netherite_barrel.json
         │     ├─ items
         │     │  ├─ block
         │     │  │  └─ barrels
         │     │  │     ├─ acacia_copper_barrel.json
         │     │  │     ├─ acacia_copper_exposed_barrel.json
         │     │  │     ├─ acacia_copper_oxidized_barrel.json
         │     │  │     ├─ acacia_copper_weathered_barrel.json
         │     │  │     ├─ acacia_gold_barrel.json
         │     │  │     ├─ acacia_iron_barrel.json
         │     │  │     ├─ acacia_netherite_barrel.json
         │     │  │     ├─ bamboo_copper_barrel.json
         │     │  │     ├─ bamboo_copper_exposed_barrel.json
         │     │  │     ├─ bamboo_copper_oxidized_barrel.json
         │     │  │     ├─ bamboo_copper_weathered_barrel.json
         │     │  │     ├─ bamboo_gold_barrel.json
         │     │  │     ├─ bamboo_iron_barrel.json
         │     │  │     ├─ bamboo_netherite_barrel.json
         │     │  │     ├─ birch_copper_barrel.json
         │     │  │     ├─ birch_copper_exposed_barrel.json
         │     │  │     ├─ birch_copper_oxidized_barrel.json
         │     │  │     ├─ birch_copper_weathered_barrel.json
         │     │  │     ├─ birch_gold_barrel.json
         │     │  │     ├─ birch_iron_barrel.json
         │     │  │     ├─ birch_netherite_barrel.json
         │     │  │     ├─ cherry_copper_barrel.json
         │     │  │     ├─ cherry_copper_exposed_barrel.json
         │     │  │     ├─ cherry_copper_oxidized_barrel.json
         │     │  │     ├─ cherry_copper_weathered_barrel.json
         │     │  │     ├─ cherry_gold_barrel.json
         │     │  │     ├─ cherry_iron_barrel.json
         │     │  │     ├─ cherry_netherite_barrel.json
         │     │  │     ├─ crimson_copper_barrel.json
         │     │  │     ├─ crimson_copper_exposed_barrel.json
         │     │  │     ├─ crimson_copper_oxidized_barrel.json
         │     │  │     ├─ crimson_copper_weathered_barrel.json
         │     │  │     ├─ crimson_gold_barrel.json
         │     │  │     ├─ crimson_iron_barrel.json
         │     │  │     ├─ crimson_netherite_barrel.json
         │     │  │     ├─ dark_oak_copper_barrel.json
         │     │  │     ├─ dark_oak_copper_exposed_barrel.json
         │     │  │     ├─ dark_oak_copper_oxidized_barrel.json
         │     │  │     ├─ dark_oak_copper_weathered_barrel.json
         │     │  │     ├─ dark_oak_gold_barrel.json
         │     │  │     ├─ dark_oak_iron_barrel.json
         │     │  │     ├─ dark_oak_netherite_barrel.json
         │     │  │     ├─ jungle_copper_barrel.json
         │     │  │     ├─ jungle_copper_exposed_barrel.json
         │     │  │     ├─ jungle_copper_oxidized_barrel.json
         │     │  │     ├─ jungle_copper_weathered_barrel.json
         │     │  │     ├─ jungle_gold_barrel.json
         │     │  │     ├─ jungle_iron_barrel.json
         │     │  │     ├─ jungle_netherite_barrel.json
         │     │  │     ├─ mangrove_copper_barrel.json
         │     │  │     ├─ mangrove_copper_exposed_barrel.json
         │     │  │     ├─ mangrove_copper_oxidized_barrel.json
         │     │  │     ├─ mangrove_copper_weathered_barrel.json
         │     │  │     ├─ mangrove_gold_barrel.json
         │     │  │     ├─ mangrove_iron_barrel.json
         │     │  │     ├─ mangrove_netherite_barrel.json
         │     │  │     ├─ oak_copper_barrel.json
         │     │  │     ├─ oak_copper_exposed_barrel.json
         │     │  │     ├─ oak_copper_oxidized_barrel.json
         │     │  │     ├─ oak_copper_weathered_barrel.json
         │     │  │     ├─ oak_gold_barrel.json
         │     │  │     ├─ oak_iron_barrel.json
         │     │  │     ├─ oak_netherite_barrel.json
         │     │  │     ├─ pale_oak_copper_barrel.json
         │     │  │     ├─ pale_oak_copper_exposed_barrel.json
         │     │  │     ├─ pale_oak_copper_oxidized_barrel.json
         │     │  │     ├─ pale_oak_copper_weathered_barrel.json
         │     │  │     ├─ pale_oak_gold_barrel.json
         │     │  │     ├─ pale_oak_iron_barrel.json
         │     │  │     ├─ pale_oak_netherite_barrel.json
         │     │  │     ├─ spruce_copper_barrel.json
         │     │  │     ├─ spruce_copper_exposed_barrel.json
         │     │  │     ├─ spruce_copper_oxidized_barrel.json
         │     │  │     ├─ spruce_copper_weathered_barrel.json
         │     │  │     ├─ spruce_gold_barrel.json
         │     │  │     ├─ spruce_iron_barrel.json
         │     │  │     ├─ spruce_netherite_barrel.json
         │     │  │     ├─ warped_copper_barrel.json
         │     │  │     ├─ warped_copper_exposed_barrel.json
         │     │  │     ├─ warped_copper_oxidized_barrel.json
         │     │  │     ├─ warped_copper_weathered_barrel.json
         │     │  │     ├─ warped_gold_barrel.json
         │     │  │     ├─ warped_iron_barrel.json
         │     │  │     └─ warped_netherite_barrel.json
         │     │  └─ item
         │     │     └─ flasks
         │     │        ├─ large
         │     │        │  ├─ large_acacia_black_stained_glass_flask.json
         │     │        │  ├─ large_acacia_blue_stained_glass_flask.json
         │     │        │  ├─ large_acacia_brown_stained_glass_flask.json
         │     │        │  ├─ large_acacia_cyan_stained_glass_flask.json
         │     │        │  ├─ large_acacia_glass_flask.json
         │     │        │  ├─ large_acacia_gray_stained_glass_flask.json
         │     │        │  ├─ large_acacia_green_stained_glass_flask.json
         │     │        │  ├─ large_acacia_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_acacia_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_acacia_lime_stained_glass_flask.json
         │     │        │  ├─ large_acacia_magenta_stained_glass_flask.json
         │     │        │  ├─ large_acacia_orange_stained_glass_flask.json
         │     │        │  ├─ large_acacia_pink_stained_glass_flask.json
         │     │        │  ├─ large_acacia_purple_stained_glass_flask.json
         │     │        │  ├─ large_acacia_red_stained_glass_flask.json
         │     │        │  ├─ large_acacia_tinted_glass_flask.json
         │     │        │  ├─ large_acacia_white_stained_glass_flask.json
         │     │        │  ├─ large_acacia_yellow_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_black_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_blue_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_brown_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_cyan_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_glass_flask.json
         │     │        │  ├─ large_bamboo_gray_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_green_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_lime_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_magenta_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_orange_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_pink_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_purple_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_red_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_tinted_glass_flask.json
         │     │        │  ├─ large_bamboo_white_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_yellow_stained_glass_flask.json
         │     │        │  ├─ large_birch_black_stained_glass_flask.json
         │     │        │  ├─ large_birch_blue_stained_glass_flask.json
         │     │        │  ├─ large_birch_brown_stained_glass_flask.json
         │     │        │  ├─ large_birch_cyan_stained_glass_flask.json
         │     │        │  ├─ large_birch_glass_flask.json
         │     │        │  ├─ large_birch_gray_stained_glass_flask.json
         │     │        │  ├─ large_birch_green_stained_glass_flask.json
         │     │        │  ├─ large_birch_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_birch_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_birch_lime_stained_glass_flask.json
         │     │        │  ├─ large_birch_magenta_stained_glass_flask.json
         │     │        │  ├─ large_birch_orange_stained_glass_flask.json
         │     │        │  ├─ large_birch_pink_stained_glass_flask.json
         │     │        │  ├─ large_birch_purple_stained_glass_flask.json
         │     │        │  ├─ large_birch_red_stained_glass_flask.json
         │     │        │  ├─ large_birch_tinted_glass_flask.json
         │     │        │  ├─ large_birch_white_stained_glass_flask.json
         │     │        │  ├─ large_birch_yellow_stained_glass_flask.json
         │     │        │  ├─ large_cherry_black_stained_glass_flask.json
         │     │        │  ├─ large_cherry_blue_stained_glass_flask.json
         │     │        │  ├─ large_cherry_brown_stained_glass_flask.json
         │     │        │  ├─ large_cherry_cyan_stained_glass_flask.json
         │     │        │  ├─ large_cherry_glass_flask.json
         │     │        │  ├─ large_cherry_gray_stained_glass_flask.json
         │     │        │  ├─ large_cherry_green_stained_glass_flask.json
         │     │        │  ├─ large_cherry_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_cherry_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_cherry_lime_stained_glass_flask.json
         │     │        │  ├─ large_cherry_magenta_stained_glass_flask.json
         │     │        │  ├─ large_cherry_orange_stained_glass_flask.json
         │     │        │  ├─ large_cherry_pink_stained_glass_flask.json
         │     │        │  ├─ large_cherry_purple_stained_glass_flask.json
         │     │        │  ├─ large_cherry_red_stained_glass_flask.json
         │     │        │  ├─ large_cherry_tinted_glass_flask.json
         │     │        │  ├─ large_cherry_white_stained_glass_flask.json
         │     │        │  ├─ large_cherry_yellow_stained_glass_flask.json
         │     │        │  ├─ large_crimson_black_stained_glass_flask.json
         │     │        │  ├─ large_crimson_blue_stained_glass_flask.json
         │     │        │  ├─ large_crimson_brown_stained_glass_flask.json
         │     │        │  ├─ large_crimson_cyan_stained_glass_flask.json
         │     │        │  ├─ large_crimson_glass_flask.json
         │     │        │  ├─ large_crimson_gray_stained_glass_flask.json
         │     │        │  ├─ large_crimson_green_stained_glass_flask.json
         │     │        │  ├─ large_crimson_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_crimson_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_crimson_lime_stained_glass_flask.json
         │     │        │  ├─ large_crimson_magenta_stained_glass_flask.json
         │     │        │  ├─ large_crimson_orange_stained_glass_flask.json
         │     │        │  ├─ large_crimson_pink_stained_glass_flask.json
         │     │        │  ├─ large_crimson_purple_stained_glass_flask.json
         │     │        │  ├─ large_crimson_red_stained_glass_flask.json
         │     │        │  ├─ large_crimson_tinted_glass_flask.json
         │     │        │  ├─ large_crimson_white_stained_glass_flask.json
         │     │        │  ├─ large_crimson_yellow_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_glass_flask.json
         │     │        │  ├─ large_dark_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_tinted_glass_flask.json
         │     │        │  ├─ large_dark_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_jungle_black_stained_glass_flask.json
         │     │        │  ├─ large_jungle_blue_stained_glass_flask.json
         │     │        │  ├─ large_jungle_brown_stained_glass_flask.json
         │     │        │  ├─ large_jungle_cyan_stained_glass_flask.json
         │     │        │  ├─ large_jungle_glass_flask.json
         │     │        │  ├─ large_jungle_gray_stained_glass_flask.json
         │     │        │  ├─ large_jungle_green_stained_glass_flask.json
         │     │        │  ├─ large_jungle_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_jungle_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_jungle_lime_stained_glass_flask.json
         │     │        │  ├─ large_jungle_magenta_stained_glass_flask.json
         │     │        │  ├─ large_jungle_orange_stained_glass_flask.json
         │     │        │  ├─ large_jungle_pink_stained_glass_flask.json
         │     │        │  ├─ large_jungle_purple_stained_glass_flask.json
         │     │        │  ├─ large_jungle_red_stained_glass_flask.json
         │     │        │  ├─ large_jungle_tinted_glass_flask.json
         │     │        │  ├─ large_jungle_white_stained_glass_flask.json
         │     │        │  ├─ large_jungle_yellow_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_black_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_blue_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_brown_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_cyan_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_glass_flask.json
         │     │        │  ├─ large_mangrove_gray_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_green_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_lime_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_magenta_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_orange_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_pink_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_purple_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_red_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_tinted_glass_flask.json
         │     │        │  ├─ large_mangrove_white_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_yellow_stained_glass_flask.json
         │     │        │  ├─ large_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_oak_glass_flask.json
         │     │        │  ├─ large_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_oak_tinted_glass_flask.json
         │     │        │  ├─ large_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_glass_flask.json
         │     │        │  ├─ large_pale_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_tinted_glass_flask.json
         │     │        │  ├─ large_pale_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_spruce_black_stained_glass_flask.json
         │     │        │  ├─ large_spruce_blue_stained_glass_flask.json
         │     │        │  ├─ large_spruce_brown_stained_glass_flask.json
         │     │        │  ├─ large_spruce_cyan_stained_glass_flask.json
         │     │        │  ├─ large_spruce_glass_flask.json
         │     │        │  ├─ large_spruce_gray_stained_glass_flask.json
         │     │        │  ├─ large_spruce_green_stained_glass_flask.json
         │     │        │  ├─ large_spruce_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_spruce_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_spruce_lime_stained_glass_flask.json
         │     │        │  ├─ large_spruce_magenta_stained_glass_flask.json
         │     │        │  ├─ large_spruce_orange_stained_glass_flask.json
         │     │        │  ├─ large_spruce_pink_stained_glass_flask.json
         │     │        │  ├─ large_spruce_purple_stained_glass_flask.json
         │     │        │  ├─ large_spruce_red_stained_glass_flask.json
         │     │        │  ├─ large_spruce_tinted_glass_flask.json
         │     │        │  ├─ large_spruce_white_stained_glass_flask.json
         │     │        │  ├─ large_spruce_yellow_stained_glass_flask.json
         │     │        │  ├─ large_warped_black_stained_glass_flask.json
         │     │        │  ├─ large_warped_blue_stained_glass_flask.json
         │     │        │  ├─ large_warped_brown_stained_glass_flask.json
         │     │        │  ├─ large_warped_cyan_stained_glass_flask.json
         │     │        │  ├─ large_warped_glass_flask.json
         │     │        │  ├─ large_warped_gray_stained_glass_flask.json
         │     │        │  ├─ large_warped_green_stained_glass_flask.json
         │     │        │  ├─ large_warped_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_warped_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_warped_lime_stained_glass_flask.json
         │     │        │  ├─ large_warped_magenta_stained_glass_flask.json
         │     │        │  ├─ large_warped_orange_stained_glass_flask.json
         │     │        │  ├─ large_warped_pink_stained_glass_flask.json
         │     │        │  ├─ large_warped_purple_stained_glass_flask.json
         │     │        │  ├─ large_warped_red_stained_glass_flask.json
         │     │        │  ├─ large_warped_tinted_glass_flask.json
         │     │        │  ├─ large_warped_white_stained_glass_flask.json
         │     │        │  └─ large_warped_yellow_stained_glass_flask.json
         │     │        ├─ medium
         │     │        │  ├─ medium_acacia_black_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_blue_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_brown_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_glass_flask.json
         │     │        │  ├─ medium_acacia_gray_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_green_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_lime_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_orange_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_pink_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_purple_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_red_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_tinted_glass_flask.json
         │     │        │  ├─ medium_acacia_white_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_black_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_blue_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_brown_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_glass_flask.json
         │     │        │  ├─ medium_bamboo_gray_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_green_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_lime_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_orange_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_pink_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_purple_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_red_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_tinted_glass_flask.json
         │     │        │  ├─ medium_bamboo_white_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_birch_black_stained_glass_flask.json
         │     │        │  ├─ medium_birch_blue_stained_glass_flask.json
         │     │        │  ├─ medium_birch_brown_stained_glass_flask.json
         │     │        │  ├─ medium_birch_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_birch_glass_flask.json
         │     │        │  ├─ medium_birch_gray_stained_glass_flask.json
         │     │        │  ├─ medium_birch_green_stained_glass_flask.json
         │     │        │  ├─ medium_birch_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_birch_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_birch_lime_stained_glass_flask.json
         │     │        │  ├─ medium_birch_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_birch_orange_stained_glass_flask.json
         │     │        │  ├─ medium_birch_pink_stained_glass_flask.json
         │     │        │  ├─ medium_birch_purple_stained_glass_flask.json
         │     │        │  ├─ medium_birch_red_stained_glass_flask.json
         │     │        │  ├─ medium_birch_tinted_glass_flask.json
         │     │        │  ├─ medium_birch_white_stained_glass_flask.json
         │     │        │  ├─ medium_birch_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_black_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_blue_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_brown_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_glass_flask.json
         │     │        │  ├─ medium_cherry_gray_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_green_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_lime_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_orange_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_pink_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_purple_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_red_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_tinted_glass_flask.json
         │     │        │  ├─ medium_cherry_white_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_black_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_blue_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_brown_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_glass_flask.json
         │     │        │  ├─ medium_crimson_gray_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_green_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_lime_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_orange_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_pink_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_purple_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_red_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_tinted_glass_flask.json
         │     │        │  ├─ medium_crimson_white_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_glass_flask.json
         │     │        │  ├─ medium_dark_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_dark_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_black_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_blue_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_brown_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_glass_flask.json
         │     │        │  ├─ medium_jungle_gray_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_green_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_lime_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_orange_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_pink_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_purple_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_red_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_tinted_glass_flask.json
         │     │        │  ├─ medium_jungle_white_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_black_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_blue_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_brown_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_glass_flask.json
         │     │        │  ├─ medium_mangrove_gray_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_green_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_lime_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_orange_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_pink_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_purple_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_red_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_tinted_glass_flask.json
         │     │        │  ├─ medium_mangrove_white_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_oak_glass_flask.json
         │     │        │  ├─ medium_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_glass_flask.json
         │     │        │  ├─ medium_pale_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_pale_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_black_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_blue_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_brown_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_glass_flask.json
         │     │        │  ├─ medium_spruce_gray_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_green_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_lime_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_orange_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_pink_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_purple_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_red_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_tinted_glass_flask.json
         │     │        │  ├─ medium_spruce_white_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_warped_black_stained_glass_flask.json
         │     │        │  ├─ medium_warped_blue_stained_glass_flask.json
         │     │        │  ├─ medium_warped_brown_stained_glass_flask.json
         │     │        │  ├─ medium_warped_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_warped_glass_flask.json
         │     │        │  ├─ medium_warped_gray_stained_glass_flask.json
         │     │        │  ├─ medium_warped_green_stained_glass_flask.json
         │     │        │  ├─ medium_warped_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_warped_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_warped_lime_stained_glass_flask.json
         │     │        │  ├─ medium_warped_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_warped_orange_stained_glass_flask.json
         │     │        │  ├─ medium_warped_pink_stained_glass_flask.json
         │     │        │  ├─ medium_warped_purple_stained_glass_flask.json
         │     │        │  ├─ medium_warped_red_stained_glass_flask.json
         │     │        │  ├─ medium_warped_tinted_glass_flask.json
         │     │        │  ├─ medium_warped_white_stained_glass_flask.json
         │     │        │  └─ medium_warped_yellow_stained_glass_flask.json
         │     │        └─ small
         │     │           ├─ small_acacia_black_stained_glass_flask.json
         │     │           ├─ small_acacia_blue_stained_glass_flask.json
         │     │           ├─ small_acacia_brown_stained_glass_flask.json
         │     │           ├─ small_acacia_cyan_stained_glass_flask.json
         │     │           ├─ small_acacia_glass_flask.json
         │     │           ├─ small_acacia_gray_stained_glass_flask.json
         │     │           ├─ small_acacia_green_stained_glass_flask.json
         │     │           ├─ small_acacia_light_blue_stained_glass_flask.json
         │     │           ├─ small_acacia_light_gray_stained_glass_flask.json
         │     │           ├─ small_acacia_lime_stained_glass_flask.json
         │     │           ├─ small_acacia_magenta_stained_glass_flask.json
         │     │           ├─ small_acacia_orange_stained_glass_flask.json
         │     │           ├─ small_acacia_pink_stained_glass_flask.json
         │     │           ├─ small_acacia_purple_stained_glass_flask.json
         │     │           ├─ small_acacia_red_stained_glass_flask.json
         │     │           ├─ small_acacia_tinted_glass_flask.json
         │     │           ├─ small_acacia_white_stained_glass_flask.json
         │     │           ├─ small_acacia_yellow_stained_glass_flask.json
         │     │           ├─ small_bamboo_black_stained_glass_flask.json
         │     │           ├─ small_bamboo_blue_stained_glass_flask.json
         │     │           ├─ small_bamboo_brown_stained_glass_flask.json
         │     │           ├─ small_bamboo_cyan_stained_glass_flask.json
         │     │           ├─ small_bamboo_glass_flask.json
         │     │           ├─ small_bamboo_gray_stained_glass_flask.json
         │     │           ├─ small_bamboo_green_stained_glass_flask.json
         │     │           ├─ small_bamboo_light_blue_stained_glass_flask.json
         │     │           ├─ small_bamboo_light_gray_stained_glass_flask.json
         │     │           ├─ small_bamboo_lime_stained_glass_flask.json
         │     │           ├─ small_bamboo_magenta_stained_glass_flask.json
         │     │           ├─ small_bamboo_orange_stained_glass_flask.json
         │     │           ├─ small_bamboo_pink_stained_glass_flask.json
         │     │           ├─ small_bamboo_purple_stained_glass_flask.json
         │     │           ├─ small_bamboo_red_stained_glass_flask.json
         │     │           ├─ small_bamboo_tinted_glass_flask.json
         │     │           ├─ small_bamboo_white_stained_glass_flask.json
         │     │           ├─ small_bamboo_yellow_stained_glass_flask.json
         │     │           ├─ small_birch_black_stained_glass_flask.json
         │     │           ├─ small_birch_blue_stained_glass_flask.json
         │     │           ├─ small_birch_brown_stained_glass_flask.json
         │     │           ├─ small_birch_cyan_stained_glass_flask.json
         │     │           ├─ small_birch_glass_flask.json
         │     │           ├─ small_birch_gray_stained_glass_flask.json
         │     │           ├─ small_birch_green_stained_glass_flask.json
         │     │           ├─ small_birch_light_blue_stained_glass_flask.json
         │     │           ├─ small_birch_light_gray_stained_glass_flask.json
         │     │           ├─ small_birch_lime_stained_glass_flask.json
         │     │           ├─ small_birch_magenta_stained_glass_flask.json
         │     │           ├─ small_birch_orange_stained_glass_flask.json
         │     │           ├─ small_birch_pink_stained_glass_flask.json
         │     │           ├─ small_birch_purple_stained_glass_flask.json
         │     │           ├─ small_birch_red_stained_glass_flask.json
         │     │           ├─ small_birch_tinted_glass_flask.json
         │     │           ├─ small_birch_white_stained_glass_flask.json
         │     │           ├─ small_birch_yellow_stained_glass_flask.json
         │     │           ├─ small_cherry_black_stained_glass_flask.json
         │     │           ├─ small_cherry_blue_stained_glass_flask.json
         │     │           ├─ small_cherry_brown_stained_glass_flask.json
         │     │           ├─ small_cherry_cyan_stained_glass_flask.json
         │     │           ├─ small_cherry_glass_flask.json
         │     │           ├─ small_cherry_gray_stained_glass_flask.json
         │     │           ├─ small_cherry_green_stained_glass_flask.json
         │     │           ├─ small_cherry_light_blue_stained_glass_flask.json
         │     │           ├─ small_cherry_light_gray_stained_glass_flask.json
         │     │           ├─ small_cherry_lime_stained_glass_flask.json
         │     │           ├─ small_cherry_magenta_stained_glass_flask.json
         │     │           ├─ small_cherry_orange_stained_glass_flask.json
         │     │           ├─ small_cherry_pink_stained_glass_flask.json
         │     │           ├─ small_cherry_purple_stained_glass_flask.json
         │     │           ├─ small_cherry_red_stained_glass_flask.json
         │     │           ├─ small_cherry_tinted_glass_flask.json
         │     │           ├─ small_cherry_white_stained_glass_flask.json
         │     │           ├─ small_cherry_yellow_stained_glass_flask.json
         │     │           ├─ small_crimson_black_stained_glass_flask.json
         │     │           ├─ small_crimson_blue_stained_glass_flask.json
         │     │           ├─ small_crimson_brown_stained_glass_flask.json
         │     │           ├─ small_crimson_cyan_stained_glass_flask.json
         │     │           ├─ small_crimson_glass_flask.json
         │     │           ├─ small_crimson_gray_stained_glass_flask.json
         │     │           ├─ small_crimson_green_stained_glass_flask.json
         │     │           ├─ small_crimson_light_blue_stained_glass_flask.json
         │     │           ├─ small_crimson_light_gray_stained_glass_flask.json
         │     │           ├─ small_crimson_lime_stained_glass_flask.json
         │     │           ├─ small_crimson_magenta_stained_glass_flask.json
         │     │           ├─ small_crimson_orange_stained_glass_flask.json
         │     │           ├─ small_crimson_pink_stained_glass_flask.json
         │     │           ├─ small_crimson_purple_stained_glass_flask.json
         │     │           ├─ small_crimson_red_stained_glass_flask.json
         │     │           ├─ small_crimson_tinted_glass_flask.json
         │     │           ├─ small_crimson_white_stained_glass_flask.json
         │     │           ├─ small_crimson_yellow_stained_glass_flask.json
         │     │           ├─ small_dark_oak_black_stained_glass_flask.json
         │     │           ├─ small_dark_oak_blue_stained_glass_flask.json
         │     │           ├─ small_dark_oak_brown_stained_glass_flask.json
         │     │           ├─ small_dark_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_dark_oak_glass_flask.json
         │     │           ├─ small_dark_oak_gray_stained_glass_flask.json
         │     │           ├─ small_dark_oak_green_stained_glass_flask.json
         │     │           ├─ small_dark_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_dark_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_dark_oak_lime_stained_glass_flask.json
         │     │           ├─ small_dark_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_dark_oak_orange_stained_glass_flask.json
         │     │           ├─ small_dark_oak_pink_stained_glass_flask.json
         │     │           ├─ small_dark_oak_purple_stained_glass_flask.json
         │     │           ├─ small_dark_oak_red_stained_glass_flask.json
         │     │           ├─ small_dark_oak_tinted_glass_flask.json
         │     │           ├─ small_dark_oak_white_stained_glass_flask.json
         │     │           ├─ small_dark_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_jungle_black_stained_glass_flask.json
         │     │           ├─ small_jungle_blue_stained_glass_flask.json
         │     │           ├─ small_jungle_brown_stained_glass_flask.json
         │     │           ├─ small_jungle_cyan_stained_glass_flask.json
         │     │           ├─ small_jungle_glass_flask.json
         │     │           ├─ small_jungle_gray_stained_glass_flask.json
         │     │           ├─ small_jungle_green_stained_glass_flask.json
         │     │           ├─ small_jungle_light_blue_stained_glass_flask.json
         │     │           ├─ small_jungle_light_gray_stained_glass_flask.json
         │     │           ├─ small_jungle_lime_stained_glass_flask.json
         │     │           ├─ small_jungle_magenta_stained_glass_flask.json
         │     │           ├─ small_jungle_orange_stained_glass_flask.json
         │     │           ├─ small_jungle_pink_stained_glass_flask.json
         │     │           ├─ small_jungle_purple_stained_glass_flask.json
         │     │           ├─ small_jungle_red_stained_glass_flask.json
         │     │           ├─ small_jungle_tinted_glass_flask.json
         │     │           ├─ small_jungle_white_stained_glass_flask.json
         │     │           ├─ small_jungle_yellow_stained_glass_flask.json
         │     │           ├─ small_mangrove_black_stained_glass_flask.json
         │     │           ├─ small_mangrove_blue_stained_glass_flask.json
         │     │           ├─ small_mangrove_brown_stained_glass_flask.json
         │     │           ├─ small_mangrove_cyan_stained_glass_flask.json
         │     │           ├─ small_mangrove_glass_flask.json
         │     │           ├─ small_mangrove_gray_stained_glass_flask.json
         │     │           ├─ small_mangrove_green_stained_glass_flask.json
         │     │           ├─ small_mangrove_light_blue_stained_glass_flask.json
         │     │           ├─ small_mangrove_light_gray_stained_glass_flask.json
         │     │           ├─ small_mangrove_lime_stained_glass_flask.json
         │     │           ├─ small_mangrove_magenta_stained_glass_flask.json
         │     │           ├─ small_mangrove_orange_stained_glass_flask.json
         │     │           ├─ small_mangrove_pink_stained_glass_flask.json
         │     │           ├─ small_mangrove_purple_stained_glass_flask.json
         │     │           ├─ small_mangrove_red_stained_glass_flask.json
         │     │           ├─ small_mangrove_tinted_glass_flask.json
         │     │           ├─ small_mangrove_white_stained_glass_flask.json
         │     │           ├─ small_mangrove_yellow_stained_glass_flask.json
         │     │           ├─ small_oak_black_stained_glass_flask.json
         │     │           ├─ small_oak_blue_stained_glass_flask.json
         │     │           ├─ small_oak_brown_stained_glass_flask.json
         │     │           ├─ small_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_oak_glass_flask.json
         │     │           ├─ small_oak_gray_stained_glass_flask.json
         │     │           ├─ small_oak_green_stained_glass_flask.json
         │     │           ├─ small_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_oak_lime_stained_glass_flask.json
         │     │           ├─ small_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_oak_orange_stained_glass_flask.json
         │     │           ├─ small_oak_pink_stained_glass_flask.json
         │     │           ├─ small_oak_purple_stained_glass_flask.json
         │     │           ├─ small_oak_red_stained_glass_flask.json
         │     │           ├─ small_oak_tinted_glass_flask.json
         │     │           ├─ small_oak_white_stained_glass_flask.json
         │     │           ├─ small_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_pale_oak_black_stained_glass_flask.json
         │     │           ├─ small_pale_oak_blue_stained_glass_flask.json
         │     │           ├─ small_pale_oak_brown_stained_glass_flask.json
         │     │           ├─ small_pale_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_pale_oak_glass_flask.json
         │     │           ├─ small_pale_oak_gray_stained_glass_flask.json
         │     │           ├─ small_pale_oak_green_stained_glass_flask.json
         │     │           ├─ small_pale_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_pale_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_pale_oak_lime_stained_glass_flask.json
         │     │           ├─ small_pale_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_pale_oak_orange_stained_glass_flask.json
         │     │           ├─ small_pale_oak_pink_stained_glass_flask.json
         │     │           ├─ small_pale_oak_purple_stained_glass_flask.json
         │     │           ├─ small_pale_oak_red_stained_glass_flask.json
         │     │           ├─ small_pale_oak_tinted_glass_flask.json
         │     │           ├─ small_pale_oak_white_stained_glass_flask.json
         │     │           ├─ small_pale_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_spruce_black_stained_glass_flask.json
         │     │           ├─ small_spruce_blue_stained_glass_flask.json
         │     │           ├─ small_spruce_brown_stained_glass_flask.json
         │     │           ├─ small_spruce_cyan_stained_glass_flask.json
         │     │           ├─ small_spruce_glass_flask.json
         │     │           ├─ small_spruce_gray_stained_glass_flask.json
         │     │           ├─ small_spruce_green_stained_glass_flask.json
         │     │           ├─ small_spruce_light_blue_stained_glass_flask.json
         │     │           ├─ small_spruce_light_gray_stained_glass_flask.json
         │     │           ├─ small_spruce_lime_stained_glass_flask.json
         │     │           ├─ small_spruce_magenta_stained_glass_flask.json
         │     │           ├─ small_spruce_orange_stained_glass_flask.json
         │     │           ├─ small_spruce_pink_stained_glass_flask.json
         │     │           ├─ small_spruce_purple_stained_glass_flask.json
         │     │           ├─ small_spruce_red_stained_glass_flask.json
         │     │           ├─ small_spruce_tinted_glass_flask.json
         │     │           ├─ small_spruce_white_stained_glass_flask.json
         │     │           ├─ small_spruce_yellow_stained_glass_flask.json
         │     │           ├─ small_warped_black_stained_glass_flask.json
         │     │           ├─ small_warped_blue_stained_glass_flask.json
         │     │           ├─ small_warped_brown_stained_glass_flask.json
         │     │           ├─ small_warped_cyan_stained_glass_flask.json
         │     │           ├─ small_warped_glass_flask.json
         │     │           ├─ small_warped_gray_stained_glass_flask.json
         │     │           ├─ small_warped_green_stained_glass_flask.json
         │     │           ├─ small_warped_light_blue_stained_glass_flask.json
         │     │           ├─ small_warped_light_gray_stained_glass_flask.json
         │     │           ├─ small_warped_lime_stained_glass_flask.json
         │     │           ├─ small_warped_magenta_stained_glass_flask.json
         │     │           ├─ small_warped_orange_stained_glass_flask.json
         │     │           ├─ small_warped_pink_stained_glass_flask.json
         │     │           ├─ small_warped_purple_stained_glass_flask.json
         │     │           ├─ small_warped_red_stained_glass_flask.json
         │     │           ├─ small_warped_tinted_glass_flask.json
         │     │           ├─ small_warped_white_stained_glass_flask.json
         │     │           └─ small_warped_yellow_stained_glass_flask.json
         │     ├─ lang
         │     │  └─ en_us.json
         │     ├─ models
         │     │  ├─ block
         │     │  │  └─ barrels
         │     │  │     ├─ acacia_copper_barrel.json
         │     │  │     ├─ acacia_copper_exposed_barrel.json
         │     │  │     ├─ acacia_copper_oxidized_barrel.json
         │     │  │     ├─ acacia_copper_weathered_barrel.json
         │     │  │     ├─ acacia_gold_barrel.json
         │     │  │     ├─ acacia_iron_barrel.json
         │     │  │     ├─ acacia_netherite_barrel.json
         │     │  │     ├─ bamboo_copper_barrel.json
         │     │  │     ├─ bamboo_copper_exposed_barrel.json
         │     │  │     ├─ bamboo_copper_oxidized_barrel.json
         │     │  │     ├─ bamboo_copper_weathered_barrel.json
         │     │  │     ├─ bamboo_gold_barrel.json
         │     │  │     ├─ bamboo_iron_barrel.json
         │     │  │     ├─ bamboo_netherite_barrel.json
         │     │  │     ├─ birch_copper_barrel.json
         │     │  │     ├─ birch_copper_exposed_barrel.json
         │     │  │     ├─ birch_copper_oxidized_barrel.json
         │     │  │     ├─ birch_copper_weathered_barrel.json
         │     │  │     ├─ birch_gold_barrel.json
         │     │  │     ├─ birch_iron_barrel.json
         │     │  │     ├─ birch_netherite_barrel.json
         │     │  │     ├─ cherry_copper_barrel.json
         │     │  │     ├─ cherry_copper_exposed_barrel.json
         │     │  │     ├─ cherry_copper_oxidized_barrel.json
         │     │  │     ├─ cherry_copper_weathered_barrel.json
         │     │  │     ├─ cherry_gold_barrel.json
         │     │  │     ├─ cherry_iron_barrel.json
         │     │  │     ├─ cherry_netherite_barrel.json
         │     │  │     ├─ crimson_copper_barrel.json
         │     │  │     ├─ crimson_copper_exposed_barrel.json
         │     │  │     ├─ crimson_copper_oxidized_barrel.json
         │     │  │     ├─ crimson_copper_weathered_barrel.json
         │     │  │     ├─ crimson_gold_barrel.json
         │     │  │     ├─ crimson_iron_barrel.json
         │     │  │     ├─ crimson_netherite_barrel.json
         │     │  │     ├─ dark_oak_copper_barrel.json
         │     │  │     ├─ dark_oak_copper_exposed_barrel.json
         │     │  │     ├─ dark_oak_copper_oxidized_barrel.json
         │     │  │     ├─ dark_oak_copper_weathered_barrel.json
         │     │  │     ├─ dark_oak_gold_barrel.json
         │     │  │     ├─ dark_oak_iron_barrel.json
         │     │  │     ├─ dark_oak_netherite_barrel.json
         │     │  │     ├─ jungle_copper_barrel.json
         │     │  │     ├─ jungle_copper_exposed_barrel.json
         │     │  │     ├─ jungle_copper_oxidized_barrel.json
         │     │  │     ├─ jungle_copper_weathered_barrel.json
         │     │  │     ├─ jungle_gold_barrel.json
         │     │  │     ├─ jungle_iron_barrel.json
         │     │  │     ├─ jungle_netherite_barrel.json
         │     │  │     ├─ mangrove_copper_barrel.json
         │     │  │     ├─ mangrove_copper_exposed_barrel.json
         │     │  │     ├─ mangrove_copper_oxidized_barrel.json
         │     │  │     ├─ mangrove_copper_weathered_barrel.json
         │     │  │     ├─ mangrove_gold_barrel.json
         │     │  │     ├─ mangrove_iron_barrel.json
         │     │  │     ├─ mangrove_netherite_barrel.json
         │     │  │     ├─ oak_copper_barrel.json
         │     │  │     ├─ oak_copper_exposed_barrel.json
         │     │  │     ├─ oak_copper_oxidized_barrel.json
         │     │  │     ├─ oak_copper_weathered_barrel.json
         │     │  │     ├─ oak_gold_barrel.json
         │     │  │     ├─ oak_iron_barrel.json
         │     │  │     ├─ oak_netherite_barrel.json
         │     │  │     ├─ pale_oak_copper_barrel.json
         │     │  │     ├─ pale_oak_copper_exposed_barrel.json
         │     │  │     ├─ pale_oak_copper_oxidized_barrel.json
         │     │  │     ├─ pale_oak_copper_weathered_barrel.json
         │     │  │     ├─ pale_oak_gold_barrel.json
         │     │  │     ├─ pale_oak_iron_barrel.json
         │     │  │     ├─ pale_oak_netherite_barrel.json
         │     │  │     ├─ spruce_copper_barrel.json
         │     │  │     ├─ spruce_copper_exposed_barrel.json
         │     │  │     ├─ spruce_copper_oxidized_barrel.json
         │     │  │     ├─ spruce_copper_weathered_barrel.json
         │     │  │     ├─ spruce_gold_barrel.json
         │     │  │     ├─ spruce_iron_barrel.json
         │     │  │     ├─ spruce_netherite_barrel.json
         │     │  │     ├─ warped_copper_barrel.json
         │     │  │     ├─ warped_copper_exposed_barrel.json
         │     │  │     ├─ warped_copper_oxidized_barrel.json
         │     │  │     ├─ warped_copper_weathered_barrel.json
         │     │  │     ├─ warped_gold_barrel.json
         │     │  │     ├─ warped_iron_barrel.json
         │     │  │     └─ warped_netherite_barrel.json
         │     │  └─ item
         │     │     └─ flasks
         │     │        ├─ large
         │     │        │  ├─ large_acacia_black_stained_glass_flask.json
         │     │        │  ├─ large_acacia_blue_stained_glass_flask.json
         │     │        │  ├─ large_acacia_brown_stained_glass_flask.json
         │     │        │  ├─ large_acacia_cyan_stained_glass_flask.json
         │     │        │  ├─ large_acacia_glass_flask.json
         │     │        │  ├─ large_acacia_gray_stained_glass_flask.json
         │     │        │  ├─ large_acacia_green_stained_glass_flask.json
         │     │        │  ├─ large_acacia_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_acacia_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_acacia_lime_stained_glass_flask.json
         │     │        │  ├─ large_acacia_magenta_stained_glass_flask.json
         │     │        │  ├─ large_acacia_orange_stained_glass_flask.json
         │     │        │  ├─ large_acacia_pink_stained_glass_flask.json
         │     │        │  ├─ large_acacia_purple_stained_glass_flask.json
         │     │        │  ├─ large_acacia_red_stained_glass_flask.json
         │     │        │  ├─ large_acacia_tinted_glass_flask.json
         │     │        │  ├─ large_acacia_white_stained_glass_flask.json
         │     │        │  ├─ large_acacia_yellow_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_black_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_blue_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_brown_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_cyan_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_glass_flask.json
         │     │        │  ├─ large_bamboo_gray_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_green_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_lime_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_magenta_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_orange_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_pink_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_purple_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_red_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_tinted_glass_flask.json
         │     │        │  ├─ large_bamboo_white_stained_glass_flask.json
         │     │        │  ├─ large_bamboo_yellow_stained_glass_flask.json
         │     │        │  ├─ large_birch_black_stained_glass_flask.json
         │     │        │  ├─ large_birch_blue_stained_glass_flask.json
         │     │        │  ├─ large_birch_brown_stained_glass_flask.json
         │     │        │  ├─ large_birch_cyan_stained_glass_flask.json
         │     │        │  ├─ large_birch_glass_flask.json
         │     │        │  ├─ large_birch_gray_stained_glass_flask.json
         │     │        │  ├─ large_birch_green_stained_glass_flask.json
         │     │        │  ├─ large_birch_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_birch_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_birch_lime_stained_glass_flask.json
         │     │        │  ├─ large_birch_magenta_stained_glass_flask.json
         │     │        │  ├─ large_birch_orange_stained_glass_flask.json
         │     │        │  ├─ large_birch_pink_stained_glass_flask.json
         │     │        │  ├─ large_birch_purple_stained_glass_flask.json
         │     │        │  ├─ large_birch_red_stained_glass_flask.json
         │     │        │  ├─ large_birch_tinted_glass_flask.json
         │     │        │  ├─ large_birch_white_stained_glass_flask.json
         │     │        │  ├─ large_birch_yellow_stained_glass_flask.json
         │     │        │  ├─ large_cherry_black_stained_glass_flask.json
         │     │        │  ├─ large_cherry_blue_stained_glass_flask.json
         │     │        │  ├─ large_cherry_brown_stained_glass_flask.json
         │     │        │  ├─ large_cherry_cyan_stained_glass_flask.json
         │     │        │  ├─ large_cherry_glass_flask.json
         │     │        │  ├─ large_cherry_gray_stained_glass_flask.json
         │     │        │  ├─ large_cherry_green_stained_glass_flask.json
         │     │        │  ├─ large_cherry_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_cherry_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_cherry_lime_stained_glass_flask.json
         │     │        │  ├─ large_cherry_magenta_stained_glass_flask.json
         │     │        │  ├─ large_cherry_orange_stained_glass_flask.json
         │     │        │  ├─ large_cherry_pink_stained_glass_flask.json
         │     │        │  ├─ large_cherry_purple_stained_glass_flask.json
         │     │        │  ├─ large_cherry_red_stained_glass_flask.json
         │     │        │  ├─ large_cherry_tinted_glass_flask.json
         │     │        │  ├─ large_cherry_white_stained_glass_flask.json
         │     │        │  ├─ large_cherry_yellow_stained_glass_flask.json
         │     │        │  ├─ large_crimson_black_stained_glass_flask.json
         │     │        │  ├─ large_crimson_blue_stained_glass_flask.json
         │     │        │  ├─ large_crimson_brown_stained_glass_flask.json
         │     │        │  ├─ large_crimson_cyan_stained_glass_flask.json
         │     │        │  ├─ large_crimson_glass_flask.json
         │     │        │  ├─ large_crimson_gray_stained_glass_flask.json
         │     │        │  ├─ large_crimson_green_stained_glass_flask.json
         │     │        │  ├─ large_crimson_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_crimson_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_crimson_lime_stained_glass_flask.json
         │     │        │  ├─ large_crimson_magenta_stained_glass_flask.json
         │     │        │  ├─ large_crimson_orange_stained_glass_flask.json
         │     │        │  ├─ large_crimson_pink_stained_glass_flask.json
         │     │        │  ├─ large_crimson_purple_stained_glass_flask.json
         │     │        │  ├─ large_crimson_red_stained_glass_flask.json
         │     │        │  ├─ large_crimson_tinted_glass_flask.json
         │     │        │  ├─ large_crimson_white_stained_glass_flask.json
         │     │        │  ├─ large_crimson_yellow_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_glass_flask.json
         │     │        │  ├─ large_dark_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_tinted_glass_flask.json
         │     │        │  ├─ large_dark_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_dark_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_jungle_black_stained_glass_flask.json
         │     │        │  ├─ large_jungle_blue_stained_glass_flask.json
         │     │        │  ├─ large_jungle_brown_stained_glass_flask.json
         │     │        │  ├─ large_jungle_cyan_stained_glass_flask.json
         │     │        │  ├─ large_jungle_glass_flask.json
         │     │        │  ├─ large_jungle_gray_stained_glass_flask.json
         │     │        │  ├─ large_jungle_green_stained_glass_flask.json
         │     │        │  ├─ large_jungle_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_jungle_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_jungle_lime_stained_glass_flask.json
         │     │        │  ├─ large_jungle_magenta_stained_glass_flask.json
         │     │        │  ├─ large_jungle_orange_stained_glass_flask.json
         │     │        │  ├─ large_jungle_pink_stained_glass_flask.json
         │     │        │  ├─ large_jungle_purple_stained_glass_flask.json
         │     │        │  ├─ large_jungle_red_stained_glass_flask.json
         │     │        │  ├─ large_jungle_tinted_glass_flask.json
         │     │        │  ├─ large_jungle_white_stained_glass_flask.json
         │     │        │  ├─ large_jungle_yellow_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_black_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_blue_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_brown_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_cyan_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_glass_flask.json
         │     │        │  ├─ large_mangrove_gray_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_green_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_lime_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_magenta_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_orange_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_pink_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_purple_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_red_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_tinted_glass_flask.json
         │     │        │  ├─ large_mangrove_white_stained_glass_flask.json
         │     │        │  ├─ large_mangrove_yellow_stained_glass_flask.json
         │     │        │  ├─ large_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_oak_glass_flask.json
         │     │        │  ├─ large_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_oak_tinted_glass_flask.json
         │     │        │  ├─ large_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_black_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_blue_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_brown_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_glass_flask.json
         │     │        │  ├─ large_pale_oak_gray_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_green_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_lime_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_orange_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_pink_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_purple_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_red_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_tinted_glass_flask.json
         │     │        │  ├─ large_pale_oak_white_stained_glass_flask.json
         │     │        │  ├─ large_pale_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ large_spruce_black_stained_glass_flask.json
         │     │        │  ├─ large_spruce_blue_stained_glass_flask.json
         │     │        │  ├─ large_spruce_brown_stained_glass_flask.json
         │     │        │  ├─ large_spruce_cyan_stained_glass_flask.json
         │     │        │  ├─ large_spruce_glass_flask.json
         │     │        │  ├─ large_spruce_gray_stained_glass_flask.json
         │     │        │  ├─ large_spruce_green_stained_glass_flask.json
         │     │        │  ├─ large_spruce_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_spruce_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_spruce_lime_stained_glass_flask.json
         │     │        │  ├─ large_spruce_magenta_stained_glass_flask.json
         │     │        │  ├─ large_spruce_orange_stained_glass_flask.json
         │     │        │  ├─ large_spruce_pink_stained_glass_flask.json
         │     │        │  ├─ large_spruce_purple_stained_glass_flask.json
         │     │        │  ├─ large_spruce_red_stained_glass_flask.json
         │     │        │  ├─ large_spruce_tinted_glass_flask.json
         │     │        │  ├─ large_spruce_white_stained_glass_flask.json
         │     │        │  ├─ large_spruce_yellow_stained_glass_flask.json
         │     │        │  ├─ large_warped_black_stained_glass_flask.json
         │     │        │  ├─ large_warped_blue_stained_glass_flask.json
         │     │        │  ├─ large_warped_brown_stained_glass_flask.json
         │     │        │  ├─ large_warped_cyan_stained_glass_flask.json
         │     │        │  ├─ large_warped_glass_flask.json
         │     │        │  ├─ large_warped_gray_stained_glass_flask.json
         │     │        │  ├─ large_warped_green_stained_glass_flask.json
         │     │        │  ├─ large_warped_light_blue_stained_glass_flask.json
         │     │        │  ├─ large_warped_light_gray_stained_glass_flask.json
         │     │        │  ├─ large_warped_lime_stained_glass_flask.json
         │     │        │  ├─ large_warped_magenta_stained_glass_flask.json
         │     │        │  ├─ large_warped_orange_stained_glass_flask.json
         │     │        │  ├─ large_warped_pink_stained_glass_flask.json
         │     │        │  ├─ large_warped_purple_stained_glass_flask.json
         │     │        │  ├─ large_warped_red_stained_glass_flask.json
         │     │        │  ├─ large_warped_tinted_glass_flask.json
         │     │        │  ├─ large_warped_white_stained_glass_flask.json
         │     │        │  └─ large_warped_yellow_stained_glass_flask.json
         │     │        ├─ medium
         │     │        │  ├─ medium_acacia_black_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_blue_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_brown_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_glass_flask.json
         │     │        │  ├─ medium_acacia_gray_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_green_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_lime_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_orange_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_pink_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_purple_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_red_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_tinted_glass_flask.json
         │     │        │  ├─ medium_acacia_white_stained_glass_flask.json
         │     │        │  ├─ medium_acacia_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_black_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_blue_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_brown_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_glass_flask.json
         │     │        │  ├─ medium_bamboo_gray_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_green_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_lime_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_orange_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_pink_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_purple_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_red_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_tinted_glass_flask.json
         │     │        │  ├─ medium_bamboo_white_stained_glass_flask.json
         │     │        │  ├─ medium_bamboo_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_birch_black_stained_glass_flask.json
         │     │        │  ├─ medium_birch_blue_stained_glass_flask.json
         │     │        │  ├─ medium_birch_brown_stained_glass_flask.json
         │     │        │  ├─ medium_birch_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_birch_glass_flask.json
         │     │        │  ├─ medium_birch_gray_stained_glass_flask.json
         │     │        │  ├─ medium_birch_green_stained_glass_flask.json
         │     │        │  ├─ medium_birch_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_birch_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_birch_lime_stained_glass_flask.json
         │     │        │  ├─ medium_birch_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_birch_orange_stained_glass_flask.json
         │     │        │  ├─ medium_birch_pink_stained_glass_flask.json
         │     │        │  ├─ medium_birch_purple_stained_glass_flask.json
         │     │        │  ├─ medium_birch_red_stained_glass_flask.json
         │     │        │  ├─ medium_birch_tinted_glass_flask.json
         │     │        │  ├─ medium_birch_white_stained_glass_flask.json
         │     │        │  ├─ medium_birch_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_black_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_blue_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_brown_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_glass_flask.json
         │     │        │  ├─ medium_cherry_gray_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_green_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_lime_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_orange_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_pink_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_purple_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_red_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_tinted_glass_flask.json
         │     │        │  ├─ medium_cherry_white_stained_glass_flask.json
         │     │        │  ├─ medium_cherry_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_black_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_blue_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_brown_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_glass_flask.json
         │     │        │  ├─ medium_crimson_gray_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_green_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_lime_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_orange_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_pink_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_purple_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_red_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_tinted_glass_flask.json
         │     │        │  ├─ medium_crimson_white_stained_glass_flask.json
         │     │        │  ├─ medium_crimson_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_glass_flask.json
         │     │        │  ├─ medium_dark_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_dark_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_dark_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_black_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_blue_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_brown_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_glass_flask.json
         │     │        │  ├─ medium_jungle_gray_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_green_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_lime_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_orange_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_pink_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_purple_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_red_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_tinted_glass_flask.json
         │     │        │  ├─ medium_jungle_white_stained_glass_flask.json
         │     │        │  ├─ medium_jungle_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_black_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_blue_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_brown_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_glass_flask.json
         │     │        │  ├─ medium_mangrove_gray_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_green_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_lime_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_orange_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_pink_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_purple_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_red_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_tinted_glass_flask.json
         │     │        │  ├─ medium_mangrove_white_stained_glass_flask.json
         │     │        │  ├─ medium_mangrove_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_oak_glass_flask.json
         │     │        │  ├─ medium_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_black_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_blue_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_brown_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_glass_flask.json
         │     │        │  ├─ medium_pale_oak_gray_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_green_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_lime_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_orange_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_pink_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_purple_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_red_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_tinted_glass_flask.json
         │     │        │  ├─ medium_pale_oak_white_stained_glass_flask.json
         │     │        │  ├─ medium_pale_oak_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_black_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_blue_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_brown_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_glass_flask.json
         │     │        │  ├─ medium_spruce_gray_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_green_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_lime_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_orange_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_pink_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_purple_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_red_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_tinted_glass_flask.json
         │     │        │  ├─ medium_spruce_white_stained_glass_flask.json
         │     │        │  ├─ medium_spruce_yellow_stained_glass_flask.json
         │     │        │  ├─ medium_warped_black_stained_glass_flask.json
         │     │        │  ├─ medium_warped_blue_stained_glass_flask.json
         │     │        │  ├─ medium_warped_brown_stained_glass_flask.json
         │     │        │  ├─ medium_warped_cyan_stained_glass_flask.json
         │     │        │  ├─ medium_warped_glass_flask.json
         │     │        │  ├─ medium_warped_gray_stained_glass_flask.json
         │     │        │  ├─ medium_warped_green_stained_glass_flask.json
         │     │        │  ├─ medium_warped_light_blue_stained_glass_flask.json
         │     │        │  ├─ medium_warped_light_gray_stained_glass_flask.json
         │     │        │  ├─ medium_warped_lime_stained_glass_flask.json
         │     │        │  ├─ medium_warped_magenta_stained_glass_flask.json
         │     │        │  ├─ medium_warped_orange_stained_glass_flask.json
         │     │        │  ├─ medium_warped_pink_stained_glass_flask.json
         │     │        │  ├─ medium_warped_purple_stained_glass_flask.json
         │     │        │  ├─ medium_warped_red_stained_glass_flask.json
         │     │        │  ├─ medium_warped_tinted_glass_flask.json
         │     │        │  ├─ medium_warped_white_stained_glass_flask.json
         │     │        │  └─ medium_warped_yellow_stained_glass_flask.json
         │     │        └─ small
         │     │           ├─ small_acacia_black_stained_glass_flask.json
         │     │           ├─ small_acacia_blue_stained_glass_flask.json
         │     │           ├─ small_acacia_brown_stained_glass_flask.json
         │     │           ├─ small_acacia_cyan_stained_glass_flask.json
         │     │           ├─ small_acacia_glass_flask.json
         │     │           ├─ small_acacia_gray_stained_glass_flask.json
         │     │           ├─ small_acacia_green_stained_glass_flask.json
         │     │           ├─ small_acacia_light_blue_stained_glass_flask.json
         │     │           ├─ small_acacia_light_gray_stained_glass_flask.json
         │     │           ├─ small_acacia_lime_stained_glass_flask.json
         │     │           ├─ small_acacia_magenta_stained_glass_flask.json
         │     │           ├─ small_acacia_orange_stained_glass_flask.json
         │     │           ├─ small_acacia_pink_stained_glass_flask.json
         │     │           ├─ small_acacia_purple_stained_glass_flask.json
         │     │           ├─ small_acacia_red_stained_glass_flask.json
         │     │           ├─ small_acacia_tinted_glass_flask.json
         │     │           ├─ small_acacia_white_stained_glass_flask.json
         │     │           ├─ small_acacia_yellow_stained_glass_flask.json
         │     │           ├─ small_bamboo_black_stained_glass_flask.json
         │     │           ├─ small_bamboo_blue_stained_glass_flask.json
         │     │           ├─ small_bamboo_brown_stained_glass_flask.json
         │     │           ├─ small_bamboo_cyan_stained_glass_flask.json
         │     │           ├─ small_bamboo_glass_flask.json
         │     │           ├─ small_bamboo_gray_stained_glass_flask.json
         │     │           ├─ small_bamboo_green_stained_glass_flask.json
         │     │           ├─ small_bamboo_light_blue_stained_glass_flask.json
         │     │           ├─ small_bamboo_light_gray_stained_glass_flask.json
         │     │           ├─ small_bamboo_lime_stained_glass_flask.json
         │     │           ├─ small_bamboo_magenta_stained_glass_flask.json
         │     │           ├─ small_bamboo_orange_stained_glass_flask.json
         │     │           ├─ small_bamboo_pink_stained_glass_flask.json
         │     │           ├─ small_bamboo_purple_stained_glass_flask.json
         │     │           ├─ small_bamboo_red_stained_glass_flask.json
         │     │           ├─ small_bamboo_tinted_glass_flask.json
         │     │           ├─ small_bamboo_white_stained_glass_flask.json
         │     │           ├─ small_bamboo_yellow_stained_glass_flask.json
         │     │           ├─ small_birch_black_stained_glass_flask.json
         │     │           ├─ small_birch_blue_stained_glass_flask.json
         │     │           ├─ small_birch_brown_stained_glass_flask.json
         │     │           ├─ small_birch_cyan_stained_glass_flask.json
         │     │           ├─ small_birch_glass_flask.json
         │     │           ├─ small_birch_gray_stained_glass_flask.json
         │     │           ├─ small_birch_green_stained_glass_flask.json
         │     │           ├─ small_birch_light_blue_stained_glass_flask.json
         │     │           ├─ small_birch_light_gray_stained_glass_flask.json
         │     │           ├─ small_birch_lime_stained_glass_flask.json
         │     │           ├─ small_birch_magenta_stained_glass_flask.json
         │     │           ├─ small_birch_orange_stained_glass_flask.json
         │     │           ├─ small_birch_pink_stained_glass_flask.json
         │     │           ├─ small_birch_purple_stained_glass_flask.json
         │     │           ├─ small_birch_red_stained_glass_flask.json
         │     │           ├─ small_birch_tinted_glass_flask.json
         │     │           ├─ small_birch_white_stained_glass_flask.json
         │     │           ├─ small_birch_yellow_stained_glass_flask.json
         │     │           ├─ small_cherry_black_stained_glass_flask.json
         │     │           ├─ small_cherry_blue_stained_glass_flask.json
         │     │           ├─ small_cherry_brown_stained_glass_flask.json
         │     │           ├─ small_cherry_cyan_stained_glass_flask.json
         │     │           ├─ small_cherry_glass_flask.json
         │     │           ├─ small_cherry_gray_stained_glass_flask.json
         │     │           ├─ small_cherry_green_stained_glass_flask.json
         │     │           ├─ small_cherry_light_blue_stained_glass_flask.json
         │     │           ├─ small_cherry_light_gray_stained_glass_flask.json
         │     │           ├─ small_cherry_lime_stained_glass_flask.json
         │     │           ├─ small_cherry_magenta_stained_glass_flask.json
         │     │           ├─ small_cherry_orange_stained_glass_flask.json
         │     │           ├─ small_cherry_pink_stained_glass_flask.json
         │     │           ├─ small_cherry_purple_stained_glass_flask.json
         │     │           ├─ small_cherry_red_stained_glass_flask.json
         │     │           ├─ small_cherry_tinted_glass_flask.json
         │     │           ├─ small_cherry_white_stained_glass_flask.json
         │     │           ├─ small_cherry_yellow_stained_glass_flask.json
         │     │           ├─ small_crimson_black_stained_glass_flask.json
         │     │           ├─ small_crimson_blue_stained_glass_flask.json
         │     │           ├─ small_crimson_brown_stained_glass_flask.json
         │     │           ├─ small_crimson_cyan_stained_glass_flask.json
         │     │           ├─ small_crimson_glass_flask.json
         │     │           ├─ small_crimson_gray_stained_glass_flask.json
         │     │           ├─ small_crimson_green_stained_glass_flask.json
         │     │           ├─ small_crimson_light_blue_stained_glass_flask.json
         │     │           ├─ small_crimson_light_gray_stained_glass_flask.json
         │     │           ├─ small_crimson_lime_stained_glass_flask.json
         │     │           ├─ small_crimson_magenta_stained_glass_flask.json
         │     │           ├─ small_crimson_orange_stained_glass_flask.json
         │     │           ├─ small_crimson_pink_stained_glass_flask.json
         │     │           ├─ small_crimson_purple_stained_glass_flask.json
         │     │           ├─ small_crimson_red_stained_glass_flask.json
         │     │           ├─ small_crimson_tinted_glass_flask.json
         │     │           ├─ small_crimson_white_stained_glass_flask.json
         │     │           ├─ small_crimson_yellow_stained_glass_flask.json
         │     │           ├─ small_dark_oak_black_stained_glass_flask.json
         │     │           ├─ small_dark_oak_blue_stained_glass_flask.json
         │     │           ├─ small_dark_oak_brown_stained_glass_flask.json
         │     │           ├─ small_dark_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_dark_oak_glass_flask.json
         │     │           ├─ small_dark_oak_gray_stained_glass_flask.json
         │     │           ├─ small_dark_oak_green_stained_glass_flask.json
         │     │           ├─ small_dark_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_dark_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_dark_oak_lime_stained_glass_flask.json
         │     │           ├─ small_dark_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_dark_oak_orange_stained_glass_flask.json
         │     │           ├─ small_dark_oak_pink_stained_glass_flask.json
         │     │           ├─ small_dark_oak_purple_stained_glass_flask.json
         │     │           ├─ small_dark_oak_red_stained_glass_flask.json
         │     │           ├─ small_dark_oak_tinted_glass_flask.json
         │     │           ├─ small_dark_oak_white_stained_glass_flask.json
         │     │           ├─ small_dark_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_jungle_black_stained_glass_flask.json
         │     │           ├─ small_jungle_blue_stained_glass_flask.json
         │     │           ├─ small_jungle_brown_stained_glass_flask.json
         │     │           ├─ small_jungle_cyan_stained_glass_flask.json
         │     │           ├─ small_jungle_glass_flask.json
         │     │           ├─ small_jungle_gray_stained_glass_flask.json
         │     │           ├─ small_jungle_green_stained_glass_flask.json
         │     │           ├─ small_jungle_light_blue_stained_glass_flask.json
         │     │           ├─ small_jungle_light_gray_stained_glass_flask.json
         │     │           ├─ small_jungle_lime_stained_glass_flask.json
         │     │           ├─ small_jungle_magenta_stained_glass_flask.json
         │     │           ├─ small_jungle_orange_stained_glass_flask.json
         │     │           ├─ small_jungle_pink_stained_glass_flask.json
         │     │           ├─ small_jungle_purple_stained_glass_flask.json
         │     │           ├─ small_jungle_red_stained_glass_flask.json
         │     │           ├─ small_jungle_tinted_glass_flask.json
         │     │           ├─ small_jungle_white_stained_glass_flask.json
         │     │           ├─ small_jungle_yellow_stained_glass_flask.json
         │     │           ├─ small_mangrove_black_stained_glass_flask.json
         │     │           ├─ small_mangrove_blue_stained_glass_flask.json
         │     │           ├─ small_mangrove_brown_stained_glass_flask.json
         │     │           ├─ small_mangrove_cyan_stained_glass_flask.json
         │     │           ├─ small_mangrove_glass_flask.json
         │     │           ├─ small_mangrove_gray_stained_glass_flask.json
         │     │           ├─ small_mangrove_green_stained_glass_flask.json
         │     │           ├─ small_mangrove_light_blue_stained_glass_flask.json
         │     │           ├─ small_mangrove_light_gray_stained_glass_flask.json
         │     │           ├─ small_mangrove_lime_stained_glass_flask.json
         │     │           ├─ small_mangrove_magenta_stained_glass_flask.json
         │     │           ├─ small_mangrove_orange_stained_glass_flask.json
         │     │           ├─ small_mangrove_pink_stained_glass_flask.json
         │     │           ├─ small_mangrove_purple_stained_glass_flask.json
         │     │           ├─ small_mangrove_red_stained_glass_flask.json
         │     │           ├─ small_mangrove_tinted_glass_flask.json
         │     │           ├─ small_mangrove_white_stained_glass_flask.json
         │     │           ├─ small_mangrove_yellow_stained_glass_flask.json
         │     │           ├─ small_oak_black_stained_glass_flask.json
         │     │           ├─ small_oak_blue_stained_glass_flask.json
         │     │           ├─ small_oak_brown_stained_glass_flask.json
         │     │           ├─ small_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_oak_glass_flask.json
         │     │           ├─ small_oak_gray_stained_glass_flask.json
         │     │           ├─ small_oak_green_stained_glass_flask.json
         │     │           ├─ small_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_oak_lime_stained_glass_flask.json
         │     │           ├─ small_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_oak_orange_stained_glass_flask.json
         │     │           ├─ small_oak_pink_stained_glass_flask.json
         │     │           ├─ small_oak_purple_stained_glass_flask.json
         │     │           ├─ small_oak_red_stained_glass_flask.json
         │     │           ├─ small_oak_tinted_glass_flask.json
         │     │           ├─ small_oak_white_stained_glass_flask.json
         │     │           ├─ small_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_pale_oak_black_stained_glass_flask.json
         │     │           ├─ small_pale_oak_blue_stained_glass_flask.json
         │     │           ├─ small_pale_oak_brown_stained_glass_flask.json
         │     │           ├─ small_pale_oak_cyan_stained_glass_flask.json
         │     │           ├─ small_pale_oak_glass_flask.json
         │     │           ├─ small_pale_oak_gray_stained_glass_flask.json
         │     │           ├─ small_pale_oak_green_stained_glass_flask.json
         │     │           ├─ small_pale_oak_light_blue_stained_glass_flask.json
         │     │           ├─ small_pale_oak_light_gray_stained_glass_flask.json
         │     │           ├─ small_pale_oak_lime_stained_glass_flask.json
         │     │           ├─ small_pale_oak_magenta_stained_glass_flask.json
         │     │           ├─ small_pale_oak_orange_stained_glass_flask.json
         │     │           ├─ small_pale_oak_pink_stained_glass_flask.json
         │     │           ├─ small_pale_oak_purple_stained_glass_flask.json
         │     │           ├─ small_pale_oak_red_stained_glass_flask.json
         │     │           ├─ small_pale_oak_tinted_glass_flask.json
         │     │           ├─ small_pale_oak_white_stained_glass_flask.json
         │     │           ├─ small_pale_oak_yellow_stained_glass_flask.json
         │     │           ├─ small_spruce_black_stained_glass_flask.json
         │     │           ├─ small_spruce_blue_stained_glass_flask.json
         │     │           ├─ small_spruce_brown_stained_glass_flask.json
         │     │           ├─ small_spruce_cyan_stained_glass_flask.json
         │     │           ├─ small_spruce_glass_flask.json
         │     │           ├─ small_spruce_gray_stained_glass_flask.json
         │     │           ├─ small_spruce_green_stained_glass_flask.json
         │     │           ├─ small_spruce_light_blue_stained_glass_flask.json
         │     │           ├─ small_spruce_light_gray_stained_glass_flask.json
         │     │           ├─ small_spruce_lime_stained_glass_flask.json
         │     │           ├─ small_spruce_magenta_stained_glass_flask.json
         │     │           ├─ small_spruce_orange_stained_glass_flask.json
         │     │           ├─ small_spruce_pink_stained_glass_flask.json
         │     │           ├─ small_spruce_purple_stained_glass_flask.json
         │     │           ├─ small_spruce_red_stained_glass_flask.json
         │     │           ├─ small_spruce_tinted_glass_flask.json
         │     │           ├─ small_spruce_white_stained_glass_flask.json
         │     │           ├─ small_spruce_yellow_stained_glass_flask.json
         │     │           ├─ small_warped_black_stained_glass_flask.json
         │     │           ├─ small_warped_blue_stained_glass_flask.json
         │     │           ├─ small_warped_brown_stained_glass_flask.json
         │     │           ├─ small_warped_cyan_stained_glass_flask.json
         │     │           ├─ small_warped_glass_flask.json
         │     │           ├─ small_warped_gray_stained_glass_flask.json
         │     │           ├─ small_warped_green_stained_glass_flask.json
         │     │           ├─ small_warped_light_blue_stained_glass_flask.json
         │     │           ├─ small_warped_light_gray_stained_glass_flask.json
         │     │           ├─ small_warped_lime_stained_glass_flask.json
         │     │           ├─ small_warped_magenta_stained_glass_flask.json
         │     │           ├─ small_warped_orange_stained_glass_flask.json
         │     │           ├─ small_warped_pink_stained_glass_flask.json
         │     │           ├─ small_warped_purple_stained_glass_flask.json
         │     │           ├─ small_warped_red_stained_glass_flask.json
         │     │           ├─ small_warped_tinted_glass_flask.json
         │     │           ├─ small_warped_white_stained_glass_flask.json
         │     │           └─ small_warped_yellow_stained_glass_flask.json
         │     └─ textures
         │        ├─ block
         │        │  └─ barrels
         │        │     ├─ acacia_barrel_bottom.png
         │        │     ├─ acacia_barrel_top.png
         │        │     ├─ acacia_copper_barrel_side.png
         │        │     ├─ acacia_copper_exposed_barrel_side.png
         │        │     ├─ acacia_copper_oxidized_barrel_side.png
         │        │     ├─ acacia_copper_weathered_barrel_side.png
         │        │     ├─ acacia_gold_barrel_side.png
         │        │     ├─ acacia_iron_barrel_side.png
         │        │     ├─ acacia_netherite_barrel_side.png
         │        │     ├─ bamboo_barrel_bottom.png
         │        │     ├─ bamboo_barrel_top.png
         │        │     ├─ bamboo_copper_barrel_side.png
         │        │     ├─ bamboo_copper_exposed_barrel_side.png
         │        │     ├─ bamboo_copper_oxidized_barrel_side.png
         │        │     ├─ bamboo_copper_weathered_barrel_side.png
         │        │     ├─ bamboo_gold_barrel_side.png
         │        │     ├─ bamboo_iron_barrel_side.png
         │        │     ├─ bamboo_netherite_barrel_side.png
         │        │     ├─ birch_barrel_bottom.png
         │        │     ├─ birch_barrel_top.png
         │        │     ├─ birch_copper_barrel_side.png
         │        │     ├─ birch_copper_exposed_barrel_side.png
         │        │     ├─ birch_copper_oxidized_barrel_side.png
         │        │     ├─ birch_copper_weathered_barrel_side.png
         │        │     ├─ birch_gold_barrel_side.png
         │        │     ├─ birch_iron_barrel_side.png
         │        │     ├─ birch_netherite_barrel_side.png
         │        │     ├─ cherry_barrel_bottom.png
         │        │     ├─ cherry_barrel_top.png
         │        │     ├─ cherry_copper_barrel_side.png
         │        │     ├─ cherry_copper_exposed_barrel_side.png
         │        │     ├─ cherry_copper_oxidized_barrel_side.png
         │        │     ├─ cherry_copper_weathered_barrel_side.png
         │        │     ├─ cherry_gold_barrel_side.png
         │        │     ├─ cherry_iron_barrel_side.png
         │        │     ├─ cherry_netherite_barrel_side.png
         │        │     ├─ crimson_barrel_bottom.png
         │        │     ├─ crimson_barrel_top.png
         │        │     ├─ crimson_copper_barrel_side.png
         │        │     ├─ crimson_copper_exposed_barrel_side.png
         │        │     ├─ crimson_copper_oxidized_barrel_side.png
         │        │     ├─ crimson_copper_weathered_barrel_side.png
         │        │     ├─ crimson_gold_barrel_side.png
         │        │     ├─ crimson_iron_barrel_side.png
         │        │     ├─ crimson_netherite_barrel_side.png
         │        │     ├─ dark_oak_barrel_bottom.png
         │        │     ├─ dark_oak_barrel_top.png
         │        │     ├─ dark_oak_copper_barrel_side.png
         │        │     ├─ dark_oak_copper_exposed_barrel_side.png
         │        │     ├─ dark_oak_copper_oxidized_barrel_side.png
         │        │     ├─ dark_oak_copper_weathered_barrel_side.png
         │        │     ├─ dark_oak_gold_barrel_side.png
         │        │     ├─ dark_oak_iron_barrel_side.png
         │        │     ├─ dark_oak_netherite_barrel_side.png
         │        │     ├─ jungle_barrel_bottom.png
         │        │     ├─ jungle_barrel_top.png
         │        │     ├─ jungle_copper_barrel_side.png
         │        │     ├─ jungle_copper_exposed_barrel_side.png
         │        │     ├─ jungle_copper_oxidized_barrel_side.png
         │        │     ├─ jungle_copper_weathered_barrel_side.png
         │        │     ├─ jungle_gold_barrel_side.png
         │        │     ├─ jungle_iron_barrel_side.png
         │        │     ├─ jungle_netherite_barrel_side.png
         │        │     ├─ mangrove_barrel_bottom.png
         │        │     ├─ mangrove_barrel_top.png
         │        │     ├─ mangrove_copper_barrel_side.png
         │        │     ├─ mangrove_copper_exposed_barrel_side.png
         │        │     ├─ mangrove_copper_oxidized_barrel_side.png
         │        │     ├─ mangrove_copper_weathered_barrel_side.png
         │        │     ├─ mangrove_gold_barrel_side.png
         │        │     ├─ mangrove_iron_barrel_side.png
         │        │     ├─ mangrove_netherite_barrel_side.png
         │        │     ├─ oak_barrel_bottom.png
         │        │     ├─ oak_barrel_top.png
         │        │     ├─ oak_copper_barrel_side.png
         │        │     ├─ oak_copper_exposed_barrel_side.png
         │        │     ├─ oak_copper_oxidized_barrel_side.png
         │        │     ├─ oak_copper_weathered_barrel_side.png
         │        │     ├─ oak_gold_barrel_side.png
         │        │     ├─ oak_iron_barrel_side.png
         │        │     ├─ oak_netherite_barrel_side.png
         │        │     ├─ pale_oak_barrel_bottom.png
         │        │     ├─ pale_oak_barrel_top.png
         │        │     ├─ pale_oak_copper_barrel_side.png
         │        │     ├─ pale_oak_copper_exposed_barrel_side.png
         │        │     ├─ pale_oak_copper_oxidized_barrel_side.png
         │        │     ├─ pale_oak_copper_weathered_barrel_side.png
         │        │     ├─ pale_oak_gold_barrel_side.png
         │        │     ├─ pale_oak_iron_barrel_side.png
         │        │     ├─ pale_oak_netherite_barrel_side.png
         │        │     ├─ spruce_barrel_bottom.png
         │        │     ├─ spruce_barrel_top.png
         │        │     ├─ spruce_copper_barrel_side.png
         │        │     ├─ spruce_copper_exposed_barrel_side.png
         │        │     ├─ spruce_copper_oxidized_barrel_side.png
         │        │     ├─ spruce_copper_weathered_barrel_side.png
         │        │     ├─ spruce_gold_barrel_side.png
         │        │     ├─ spruce_iron_barrel_side.png
         │        │     ├─ spruce_netherite_barrel_side.png
         │        │     ├─ warped_barrel_bottom.png
         │        │     ├─ warped_barrel_top.png
         │        │     ├─ warped_copper_barrel_side.png
         │        │     ├─ warped_copper_exposed_barrel_side.png
         │        │     ├─ warped_copper_oxidized_barrel_side.png
         │        │     ├─ warped_copper_weathered_barrel_side.png
         │        │     ├─ warped_gold_barrel_side.png
         │        │     ├─ warped_iron_barrel_side.png
         │        │     └─ warped_netherite_barrel_side.png
         │        ├─ gui
         │        │  ├─ large_flask_fluid_overlay.png
         │        │  ├─ medium_flask_fluid_overlay.png
         │        │  ├─ progress_bar.png
         │        │  └─ small_flask_fluid_overlay.png
         │        └─ item
         │           └─ flasks
         │              ├─ large
         │              │  ├─ large_acacia_black_stained_glass_flask.png
         │              │  ├─ large_acacia_blue_stained_glass_flask.png
         │              │  ├─ large_acacia_brown_stained_glass_flask.png
         │              │  ├─ large_acacia_cyan_stained_glass_flask.png
         │              │  ├─ large_acacia_glass_flask.png
         │              │  ├─ large_acacia_gray_stained_glass_flask.png
         │              │  ├─ large_acacia_green_stained_glass_flask.png
         │              │  ├─ large_acacia_light_blue_stained_glass_flask.png
         │              │  ├─ large_acacia_light_gray_stained_glass_flask.png
         │              │  ├─ large_acacia_lime_stained_glass_flask.png
         │              │  ├─ large_acacia_magenta_stained_glass_flask.png
         │              │  ├─ large_acacia_orange_stained_glass_flask.png
         │              │  ├─ large_acacia_pink_stained_glass_flask.png
         │              │  ├─ large_acacia_purple_stained_glass_flask.png
         │              │  ├─ large_acacia_red_stained_glass_flask.png
         │              │  ├─ large_acacia_tinted_glass_flask.png
         │              │  ├─ large_acacia_white_stained_glass_flask.png
         │              │  ├─ large_acacia_yellow_stained_glass_flask.png
         │              │  ├─ large_bamboo_black_stained_glass_flask.png
         │              │  ├─ large_bamboo_blue_stained_glass_flask.png
         │              │  ├─ large_bamboo_brown_stained_glass_flask.png
         │              │  ├─ large_bamboo_cyan_stained_glass_flask.png
         │              │  ├─ large_bamboo_glass_flask.png
         │              │  ├─ large_bamboo_gray_stained_glass_flask.png
         │              │  ├─ large_bamboo_green_stained_glass_flask.png
         │              │  ├─ large_bamboo_light_blue_stained_glass_flask.png
         │              │  ├─ large_bamboo_light_gray_stained_glass_flask.png
         │              │  ├─ large_bamboo_lime_stained_glass_flask.png
         │              │  ├─ large_bamboo_magenta_stained_glass_flask.png
         │              │  ├─ large_bamboo_orange_stained_glass_flask.png
         │              │  ├─ large_bamboo_pink_stained_glass_flask.png
         │              │  ├─ large_bamboo_purple_stained_glass_flask.png
         │              │  ├─ large_bamboo_red_stained_glass_flask.png
         │              │  ├─ large_bamboo_tinted_glass_flask.png
         │              │  ├─ large_bamboo_white_stained_glass_flask.png
         │              │  ├─ large_bamboo_yellow_stained_glass_flask.png
         │              │  ├─ large_birch_black_stained_glass_flask.png
         │              │  ├─ large_birch_blue_stained_glass_flask.png
         │              │  ├─ large_birch_brown_stained_glass_flask.png
         │              │  ├─ large_birch_cyan_stained_glass_flask.png
         │              │  ├─ large_birch_glass_flask.png
         │              │  ├─ large_birch_gray_stained_glass_flask.png
         │              │  ├─ large_birch_green_stained_glass_flask.png
         │              │  ├─ large_birch_light_blue_stained_glass_flask.png
         │              │  ├─ large_birch_light_gray_stained_glass_flask.png
         │              │  ├─ large_birch_lime_stained_glass_flask.png
         │              │  ├─ large_birch_magenta_stained_glass_flask.png
         │              │  ├─ large_birch_orange_stained_glass_flask.png
         │              │  ├─ large_birch_pink_stained_glass_flask.png
         │              │  ├─ large_birch_purple_stained_glass_flask.png
         │              │  ├─ large_birch_red_stained_glass_flask.png
         │              │  ├─ large_birch_tinted_glass_flask.png
         │              │  ├─ large_birch_white_stained_glass_flask.png
         │              │  ├─ large_birch_yellow_stained_glass_flask.png
         │              │  ├─ large_cherry_black_stained_glass_flask.png
         │              │  ├─ large_cherry_blue_stained_glass_flask.png
         │              │  ├─ large_cherry_brown_stained_glass_flask.png
         │              │  ├─ large_cherry_cyan_stained_glass_flask.png
         │              │  ├─ large_cherry_glass_flask.png
         │              │  ├─ large_cherry_gray_stained_glass_flask.png
         │              │  ├─ large_cherry_green_stained_glass_flask.png
         │              │  ├─ large_cherry_light_blue_stained_glass_flask.png
         │              │  ├─ large_cherry_light_gray_stained_glass_flask.png
         │              │  ├─ large_cherry_lime_stained_glass_flask.png
         │              │  ├─ large_cherry_magenta_stained_glass_flask.png
         │              │  ├─ large_cherry_orange_stained_glass_flask.png
         │              │  ├─ large_cherry_pink_stained_glass_flask.png
         │              │  ├─ large_cherry_purple_stained_glass_flask.png
         │              │  ├─ large_cherry_red_stained_glass_flask.png
         │              │  ├─ large_cherry_tinted_glass_flask.png
         │              │  ├─ large_cherry_white_stained_glass_flask.png
         │              │  ├─ large_cherry_yellow_stained_glass_flask.png
         │              │  ├─ large_crimson_black_stained_glass_flask.png
         │              │  ├─ large_crimson_blue_stained_glass_flask.png
         │              │  ├─ large_crimson_brown_stained_glass_flask.png
         │              │  ├─ large_crimson_cyan_stained_glass_flask.png
         │              │  ├─ large_crimson_glass_flask.png
         │              │  ├─ large_crimson_gray_stained_glass_flask.png
         │              │  ├─ large_crimson_green_stained_glass_flask.png
         │              │  ├─ large_crimson_light_blue_stained_glass_flask.png
         │              │  ├─ large_crimson_light_gray_stained_glass_flask.png
         │              │  ├─ large_crimson_lime_stained_glass_flask.png
         │              │  ├─ large_crimson_magenta_stained_glass_flask.png
         │              │  ├─ large_crimson_orange_stained_glass_flask.png
         │              │  ├─ large_crimson_pink_stained_glass_flask.png
         │              │  ├─ large_crimson_purple_stained_glass_flask.png
         │              │  ├─ large_crimson_red_stained_glass_flask.png
         │              │  ├─ large_crimson_tinted_glass_flask.png
         │              │  ├─ large_crimson_white_stained_glass_flask.png
         │              │  ├─ large_crimson_yellow_stained_glass_flask.png
         │              │  ├─ large_dark_oak_black_stained_glass_flask.png
         │              │  ├─ large_dark_oak_blue_stained_glass_flask.png
         │              │  ├─ large_dark_oak_brown_stained_glass_flask.png
         │              │  ├─ large_dark_oak_cyan_stained_glass_flask.png
         │              │  ├─ large_dark_oak_glass_flask.png
         │              │  ├─ large_dark_oak_gray_stained_glass_flask.png
         │              │  ├─ large_dark_oak_green_stained_glass_flask.png
         │              │  ├─ large_dark_oak_light_blue_stained_glass_flask.png
         │              │  ├─ large_dark_oak_light_gray_stained_glass_flask.png
         │              │  ├─ large_dark_oak_lime_stained_glass_flask.png
         │              │  ├─ large_dark_oak_magenta_stained_glass_flask.png
         │              │  ├─ large_dark_oak_orange_stained_glass_flask.png
         │              │  ├─ large_dark_oak_pink_stained_glass_flask.png
         │              │  ├─ large_dark_oak_purple_stained_glass_flask.png
         │              │  ├─ large_dark_oak_red_stained_glass_flask.png
         │              │  ├─ large_dark_oak_tinted_glass_flask.png
         │              │  ├─ large_dark_oak_white_stained_glass_flask.png
         │              │  ├─ large_dark_oak_yellow_stained_glass_flask.png
         │              │  ├─ large_jungle_black_stained_glass_flask.png
         │              │  ├─ large_jungle_blue_stained_glass_flask.png
         │              │  ├─ large_jungle_brown_stained_glass_flask.png
         │              │  ├─ large_jungle_cyan_stained_glass_flask.png
         │              │  ├─ large_jungle_glass_flask.png
         │              │  ├─ large_jungle_gray_stained_glass_flask.png
         │              │  ├─ large_jungle_green_stained_glass_flask.png
         │              │  ├─ large_jungle_light_blue_stained_glass_flask.png
         │              │  ├─ large_jungle_light_gray_stained_glass_flask.png
         │              │  ├─ large_jungle_lime_stained_glass_flask.png
         │              │  ├─ large_jungle_magenta_stained_glass_flask.png
         │              │  ├─ large_jungle_orange_stained_glass_flask.png
         │              │  ├─ large_jungle_pink_stained_glass_flask.png
         │              │  ├─ large_jungle_purple_stained_glass_flask.png
         │              │  ├─ large_jungle_red_stained_glass_flask.png
         │              │  ├─ large_jungle_tinted_glass_flask.png
         │              │  ├─ large_jungle_white_stained_glass_flask.png
         │              │  ├─ large_jungle_yellow_stained_glass_flask.png
         │              │  ├─ large_mangrove_black_stained_glass_flask.png
         │              │  ├─ large_mangrove_blue_stained_glass_flask.png
         │              │  ├─ large_mangrove_brown_stained_glass_flask.png
         │              │  ├─ large_mangrove_cyan_stained_glass_flask.png
         │              │  ├─ large_mangrove_glass_flask.png
         │              │  ├─ large_mangrove_gray_stained_glass_flask.png
         │              │  ├─ large_mangrove_green_stained_glass_flask.png
         │              │  ├─ large_mangrove_light_blue_stained_glass_flask.png
         │              │  ├─ large_mangrove_light_gray_stained_glass_flask.png
         │              │  ├─ large_mangrove_lime_stained_glass_flask.png
         │              │  ├─ large_mangrove_magenta_stained_glass_flask.png
         │              │  ├─ large_mangrove_orange_stained_glass_flask.png
         │              │  ├─ large_mangrove_pink_stained_glass_flask.png
         │              │  ├─ large_mangrove_purple_stained_glass_flask.png
         │              │  ├─ large_mangrove_red_stained_glass_flask.png
         │              │  ├─ large_mangrove_tinted_glass_flask.png
         │              │  ├─ large_mangrove_white_stained_glass_flask.png
         │              │  ├─ large_mangrove_yellow_stained_glass_flask.png
         │              │  ├─ large_oak_black_stained_glass_flask.png
         │              │  ├─ large_oak_blue_stained_glass_flask.png
         │              │  ├─ large_oak_brown_stained_glass_flask.png
         │              │  ├─ large_oak_cyan_stained_glass_flask.png
         │              │  ├─ large_oak_glass_flask.png
         │              │  ├─ large_oak_gray_stained_glass_flask.png
         │              │  ├─ large_oak_green_stained_glass_flask.png
         │              │  ├─ large_oak_light_blue_stained_glass_flask.png
         │              │  ├─ large_oak_light_gray_stained_glass_flask.png
         │              │  ├─ large_oak_lime_stained_glass_flask.png
         │              │  ├─ large_oak_magenta_stained_glass_flask.png
         │              │  ├─ large_oak_orange_stained_glass_flask.png
         │              │  ├─ large_oak_pink_stained_glass_flask.png
         │              │  ├─ large_oak_purple_stained_glass_flask.png
         │              │  ├─ large_oak_red_stained_glass_flask.png
         │              │  ├─ large_oak_tinted_glass_flask.png
         │              │  ├─ large_oak_white_stained_glass_flask.png
         │              │  ├─ large_oak_yellow_stained_glass_flask.png
         │              │  ├─ large_pale_oak_black_stained_glass_flask.png
         │              │  ├─ large_pale_oak_blue_stained_glass_flask.png
         │              │  ├─ large_pale_oak_brown_stained_glass_flask.png
         │              │  ├─ large_pale_oak_cyan_stained_glass_flask.png
         │              │  ├─ large_pale_oak_glass_flask.png
         │              │  ├─ large_pale_oak_gray_stained_glass_flask.png
         │              │  ├─ large_pale_oak_green_stained_glass_flask.png
         │              │  ├─ large_pale_oak_light_blue_stained_glass_flask.png
         │              │  ├─ large_pale_oak_light_gray_stained_glass_flask.png
         │              │  ├─ large_pale_oak_lime_stained_glass_flask.png
         │              │  ├─ large_pale_oak_magenta_stained_glass_flask.png
         │              │  ├─ large_pale_oak_orange_stained_glass_flask.png
         │              │  ├─ large_pale_oak_pink_stained_glass_flask.png
         │              │  ├─ large_pale_oak_purple_stained_glass_flask.png
         │              │  ├─ large_pale_oak_red_stained_glass_flask.png
         │              │  ├─ large_pale_oak_tinted_glass_flask.png
         │              │  ├─ large_pale_oak_white_stained_glass_flask.png
         │              │  ├─ large_pale_oak_yellow_stained_glass_flask.png
         │              │  ├─ large_spruce_black_stained_glass_flask.png
         │              │  ├─ large_spruce_blue_stained_glass_flask.png
         │              │  ├─ large_spruce_brown_stained_glass_flask.png
         │              │  ├─ large_spruce_cyan_stained_glass_flask.png
         │              │  ├─ large_spruce_glass_flask.png
         │              │  ├─ large_spruce_gray_stained_glass_flask.png
         │              │  ├─ large_spruce_green_stained_glass_flask.png
         │              │  ├─ large_spruce_light_blue_stained_glass_flask.png
         │              │  ├─ large_spruce_light_gray_stained_glass_flask.png
         │              │  ├─ large_spruce_lime_stained_glass_flask.png
         │              │  ├─ large_spruce_magenta_stained_glass_flask.png
         │              │  ├─ large_spruce_orange_stained_glass_flask.png
         │              │  ├─ large_spruce_pink_stained_glass_flask.png
         │              │  ├─ large_spruce_purple_stained_glass_flask.png
         │              │  ├─ large_spruce_red_stained_glass_flask.png
         │              │  ├─ large_spruce_tinted_glass_flask.png
         │              │  ├─ large_spruce_white_stained_glass_flask.png
         │              │  ├─ large_spruce_yellow_stained_glass_flask.png
         │              │  ├─ large_warped_black_stained_glass_flask.png
         │              │  ├─ large_warped_blue_stained_glass_flask.png
         │              │  ├─ large_warped_brown_stained_glass_flask.png
         │              │  ├─ large_warped_cyan_stained_glass_flask.png
         │              │  ├─ large_warped_glass_flask.png
         │              │  ├─ large_warped_gray_stained_glass_flask.png
         │              │  ├─ large_warped_green_stained_glass_flask.png
         │              │  ├─ large_warped_light_blue_stained_glass_flask.png
         │              │  ├─ large_warped_light_gray_stained_glass_flask.png
         │              │  ├─ large_warped_lime_stained_glass_flask.png
         │              │  ├─ large_warped_magenta_stained_glass_flask.png
         │              │  ├─ large_warped_orange_stained_glass_flask.png
         │              │  ├─ large_warped_pink_stained_glass_flask.png
         │              │  ├─ large_warped_purple_stained_glass_flask.png
         │              │  ├─ large_warped_red_stained_glass_flask.png
         │              │  ├─ large_warped_tinted_glass_flask.png
         │              │  ├─ large_warped_white_stained_glass_flask.png
         │              │  └─ large_warped_yellow_stained_glass_flask.png
         │              ├─ medium
         │              │  ├─ medium_acacia_black_stained_glass_flask.png
         │              │  ├─ medium_acacia_blue_stained_glass_flask.png
         │              │  ├─ medium_acacia_brown_stained_glass_flask.png
         │              │  ├─ medium_acacia_cyan_stained_glass_flask.png
         │              │  ├─ medium_acacia_glass_flask.png
         │              │  ├─ medium_acacia_gray_stained_glass_flask.png
         │              │  ├─ medium_acacia_green_stained_glass_flask.png
         │              │  ├─ medium_acacia_light_blue_stained_glass_flask.png
         │              │  ├─ medium_acacia_light_gray_stained_glass_flask.png
         │              │  ├─ medium_acacia_lime_stained_glass_flask.png
         │              │  ├─ medium_acacia_magenta_stained_glass_flask.png
         │              │  ├─ medium_acacia_orange_stained_glass_flask.png
         │              │  ├─ medium_acacia_pink_stained_glass_flask.png
         │              │  ├─ medium_acacia_purple_stained_glass_flask.png
         │              │  ├─ medium_acacia_red_stained_glass_flask.png
         │              │  ├─ medium_acacia_tinted_glass_flask.png
         │              │  ├─ medium_acacia_white_stained_glass_flask.png
         │              │  ├─ medium_acacia_yellow_stained_glass_flask.png
         │              │  ├─ medium_bamboo_black_stained_glass_flask.png
         │              │  ├─ medium_bamboo_blue_stained_glass_flask.png
         │              │  ├─ medium_bamboo_brown_stained_glass_flask.png
         │              │  ├─ medium_bamboo_cyan_stained_glass_flask.png
         │              │  ├─ medium_bamboo_glass_flask.png
         │              │  ├─ medium_bamboo_gray_stained_glass_flask.png
         │              │  ├─ medium_bamboo_green_stained_glass_flask.png
         │              │  ├─ medium_bamboo_light_blue_stained_glass_flask.png
         │              │  ├─ medium_bamboo_light_gray_stained_glass_flask.png
         │              │  ├─ medium_bamboo_lime_stained_glass_flask.png
         │              │  ├─ medium_bamboo_magenta_stained_glass_flask.png
         │              │  ├─ medium_bamboo_orange_stained_glass_flask.png
         │              │  ├─ medium_bamboo_pink_stained_glass_flask.png
         │              │  ├─ medium_bamboo_purple_stained_glass_flask.png
         │              │  ├─ medium_bamboo_red_stained_glass_flask.png
         │              │  ├─ medium_bamboo_tinted_glass_flask.png
         │              │  ├─ medium_bamboo_white_stained_glass_flask.png
         │              │  ├─ medium_bamboo_yellow_stained_glass_flask.png
         │              │  ├─ medium_birch_black_stained_glass_flask.png
         │              │  ├─ medium_birch_blue_stained_glass_flask.png
         │              │  ├─ medium_birch_brown_stained_glass_flask.png
         │              │  ├─ medium_birch_cyan_stained_glass_flask.png
         │              │  ├─ medium_birch_glass_flask.png
         │              │  ├─ medium_birch_gray_stained_glass_flask.png
         │              │  ├─ medium_birch_green_stained_glass_flask.png
         │              │  ├─ medium_birch_light_blue_stained_glass_flask.png
         │              │  ├─ medium_birch_light_gray_stained_glass_flask.png
         │              │  ├─ medium_birch_lime_stained_glass_flask.png
         │              │  ├─ medium_birch_magenta_stained_glass_flask.png
         │              │  ├─ medium_birch_orange_stained_glass_flask.png
         │              │  ├─ medium_birch_pink_stained_glass_flask.png
         │              │  ├─ medium_birch_purple_stained_glass_flask.png
         │              │  ├─ medium_birch_red_stained_glass_flask.png
         │              │  ├─ medium_birch_tinted_glass_flask.png
         │              │  ├─ medium_birch_white_stained_glass_flask.png
         │              │  ├─ medium_birch_yellow_stained_glass_flask.png
         │              │  ├─ medium_cherry_black_stained_glass_flask.png
         │              │  ├─ medium_cherry_blue_stained_glass_flask.png
         │              │  ├─ medium_cherry_brown_stained_glass_flask.png
         │              │  ├─ medium_cherry_cyan_stained_glass_flask.png
         │              │  ├─ medium_cherry_glass_flask.png
         │              │  ├─ medium_cherry_gray_stained_glass_flask.png
         │              │  ├─ medium_cherry_green_stained_glass_flask.png
         │              │  ├─ medium_cherry_light_blue_stained_glass_flask.png
         │              │  ├─ medium_cherry_light_gray_stained_glass_flask.png
         │              │  ├─ medium_cherry_lime_stained_glass_flask.png
         │              │  ├─ medium_cherry_magenta_stained_glass_flask.png
         │              │  ├─ medium_cherry_orange_stained_glass_flask.png
         │              │  ├─ medium_cherry_pink_stained_glass_flask.png
         │              │  ├─ medium_cherry_purple_stained_glass_flask.png
         │              │  ├─ medium_cherry_red_stained_glass_flask.png
         │              │  ├─ medium_cherry_tinted_glass_flask.png
         │              │  ├─ medium_cherry_white_stained_glass_flask.png
         │              │  ├─ medium_cherry_yellow_stained_glass_flask.png
         │              │  ├─ medium_crimson_black_stained_glass_flask.png
         │              │  ├─ medium_crimson_blue_stained_glass_flask.png
         │              │  ├─ medium_crimson_brown_stained_glass_flask.png
         │              │  ├─ medium_crimson_cyan_stained_glass_flask.png
         │              │  ├─ medium_crimson_glass_flask.png
         │              │  ├─ medium_crimson_gray_stained_glass_flask.png
         │              │  ├─ medium_crimson_green_stained_glass_flask.png
         │              │  ├─ medium_crimson_light_blue_stained_glass_flask.png
         │              │  ├─ medium_crimson_light_gray_stained_glass_flask.png
         │              │  ├─ medium_crimson_lime_stained_glass_flask.png
         │              │  ├─ medium_crimson_magenta_stained_glass_flask.png
         │              │  ├─ medium_crimson_orange_stained_glass_flask.png
         │              │  ├─ medium_crimson_pink_stained_glass_flask.png
         │              │  ├─ medium_crimson_purple_stained_glass_flask.png
         │              │  ├─ medium_crimson_red_stained_glass_flask.png
         │              │  ├─ medium_crimson_tinted_glass_flask.png
         │              │  ├─ medium_crimson_white_stained_glass_flask.png
         │              │  ├─ medium_crimson_yellow_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_black_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_blue_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_brown_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_cyan_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_glass_flask.png
         │              │  ├─ medium_dark_oak_gray_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_green_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_light_blue_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_light_gray_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_lime_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_magenta_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_orange_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_pink_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_purple_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_red_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_tinted_glass_flask.png
         │              │  ├─ medium_dark_oak_white_stained_glass_flask.png
         │              │  ├─ medium_dark_oak_yellow_stained_glass_flask.png
         │              │  ├─ medium_jungle_black_stained_glass_flask.png
         │              │  ├─ medium_jungle_blue_stained_glass_flask.png
         │              │  ├─ medium_jungle_brown_stained_glass_flask.png
         │              │  ├─ medium_jungle_cyan_stained_glass_flask.png
         │              │  ├─ medium_jungle_glass_flask.png
         │              │  ├─ medium_jungle_gray_stained_glass_flask.png
         │              │  ├─ medium_jungle_green_stained_glass_flask.png
         │              │  ├─ medium_jungle_light_blue_stained_glass_flask.png
         │              │  ├─ medium_jungle_light_gray_stained_glass_flask.png
         │              │  ├─ medium_jungle_lime_stained_glass_flask.png
         │              │  ├─ medium_jungle_magenta_stained_glass_flask.png
         │              │  ├─ medium_jungle_orange_stained_glass_flask.png
         │              │  ├─ medium_jungle_pink_stained_glass_flask.png
         │              │  ├─ medium_jungle_purple_stained_glass_flask.png
         │              │  ├─ medium_jungle_red_stained_glass_flask.png
         │              │  ├─ medium_jungle_tinted_glass_flask.png
         │              │  ├─ medium_jungle_white_stained_glass_flask.png
         │              │  ├─ medium_jungle_yellow_stained_glass_flask.png
         │              │  ├─ medium_mangrove_black_stained_glass_flask.png
         │              │  ├─ medium_mangrove_blue_stained_glass_flask.png
         │              │  ├─ medium_mangrove_brown_stained_glass_flask.png
         │              │  ├─ medium_mangrove_cyan_stained_glass_flask.png
         │              │  ├─ medium_mangrove_glass_flask.png
         │              │  ├─ medium_mangrove_gray_stained_glass_flask.png
         │              │  ├─ medium_mangrove_green_stained_glass_flask.png
         │              │  ├─ medium_mangrove_light_blue_stained_glass_flask.png
         │              │  ├─ medium_mangrove_light_gray_stained_glass_flask.png
         │              │  ├─ medium_mangrove_lime_stained_glass_flask.png
         │              │  ├─ medium_mangrove_magenta_stained_glass_flask.png
         │              │  ├─ medium_mangrove_orange_stained_glass_flask.png
         │              │  ├─ medium_mangrove_pink_stained_glass_flask.png
         │              │  ├─ medium_mangrove_purple_stained_glass_flask.png
         │              │  ├─ medium_mangrove_red_stained_glass_flask.png
         │              │  ├─ medium_mangrove_tinted_glass_flask.png
         │              │  ├─ medium_mangrove_white_stained_glass_flask.png
         │              │  ├─ medium_mangrove_yellow_stained_glass_flask.png
         │              │  ├─ medium_oak_black_stained_glass_flask.png
         │              │  ├─ medium_oak_blue_stained_glass_flask.png
         │              │  ├─ medium_oak_brown_stained_glass_flask.png
         │              │  ├─ medium_oak_cyan_stained_glass_flask.png
         │              │  ├─ medium_oak_glass_flask.png
         │              │  ├─ medium_oak_gray_stained_glass_flask.png
         │              │  ├─ medium_oak_green_stained_glass_flask.png
         │              │  ├─ medium_oak_light_blue_stained_glass_flask.png
         │              │  ├─ medium_oak_light_gray_stained_glass_flask.png
         │              │  ├─ medium_oak_lime_stained_glass_flask.png
         │              │  ├─ medium_oak_magenta_stained_glass_flask.png
         │              │  ├─ medium_oak_orange_stained_glass_flask.png
         │              │  ├─ medium_oak_pink_stained_glass_flask.png
         │              │  ├─ medium_oak_purple_stained_glass_flask.png
         │              │  ├─ medium_oak_red_stained_glass_flask.png
         │              │  ├─ medium_oak_tinted_glass_flask.png
         │              │  ├─ medium_oak_white_stained_glass_flask.png
         │              │  ├─ medium_oak_yellow_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_black_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_blue_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_brown_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_cyan_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_glass_flask.png
         │              │  ├─ medium_pale_oak_gray_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_green_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_light_blue_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_light_gray_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_lime_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_magenta_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_orange_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_pink_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_purple_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_red_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_tinted_glass_flask.png
         │              │  ├─ medium_pale_oak_white_stained_glass_flask.png
         │              │  ├─ medium_pale_oak_yellow_stained_glass_flask.png
         │              │  ├─ medium_spruce_black_stained_glass_flask.png
         │              │  ├─ medium_spruce_blue_stained_glass_flask.png
         │              │  ├─ medium_spruce_brown_stained_glass_flask.png
         │              │  ├─ medium_spruce_cyan_stained_glass_flask.png
         │              │  ├─ medium_spruce_glass_flask.png
         │              │  ├─ medium_spruce_gray_stained_glass_flask.png
         │              │  ├─ medium_spruce_green_stained_glass_flask.png
         │              │  ├─ medium_spruce_light_blue_stained_glass_flask.png
         │              │  ├─ medium_spruce_light_gray_stained_glass_flask.png
         │              │  ├─ medium_spruce_lime_stained_glass_flask.png
         │              │  ├─ medium_spruce_magenta_stained_glass_flask.png
         │              │  ├─ medium_spruce_orange_stained_glass_flask.png
         │              │  ├─ medium_spruce_pink_stained_glass_flask.png
         │              │  ├─ medium_spruce_purple_stained_glass_flask.png
         │              │  ├─ medium_spruce_red_stained_glass_flask.png
         │              │  ├─ medium_spruce_tinted_glass_flask.png
         │              │  ├─ medium_spruce_white_stained_glass_flask.png
         │              │  ├─ medium_spruce_yellow_stained_glass_flask.png
         │              │  ├─ medium_warped_black_stained_glass_flask.png
         │              │  ├─ medium_warped_blue_stained_glass_flask.png
         │              │  ├─ medium_warped_brown_stained_glass_flask.png
         │              │  ├─ medium_warped_cyan_stained_glass_flask.png
         │              │  ├─ medium_warped_glass_flask.png
         │              │  ├─ medium_warped_gray_stained_glass_flask.png
         │              │  ├─ medium_warped_green_stained_glass_flask.png
         │              │  ├─ medium_warped_light_blue_stained_glass_flask.png
         │              │  ├─ medium_warped_light_gray_stained_glass_flask.png
         │              │  ├─ medium_warped_lime_stained_glass_flask.png
         │              │  ├─ medium_warped_magenta_stained_glass_flask.png
         │              │  ├─ medium_warped_orange_stained_glass_flask.png
         │              │  ├─ medium_warped_pink_stained_glass_flask.png
         │              │  ├─ medium_warped_purple_stained_glass_flask.png
         │              │  ├─ medium_warped_red_stained_glass_flask.png
         │              │  ├─ medium_warped_tinted_glass_flask.png
         │              │  ├─ medium_warped_white_stained_glass_flask.png
         │              │  └─ medium_warped_yellow_stained_glass_flask.png
         │              └─ small
         │                 ├─ small_acacia_black_stained_glass_flask.png
         │                 ├─ small_acacia_blue_stained_glass_flask.png
         │                 ├─ small_acacia_brown_stained_glass_flask.png
         │                 ├─ small_acacia_cyan_stained_glass_flask.png
         │                 ├─ small_acacia_glass_flask.png
         │                 ├─ small_acacia_gray_stained_glass_flask.png
         │                 ├─ small_acacia_green_stained_glass_flask.png
         │                 ├─ small_acacia_light_blue_stained_glass_flask.png
         │                 ├─ small_acacia_light_gray_stained_glass_flask.png
         │                 ├─ small_acacia_lime_stained_glass_flask.png
         │                 ├─ small_acacia_magenta_stained_glass_flask.png
         │                 ├─ small_acacia_orange_stained_glass_flask.png
         │                 ├─ small_acacia_pink_stained_glass_flask.png
         │                 ├─ small_acacia_purple_stained_glass_flask.png
         │                 ├─ small_acacia_red_stained_glass_flask.png
         │                 ├─ small_acacia_tinted_glass_flask.png
         │                 ├─ small_acacia_white_stained_glass_flask.png
         │                 ├─ small_acacia_yellow_stained_glass_flask.png
         │                 ├─ small_bamboo_black_stained_glass_flask.png
         │                 ├─ small_bamboo_blue_stained_glass_flask.png
         │                 ├─ small_bamboo_brown_stained_glass_flask.png
         │                 ├─ small_bamboo_cyan_stained_glass_flask.png
         │                 ├─ small_bamboo_glass_flask.png
         │                 ├─ small_bamboo_gray_stained_glass_flask.png
         │                 ├─ small_bamboo_green_stained_glass_flask.png
         │                 ├─ small_bamboo_light_blue_stained_glass_flask.png
         │                 ├─ small_bamboo_light_gray_stained_glass_flask.png
         │                 ├─ small_bamboo_lime_stained_glass_flask.png
         │                 ├─ small_bamboo_magenta_stained_glass_flask.png
         │                 ├─ small_bamboo_orange_stained_glass_flask.png
         │                 ├─ small_bamboo_pink_stained_glass_flask.png
         │                 ├─ small_bamboo_purple_stained_glass_flask.png
         │                 ├─ small_bamboo_red_stained_glass_flask.png
         │                 ├─ small_bamboo_tinted_glass_flask.png
         │                 ├─ small_bamboo_white_stained_glass_flask.png
         │                 ├─ small_bamboo_yellow_stained_glass_flask.png
         │                 ├─ small_birch_black_stained_glass_flask.png
         │                 ├─ small_birch_blue_stained_glass_flask.png
         │                 ├─ small_birch_brown_stained_glass_flask.png
         │                 ├─ small_birch_cyan_stained_glass_flask.png
         │                 ├─ small_birch_glass_flask.png
         │                 ├─ small_birch_gray_stained_glass_flask.png
         │                 ├─ small_birch_green_stained_glass_flask.png
         │                 ├─ small_birch_light_blue_stained_glass_flask.png
         │                 ├─ small_birch_light_gray_stained_glass_flask.png
         │                 ├─ small_birch_lime_stained_glass_flask.png
         │                 ├─ small_birch_magenta_stained_glass_flask.png
         │                 ├─ small_birch_orange_stained_glass_flask.png
         │                 ├─ small_birch_pink_stained_glass_flask.png
         │                 ├─ small_birch_purple_stained_glass_flask.png
         │                 ├─ small_birch_red_stained_glass_flask.png
         │                 ├─ small_birch_tinted_glass_flask.png
         │                 ├─ small_birch_white_stained_glass_flask.png
         │                 ├─ small_birch_yellow_stained_glass_flask.png
         │                 ├─ small_cherry_black_stained_glass_flask.png
         │                 ├─ small_cherry_blue_stained_glass_flask.png
         │                 ├─ small_cherry_brown_stained_glass_flask.png
         │                 ├─ small_cherry_cyan_stained_glass_flask.png
         │                 ├─ small_cherry_glass_flask.png
         │                 ├─ small_cherry_gray_stained_glass_flask.png
         │                 ├─ small_cherry_green_stained_glass_flask.png
         │                 ├─ small_cherry_light_blue_stained_glass_flask.png
         │                 ├─ small_cherry_light_gray_stained_glass_flask.png
         │                 ├─ small_cherry_lime_stained_glass_flask.png
         │                 ├─ small_cherry_magenta_stained_glass_flask.png
         │                 ├─ small_cherry_orange_stained_glass_flask.png
         │                 ├─ small_cherry_pink_stained_glass_flask.png
         │                 ├─ small_cherry_purple_stained_glass_flask.png
         │                 ├─ small_cherry_red_stained_glass_flask.png
         │                 ├─ small_cherry_tinted_glass_flask.png
         │                 ├─ small_cherry_white_stained_glass_flask.png
         │                 ├─ small_cherry_yellow_stained_glass_flask.png
         │                 ├─ small_crimson_black_stained_glass_flask.png
         │                 ├─ small_crimson_blue_stained_glass_flask.png
         │                 ├─ small_crimson_brown_stained_glass_flask.png
         │                 ├─ small_crimson_cyan_stained_glass_flask.png
         │                 ├─ small_crimson_glass_flask.png
         │                 ├─ small_crimson_gray_stained_glass_flask.png
         │                 ├─ small_crimson_green_stained_glass_flask.png
         │                 ├─ small_crimson_light_blue_stained_glass_flask.png
         │                 ├─ small_crimson_light_gray_stained_glass_flask.png
         │                 ├─ small_crimson_lime_stained_glass_flask.png
         │                 ├─ small_crimson_magenta_stained_glass_flask.png
         │                 ├─ small_crimson_orange_stained_glass_flask.png
         │                 ├─ small_crimson_pink_stained_glass_flask.png
         │                 ├─ small_crimson_purple_stained_glass_flask.png
         │                 ├─ small_crimson_red_stained_glass_flask.png
         │                 ├─ small_crimson_tinted_glass_flask.png
         │                 ├─ small_crimson_white_stained_glass_flask.png
         │                 ├─ small_crimson_yellow_stained_glass_flask.png
         │                 ├─ small_dark_oak_black_stained_glass_flask.png
         │                 ├─ small_dark_oak_blue_stained_glass_flask.png
         │                 ├─ small_dark_oak_brown_stained_glass_flask.png
         │                 ├─ small_dark_oak_cyan_stained_glass_flask.png
         │                 ├─ small_dark_oak_glass_flask.png
         │                 ├─ small_dark_oak_gray_stained_glass_flask.png
         │                 ├─ small_dark_oak_green_stained_glass_flask.png
         │                 ├─ small_dark_oak_light_blue_stained_glass_flask.png
         │                 ├─ small_dark_oak_light_gray_stained_glass_flask.png
         │                 ├─ small_dark_oak_lime_stained_glass_flask.png
         │                 ├─ small_dark_oak_magenta_stained_glass_flask.png
         │                 ├─ small_dark_oak_orange_stained_glass_flask.png
         │                 ├─ small_dark_oak_pink_stained_glass_flask.png
         │                 ├─ small_dark_oak_purple_stained_glass_flask.png
         │                 ├─ small_dark_oak_red_stained_glass_flask.png
         │                 ├─ small_dark_oak_tinted_glass_flask.png
         │                 ├─ small_dark_oak_white_stained_glass_flask.png
         │                 ├─ small_dark_oak_yellow_stained_glass_flask.png
         │                 ├─ small_jungle_black_stained_glass_flask.png
         │                 ├─ small_jungle_blue_stained_glass_flask.png
         │                 ├─ small_jungle_brown_stained_glass_flask.png
         │                 ├─ small_jungle_cyan_stained_glass_flask.png
         │                 ├─ small_jungle_glass_flask.png
         │                 ├─ small_jungle_gray_stained_glass_flask.png
         │                 ├─ small_jungle_green_stained_glass_flask.png
         │                 ├─ small_jungle_light_blue_stained_glass_flask.png
         │                 ├─ small_jungle_light_gray_stained_glass_flask.png
         │                 ├─ small_jungle_lime_stained_glass_flask.png
         │                 ├─ small_jungle_magenta_stained_glass_flask.png
         │                 ├─ small_jungle_orange_stained_glass_flask.png
         │                 ├─ small_jungle_pink_stained_glass_flask.png
         │                 ├─ small_jungle_purple_stained_glass_flask.png
         │                 ├─ small_jungle_red_stained_glass_flask.png
         │                 ├─ small_jungle_tinted_glass_flask.png
         │                 ├─ small_jungle_white_stained_glass_flask.png
         │                 ├─ small_jungle_yellow_stained_glass_flask.png
         │                 ├─ small_mangrove_black_stained_glass_flask.png
         │                 ├─ small_mangrove_blue_stained_glass_flask.png
         │                 ├─ small_mangrove_brown_stained_glass_flask.png
         │                 ├─ small_mangrove_cyan_stained_glass_flask.png
         │                 ├─ small_mangrove_glass_flask.png
         │                 ├─ small_mangrove_gray_stained_glass_flask.png
         │                 ├─ small_mangrove_green_stained_glass_flask.png
         │                 ├─ small_mangrove_light_blue_stained_glass_flask.png
         │                 ├─ small_mangrove_light_gray_stained_glass_flask.png
         │                 ├─ small_mangrove_lime_stained_glass_flask.png
         │                 ├─ small_mangrove_magenta_stained_glass_flask.png
         │                 ├─ small_mangrove_orange_stained_glass_flask.png
         │                 ├─ small_mangrove_pink_stained_glass_flask.png
         │                 ├─ small_mangrove_purple_stained_glass_flask.png
         │                 ├─ small_mangrove_red_stained_glass_flask.png
         │                 ├─ small_mangrove_tinted_glass_flask.png
         │                 ├─ small_mangrove_white_stained_glass_flask.png
         │                 ├─ small_mangrove_yellow_stained_glass_flask.png
         │                 ├─ small_oak_black_stained_glass_flask.png
         │                 ├─ small_oak_blue_stained_glass_flask.png
         │                 ├─ small_oak_brown_stained_glass_flask.png
         │                 ├─ small_oak_cyan_stained_glass_flask.png
         │                 ├─ small_oak_glass_flask.png
         │                 ├─ small_oak_gray_stained_glass_flask.png
         │                 ├─ small_oak_green_stained_glass_flask.png
         │                 ├─ small_oak_light_blue_stained_glass_flask.png
         │                 ├─ small_oak_light_gray_stained_glass_flask.png
         │                 ├─ small_oak_lime_stained_glass_flask.png
         │                 ├─ small_oak_magenta_stained_glass_flask.png
         │                 ├─ small_oak_orange_stained_glass_flask.png
         │                 ├─ small_oak_pink_stained_glass_flask.png
         │                 ├─ small_oak_purple_stained_glass_flask.png
         │                 ├─ small_oak_red_stained_glass_flask.png
         │                 ├─ small_oak_tinted_glass_flask.png
         │                 ├─ small_oak_white_stained_glass_flask.png
         │                 ├─ small_oak_yellow_stained_glass_flask.png
         │                 ├─ small_pale_oak_black_stained_glass_flask.png
         │                 ├─ small_pale_oak_blue_stained_glass_flask.png
         │                 ├─ small_pale_oak_brown_stained_glass_flask.png
         │                 ├─ small_pale_oak_cyan_stained_glass_flask.png
         │                 ├─ small_pale_oak_glass_flask.png
         │                 ├─ small_pale_oak_gray_stained_glass_flask.png
         │                 ├─ small_pale_oak_green_stained_glass_flask.png
         │                 ├─ small_pale_oak_light_blue_stained_glass_flask.png
         │                 ├─ small_pale_oak_light_gray_stained_glass_flask.png
         │                 ├─ small_pale_oak_lime_stained_glass_flask.png
         │                 ├─ small_pale_oak_magenta_stained_glass_flask.png
         │                 ├─ small_pale_oak_orange_stained_glass_flask.png
         │                 ├─ small_pale_oak_pink_stained_glass_flask.png
         │                 ├─ small_pale_oak_purple_stained_glass_flask.png
         │                 ├─ small_pale_oak_red_stained_glass_flask.png
         │                 ├─ small_pale_oak_tinted_glass_flask.png
         │                 ├─ small_pale_oak_white_stained_glass_flask.png
         │                 ├─ small_pale_oak_yellow_stained_glass_flask.png
         │                 ├─ small_spruce_black_stained_glass_flask.png
         │                 ├─ small_spruce_blue_stained_glass_flask.png
         │                 ├─ small_spruce_brown_stained_glass_flask.png
         │                 ├─ small_spruce_cyan_stained_glass_flask.png
         │                 ├─ small_spruce_glass_flask.png
         │                 ├─ small_spruce_gray_stained_glass_flask.png
         │                 ├─ small_spruce_green_stained_glass_flask.png
         │                 ├─ small_spruce_light_blue_stained_glass_flask.png
         │                 ├─ small_spruce_light_gray_stained_glass_flask.png
         │                 ├─ small_spruce_lime_stained_glass_flask.png
         │                 ├─ small_spruce_magenta_stained_glass_flask.png
         │                 ├─ small_spruce_orange_stained_glass_flask.png
         │                 ├─ small_spruce_pink_stained_glass_flask.png
         │                 ├─ small_spruce_purple_stained_glass_flask.png
         │                 ├─ small_spruce_red_stained_glass_flask.png
         │                 ├─ small_spruce_tinted_glass_flask.png
         │                 ├─ small_spruce_white_stained_glass_flask.png
         │                 ├─ small_spruce_yellow_stained_glass_flask.png
         │                 ├─ small_warped_black_stained_glass_flask.png
         │                 ├─ small_warped_blue_stained_glass_flask.png
         │                 ├─ small_warped_brown_stained_glass_flask.png
         │                 ├─ small_warped_cyan_stained_glass_flask.png
         │                 ├─ small_warped_glass_flask.png
         │                 ├─ small_warped_gray_stained_glass_flask.png
         │                 ├─ small_warped_green_stained_glass_flask.png
         │                 ├─ small_warped_light_blue_stained_glass_flask.png
         │                 ├─ small_warped_light_gray_stained_glass_flask.png
         │                 ├─ small_warped_lime_stained_glass_flask.png
         │                 ├─ small_warped_magenta_stained_glass_flask.png
         │                 ├─ small_warped_orange_stained_glass_flask.png
         │                 ├─ small_warped_pink_stained_glass_flask.png
         │                 ├─ small_warped_purple_stained_glass_flask.png
         │                 ├─ small_warped_red_stained_glass_flask.png
         │                 ├─ small_warped_tinted_glass_flask.png
         │                 ├─ small_warped_white_stained_glass_flask.png
         │                 └─ small_warped_yellow_stained_glass_flask.png
         ├─ data
         │  └─ taob
         │     ├─ containers
         │     │  ├─ barrel_block.json
         │     │  ├─ barrel_item.json
         │     │  ├─ large_flask.json
         │     │  ├─ medium_flask.json
         │     │  └─ small_flask.json
         │     ├─ loot_tables
         │     │  └─ barrels
         │     │     ├─ acacia_copper_barrel.json
         │     │     ├─ acacia_copper_exposed_barrel.json
         │     │     ├─ acacia_copper_oxidized_barrel.json
         │     │     ├─ acacia_copper_weathered_barrel.json
         │     │     ├─ acacia_gold_barrel.json
         │     │     ├─ acacia_iron_barrel.json
         │     │     ├─ acacia_netherite_barrel.json
         │     │     ├─ bamboo_copper_barrel.json
         │     │     ├─ bamboo_copper_exposed_barrel.json
         │     │     ├─ bamboo_copper_oxidized_barrel.json
         │     │     ├─ bamboo_copper_weathered_barrel.json
         │     │     ├─ bamboo_gold_barrel.json
         │     │     ├─ bamboo_iron_barrel.json
         │     │     ├─ bamboo_netherite_barrel.json
         │     │     ├─ birch_copper_barrel.json
         │     │     ├─ birch_copper_exposed_barrel.json
         │     │     ├─ birch_copper_oxidized_barrel.json
         │     │     ├─ birch_copper_weathered_barrel.json
         │     │     ├─ birch_gold_barrel.json
         │     │     ├─ birch_iron_barrel.json
         │     │     ├─ birch_netherite_barrel.json
         │     │     ├─ cherry_copper_barrel.json
         │     │     ├─ cherry_copper_exposed_barrel.json
         │     │     ├─ cherry_copper_oxidized_barrel.json
         │     │     ├─ cherry_copper_weathered_barrel.json
         │     │     ├─ cherry_gold_barrel.json
         │     │     ├─ cherry_iron_barrel.json
         │     │     ├─ cherry_netherite_barrel.json
         │     │     ├─ crimson_copper_barrel.json
         │     │     ├─ crimson_copper_exposed_barrel.json
         │     │     ├─ crimson_copper_oxidized_barrel.json
         │     │     ├─ crimson_copper_weathered_barrel.json
         │     │     ├─ crimson_gold_barrel.json
         │     │     ├─ crimson_iron_barrel.json
         │     │     ├─ crimson_netherite_barrel.json
         │     │     ├─ dark_oak_copper_barrel.json
         │     │     ├─ dark_oak_copper_exposed_barrel.json
         │     │     ├─ dark_oak_copper_oxidized_barrel.json
         │     │     ├─ dark_oak_copper_weathered_barrel.json
         │     │     ├─ dark_oak_gold_barrel.json
         │     │     ├─ dark_oak_iron_barrel.json
         │     │     ├─ dark_oak_netherite_barrel.json
         │     │     ├─ jungle_copper_barrel.json
         │     │     ├─ jungle_copper_exposed_barrel.json
         │     │     ├─ jungle_copper_oxidized_barrel.json
         │     │     ├─ jungle_copper_weathered_barrel.json
         │     │     ├─ jungle_gold_barrel.json
         │     │     ├─ jungle_iron_barrel.json
         │     │     ├─ jungle_netherite_barrel.json
         │     │     ├─ mangrove_copper_barrel.json
         │     │     ├─ mangrove_copper_exposed_barrel.json
         │     │     ├─ mangrove_copper_oxidized_barrel.json
         │     │     ├─ mangrove_copper_weathered_barrel.json
         │     │     ├─ mangrove_gold_barrel.json
         │     │     ├─ mangrove_iron_barrel.json
         │     │     ├─ mangrove_netherite_barrel.json
         │     │     ├─ oak_copper_barrel.json
         │     │     ├─ oak_copper_exposed_barrel.json
         │     │     ├─ oak_copper_oxidized_barrel.json
         │     │     ├─ oak_copper_weathered_barrel.json
         │     │     ├─ oak_gold_barrel.json
         │     │     ├─ oak_iron_barrel.json
         │     │     ├─ oak_netherite_barrel.json
         │     │     ├─ pale_oak_copper_barrel.json
         │     │     ├─ pale_oak_copper_exposed_barrel.json
         │     │     ├─ pale_oak_copper_oxidized_barrel.json
         │     │     ├─ pale_oak_copper_weathered_barrel.json
         │     │     ├─ pale_oak_gold_barrel.json
         │     │     ├─ pale_oak_iron_barrel.json
         │     │     ├─ pale_oak_netherite_barrel.json
         │     │     ├─ spruce_copper_barrel.json
         │     │     ├─ spruce_copper_exposed_barrel.json
         │     │     ├─ spruce_copper_oxidized_barrel.json
         │     │     ├─ spruce_copper_weathered_barrel.json
         │     │     ├─ spruce_gold_barrel.json
         │     │     ├─ spruce_iron_barrel.json
         │     │     ├─ spruce_netherite_barrel.json
         │     │     ├─ warped_copper_barrel.json
         │     │     ├─ warped_copper_exposed_barrel.json
         │     │     ├─ warped_copper_oxidized_barrel.json
         │     │     ├─ warped_copper_weathered_barrel.json
         │     │     ├─ warped_gold_barrel.json
         │     │     ├─ warped_iron_barrel.json
         │     │     └─ warped_netherite_barrel.json
         │     ├─ recipes
         │     │  ├─ barrels
         │     │  │  ├─ acacia_copper_barrel.json
         │     │  │  ├─ acacia_copper_exposed_barrel.json
         │     │  │  ├─ acacia_copper_oxidized_barrel.json
         │     │  │  ├─ acacia_copper_weathered_barrel.json
         │     │  │  ├─ acacia_gold_barrel.json
         │     │  │  ├─ acacia_iron_barrel.json
         │     │  │  ├─ acacia_netherite_barrel.json
         │     │  │  ├─ bamboo_copper_barrel.json
         │     │  │  ├─ bamboo_copper_exposed_barrel.json
         │     │  │  ├─ bamboo_copper_oxidized_barrel.json
         │     │  │  ├─ bamboo_copper_weathered_barrel.json
         │     │  │  ├─ bamboo_gold_barrel.json
         │     │  │  ├─ bamboo_iron_barrel.json
         │     │  │  ├─ bamboo_netherite_barrel.json
         │     │  │  ├─ birch_copper_barrel.json
         │     │  │  ├─ birch_copper_exposed_barrel.json
         │     │  │  ├─ birch_copper_oxidized_barrel.json
         │     │  │  ├─ birch_copper_weathered_barrel.json
         │     │  │  ├─ birch_gold_barrel.json
         │     │  │  ├─ birch_iron_barrel.json
         │     │  │  ├─ birch_netherite_barrel.json
         │     │  │  ├─ cherry_copper_barrel.json
         │     │  │  ├─ cherry_copper_exposed_barrel.json
         │     │  │  ├─ cherry_copper_oxidized_barrel.json
         │     │  │  ├─ cherry_copper_weathered_barrel.json
         │     │  │  ├─ cherry_gold_barrel.json
         │     │  │  ├─ cherry_iron_barrel.json
         │     │  │  ├─ cherry_netherite_barrel.json
         │     │  │  ├─ crimson_copper_barrel.json
         │     │  │  ├─ crimson_copper_exposed_barrel.json
         │     │  │  ├─ crimson_copper_oxidized_barrel.json
         │     │  │  ├─ crimson_copper_weathered_barrel.json
         │     │  │  ├─ crimson_gold_barrel.json
         │     │  │  ├─ crimson_iron_barrel.json
         │     │  │  ├─ crimson_netherite_barrel.json
         │     │  │  ├─ dark_oak_copper_barrel.json
         │     │  │  ├─ dark_oak_copper_exposed_barrel.json
         │     │  │  ├─ dark_oak_copper_oxidized_barrel.json
         │     │  │  ├─ dark_oak_copper_weathered_barrel.json
         │     │  │  ├─ dark_oak_gold_barrel.json
         │     │  │  ├─ dark_oak_iron_barrel.json
         │     │  │  ├─ dark_oak_netherite_barrel.json
         │     │  │  ├─ jungle_copper_barrel.json
         │     │  │  ├─ jungle_copper_exposed_barrel.json
         │     │  │  ├─ jungle_copper_oxidized_barrel.json
         │     │  │  ├─ jungle_copper_weathered_barrel.json
         │     │  │  ├─ jungle_gold_barrel.json
         │     │  │  ├─ jungle_iron_barrel.json
         │     │  │  ├─ jungle_netherite_barrel.json
         │     │  │  ├─ mangrove_copper_barrel.json
         │     │  │  ├─ mangrove_copper_exposed_barrel.json
         │     │  │  ├─ mangrove_copper_oxidized_barrel.json
         │     │  │  ├─ mangrove_copper_weathered_barrel.json
         │     │  │  ├─ mangrove_gold_barrel.json
         │     │  │  ├─ mangrove_iron_barrel.json
         │     │  │  ├─ mangrove_netherite_barrel.json
         │     │  │  ├─ oak_copper_barrel.json
         │     │  │  ├─ oak_copper_exposed_barrel.json
         │     │  │  ├─ oak_copper_oxidized_barrel.json
         │     │  │  ├─ oak_copper_weathered_barrel.json
         │     │  │  ├─ oak_gold_barrel.json
         │     │  │  ├─ oak_iron_barrel.json
         │     │  │  ├─ oak_netherite_barrel.json
         │     │  │  ├─ pale_oak_copper_barrel.json
         │     │  │  ├─ pale_oak_copper_exposed_barrel.json
         │     │  │  ├─ pale_oak_copper_oxidized_barrel.json
         │     │  │  ├─ pale_oak_copper_weathered_barrel.json
         │     │  │  ├─ pale_oak_gold_barrel.json
         │     │  │  ├─ pale_oak_iron_barrel.json
         │     │  │  ├─ pale_oak_netherite_barrel.json
         │     │  │  ├─ spruce_copper_barrel.json
         │     │  │  ├─ spruce_copper_exposed_barrel.json
         │     │  │  ├─ spruce_copper_oxidized_barrel.json
         │     │  │  ├─ spruce_copper_weathered_barrel.json
         │     │  │  ├─ spruce_gold_barrel.json
         │     │  │  ├─ spruce_iron_barrel.json
         │     │  │  ├─ spruce_netherite_barrel.json
         │     │  │  ├─ warped_copper_barrel.json
         │     │  │  ├─ warped_copper_exposed_barrel.json
         │     │  │  ├─ warped_copper_oxidized_barrel.json
         │     │  │  ├─ warped_copper_weathered_barrel.json
         │     │  │  ├─ warped_gold_barrel.json
         │     │  │  ├─ warped_iron_barrel.json
         │     │  │  └─ warped_netherite_barrel.json
         │     │  └─ flasks
         │     │     ├─ large
         │     │     │  ├─ large_acacia_black_stained_glass_flask.json
         │     │     │  ├─ large_acacia_blue_stained_glass_flask.json
         │     │     │  ├─ large_acacia_brown_stained_glass_flask.json
         │     │     │  ├─ large_acacia_cyan_stained_glass_flask.json
         │     │     │  ├─ large_acacia_glass_flask.json
         │     │     │  ├─ large_acacia_gray_stained_glass_flask.json
         │     │     │  ├─ large_acacia_green_stained_glass_flask.json
         │     │     │  ├─ large_acacia_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_acacia_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_acacia_lime_stained_glass_flask.json
         │     │     │  ├─ large_acacia_magenta_stained_glass_flask.json
         │     │     │  ├─ large_acacia_orange_stained_glass_flask.json
         │     │     │  ├─ large_acacia_pink_stained_glass_flask.json
         │     │     │  ├─ large_acacia_purple_stained_glass_flask.json
         │     │     │  ├─ large_acacia_red_stained_glass_flask.json
         │     │     │  ├─ large_acacia_tinted_glass_flask.json
         │     │     │  ├─ large_acacia_white_stained_glass_flask.json
         │     │     │  ├─ large_acacia_yellow_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_black_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_blue_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_brown_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_cyan_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_glass_flask.json
         │     │     │  ├─ large_bamboo_gray_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_green_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_lime_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_magenta_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_orange_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_pink_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_purple_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_red_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_tinted_glass_flask.json
         │     │     │  ├─ large_bamboo_white_stained_glass_flask.json
         │     │     │  ├─ large_bamboo_yellow_stained_glass_flask.json
         │     │     │  ├─ large_birch_black_stained_glass_flask.json
         │     │     │  ├─ large_birch_blue_stained_glass_flask.json
         │     │     │  ├─ large_birch_brown_stained_glass_flask.json
         │     │     │  ├─ large_birch_cyan_stained_glass_flask.json
         │     │     │  ├─ large_birch_glass_flask.json
         │     │     │  ├─ large_birch_gray_stained_glass_flask.json
         │     │     │  ├─ large_birch_green_stained_glass_flask.json
         │     │     │  ├─ large_birch_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_birch_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_birch_lime_stained_glass_flask.json
         │     │     │  ├─ large_birch_magenta_stained_glass_flask.json
         │     │     │  ├─ large_birch_orange_stained_glass_flask.json
         │     │     │  ├─ large_birch_pink_stained_glass_flask.json
         │     │     │  ├─ large_birch_purple_stained_glass_flask.json
         │     │     │  ├─ large_birch_red_stained_glass_flask.json
         │     │     │  ├─ large_birch_tinted_glass_flask.json
         │     │     │  ├─ large_birch_white_stained_glass_flask.json
         │     │     │  ├─ large_birch_yellow_stained_glass_flask.json
         │     │     │  ├─ large_cherry_black_stained_glass_flask.json
         │     │     │  ├─ large_cherry_blue_stained_glass_flask.json
         │     │     │  ├─ large_cherry_brown_stained_glass_flask.json
         │     │     │  ├─ large_cherry_cyan_stained_glass_flask.json
         │     │     │  ├─ large_cherry_glass_flask.json
         │     │     │  ├─ large_cherry_gray_stained_glass_flask.json
         │     │     │  ├─ large_cherry_green_stained_glass_flask.json
         │     │     │  ├─ large_cherry_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_cherry_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_cherry_lime_stained_glass_flask.json
         │     │     │  ├─ large_cherry_magenta_stained_glass_flask.json
         │     │     │  ├─ large_cherry_orange_stained_glass_flask.json
         │     │     │  ├─ large_cherry_pink_stained_glass_flask.json
         │     │     │  ├─ large_cherry_purple_stained_glass_flask.json
         │     │     │  ├─ large_cherry_red_stained_glass_flask.json
         │     │     │  ├─ large_cherry_tinted_glass_flask.json
         │     │     │  ├─ large_cherry_white_stained_glass_flask.json
         │     │     │  ├─ large_cherry_yellow_stained_glass_flask.json
         │     │     │  ├─ large_crimson_black_stained_glass_flask.json
         │     │     │  ├─ large_crimson_blue_stained_glass_flask.json
         │     │     │  ├─ large_crimson_brown_stained_glass_flask.json
         │     │     │  ├─ large_crimson_cyan_stained_glass_flask.json
         │     │     │  ├─ large_crimson_glass_flask.json
         │     │     │  ├─ large_crimson_gray_stained_glass_flask.json
         │     │     │  ├─ large_crimson_green_stained_glass_flask.json
         │     │     │  ├─ large_crimson_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_crimson_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_crimson_lime_stained_glass_flask.json
         │     │     │  ├─ large_crimson_magenta_stained_glass_flask.json
         │     │     │  ├─ large_crimson_orange_stained_glass_flask.json
         │     │     │  ├─ large_crimson_pink_stained_glass_flask.json
         │     │     │  ├─ large_crimson_purple_stained_glass_flask.json
         │     │     │  ├─ large_crimson_red_stained_glass_flask.json
         │     │     │  ├─ large_crimson_tinted_glass_flask.json
         │     │     │  ├─ large_crimson_white_stained_glass_flask.json
         │     │     │  ├─ large_crimson_yellow_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_black_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_blue_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_brown_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_glass_flask.json
         │     │     │  ├─ large_dark_oak_gray_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_green_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_lime_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_orange_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_pink_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_purple_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_red_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_tinted_glass_flask.json
         │     │     │  ├─ large_dark_oak_white_stained_glass_flask.json
         │     │     │  ├─ large_dark_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ large_jungle_black_stained_glass_flask.json
         │     │     │  ├─ large_jungle_blue_stained_glass_flask.json
         │     │     │  ├─ large_jungle_brown_stained_glass_flask.json
         │     │     │  ├─ large_jungle_cyan_stained_glass_flask.json
         │     │     │  ├─ large_jungle_glass_flask.json
         │     │     │  ├─ large_jungle_gray_stained_glass_flask.json
         │     │     │  ├─ large_jungle_green_stained_glass_flask.json
         │     │     │  ├─ large_jungle_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_jungle_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_jungle_lime_stained_glass_flask.json
         │     │     │  ├─ large_jungle_magenta_stained_glass_flask.json
         │     │     │  ├─ large_jungle_orange_stained_glass_flask.json
         │     │     │  ├─ large_jungle_pink_stained_glass_flask.json
         │     │     │  ├─ large_jungle_purple_stained_glass_flask.json
         │     │     │  ├─ large_jungle_red_stained_glass_flask.json
         │     │     │  ├─ large_jungle_tinted_glass_flask.json
         │     │     │  ├─ large_jungle_white_stained_glass_flask.json
         │     │     │  ├─ large_jungle_yellow_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_black_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_blue_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_brown_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_cyan_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_glass_flask.json
         │     │     │  ├─ large_mangrove_gray_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_green_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_lime_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_magenta_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_orange_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_pink_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_purple_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_red_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_tinted_glass_flask.json
         │     │     │  ├─ large_mangrove_white_stained_glass_flask.json
         │     │     │  ├─ large_mangrove_yellow_stained_glass_flask.json
         │     │     │  ├─ large_oak_black_stained_glass_flask.json
         │     │     │  ├─ large_oak_blue_stained_glass_flask.json
         │     │     │  ├─ large_oak_brown_stained_glass_flask.json
         │     │     │  ├─ large_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ large_oak_glass_flask.json
         │     │     │  ├─ large_oak_gray_stained_glass_flask.json
         │     │     │  ├─ large_oak_green_stained_glass_flask.json
         │     │     │  ├─ large_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_oak_lime_stained_glass_flask.json
         │     │     │  ├─ large_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ large_oak_orange_stained_glass_flask.json
         │     │     │  ├─ large_oak_pink_stained_glass_flask.json
         │     │     │  ├─ large_oak_purple_stained_glass_flask.json
         │     │     │  ├─ large_oak_red_stained_glass_flask.json
         │     │     │  ├─ large_oak_tinted_glass_flask.json
         │     │     │  ├─ large_oak_white_stained_glass_flask.json
         │     │     │  ├─ large_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_black_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_blue_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_brown_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_glass_flask.json
         │     │     │  ├─ large_pale_oak_gray_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_green_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_lime_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_orange_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_pink_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_purple_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_red_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_tinted_glass_flask.json
         │     │     │  ├─ large_pale_oak_white_stained_glass_flask.json
         │     │     │  ├─ large_pale_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ large_spruce_black_stained_glass_flask.json
         │     │     │  ├─ large_spruce_blue_stained_glass_flask.json
         │     │     │  ├─ large_spruce_brown_stained_glass_flask.json
         │     │     │  ├─ large_spruce_cyan_stained_glass_flask.json
         │     │     │  ├─ large_spruce_glass_flask.json
         │     │     │  ├─ large_spruce_gray_stained_glass_flask.json
         │     │     │  ├─ large_spruce_green_stained_glass_flask.json
         │     │     │  ├─ large_spruce_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_spruce_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_spruce_lime_stained_glass_flask.json
         │     │     │  ├─ large_spruce_magenta_stained_glass_flask.json
         │     │     │  ├─ large_spruce_orange_stained_glass_flask.json
         │     │     │  ├─ large_spruce_pink_stained_glass_flask.json
         │     │     │  ├─ large_spruce_purple_stained_glass_flask.json
         │     │     │  ├─ large_spruce_red_stained_glass_flask.json
         │     │     │  ├─ large_spruce_tinted_glass_flask.json
         │     │     │  ├─ large_spruce_white_stained_glass_flask.json
         │     │     │  ├─ large_spruce_yellow_stained_glass_flask.json
         │     │     │  ├─ large_warped_black_stained_glass_flask.json
         │     │     │  ├─ large_warped_blue_stained_glass_flask.json
         │     │     │  ├─ large_warped_brown_stained_glass_flask.json
         │     │     │  ├─ large_warped_cyan_stained_glass_flask.json
         │     │     │  ├─ large_warped_glass_flask.json
         │     │     │  ├─ large_warped_gray_stained_glass_flask.json
         │     │     │  ├─ large_warped_green_stained_glass_flask.json
         │     │     │  ├─ large_warped_light_blue_stained_glass_flask.json
         │     │     │  ├─ large_warped_light_gray_stained_glass_flask.json
         │     │     │  ├─ large_warped_lime_stained_glass_flask.json
         │     │     │  ├─ large_warped_magenta_stained_glass_flask.json
         │     │     │  ├─ large_warped_orange_stained_glass_flask.json
         │     │     │  ├─ large_warped_pink_stained_glass_flask.json
         │     │     │  ├─ large_warped_purple_stained_glass_flask.json
         │     │     │  ├─ large_warped_red_stained_glass_flask.json
         │     │     │  ├─ large_warped_tinted_glass_flask.json
         │     │     │  ├─ large_warped_white_stained_glass_flask.json
         │     │     │  └─ large_warped_yellow_stained_glass_flask.json
         │     │     ├─ medium
         │     │     │  ├─ medium_acacia_black_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_blue_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_brown_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_glass_flask.json
         │     │     │  ├─ medium_acacia_gray_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_green_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_lime_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_orange_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_pink_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_purple_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_red_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_tinted_glass_flask.json
         │     │     │  ├─ medium_acacia_white_stained_glass_flask.json
         │     │     │  ├─ medium_acacia_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_black_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_blue_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_brown_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_glass_flask.json
         │     │     │  ├─ medium_bamboo_gray_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_green_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_lime_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_orange_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_pink_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_purple_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_red_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_tinted_glass_flask.json
         │     │     │  ├─ medium_bamboo_white_stained_glass_flask.json
         │     │     │  ├─ medium_bamboo_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_birch_black_stained_glass_flask.json
         │     │     │  ├─ medium_birch_blue_stained_glass_flask.json
         │     │     │  ├─ medium_birch_brown_stained_glass_flask.json
         │     │     │  ├─ medium_birch_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_birch_glass_flask.json
         │     │     │  ├─ medium_birch_gray_stained_glass_flask.json
         │     │     │  ├─ medium_birch_green_stained_glass_flask.json
         │     │     │  ├─ medium_birch_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_birch_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_birch_lime_stained_glass_flask.json
         │     │     │  ├─ medium_birch_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_birch_orange_stained_glass_flask.json
         │     │     │  ├─ medium_birch_pink_stained_glass_flask.json
         │     │     │  ├─ medium_birch_purple_stained_glass_flask.json
         │     │     │  ├─ medium_birch_red_stained_glass_flask.json
         │     │     │  ├─ medium_birch_tinted_glass_flask.json
         │     │     │  ├─ medium_birch_white_stained_glass_flask.json
         │     │     │  ├─ medium_birch_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_black_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_blue_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_brown_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_glass_flask.json
         │     │     │  ├─ medium_cherry_gray_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_green_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_lime_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_orange_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_pink_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_purple_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_red_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_tinted_glass_flask.json
         │     │     │  ├─ medium_cherry_white_stained_glass_flask.json
         │     │     │  ├─ medium_cherry_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_black_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_blue_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_brown_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_glass_flask.json
         │     │     │  ├─ medium_crimson_gray_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_green_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_lime_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_orange_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_pink_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_purple_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_red_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_tinted_glass_flask.json
         │     │     │  ├─ medium_crimson_white_stained_glass_flask.json
         │     │     │  ├─ medium_crimson_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_black_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_blue_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_brown_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_glass_flask.json
         │     │     │  ├─ medium_dark_oak_gray_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_green_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_lime_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_orange_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_pink_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_purple_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_red_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_tinted_glass_flask.json
         │     │     │  ├─ medium_dark_oak_white_stained_glass_flask.json
         │     │     │  ├─ medium_dark_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_black_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_blue_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_brown_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_glass_flask.json
         │     │     │  ├─ medium_jungle_gray_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_green_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_lime_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_orange_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_pink_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_purple_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_red_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_tinted_glass_flask.json
         │     │     │  ├─ medium_jungle_white_stained_glass_flask.json
         │     │     │  ├─ medium_jungle_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_black_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_blue_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_brown_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_glass_flask.json
         │     │     │  ├─ medium_mangrove_gray_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_green_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_lime_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_orange_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_pink_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_purple_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_red_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_tinted_glass_flask.json
         │     │     │  ├─ medium_mangrove_white_stained_glass_flask.json
         │     │     │  ├─ medium_mangrove_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_oak_black_stained_glass_flask.json
         │     │     │  ├─ medium_oak_blue_stained_glass_flask.json
         │     │     │  ├─ medium_oak_brown_stained_glass_flask.json
         │     │     │  ├─ medium_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_oak_glass_flask.json
         │     │     │  ├─ medium_oak_gray_stained_glass_flask.json
         │     │     │  ├─ medium_oak_green_stained_glass_flask.json
         │     │     │  ├─ medium_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_oak_lime_stained_glass_flask.json
         │     │     │  ├─ medium_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_oak_orange_stained_glass_flask.json
         │     │     │  ├─ medium_oak_pink_stained_glass_flask.json
         │     │     │  ├─ medium_oak_purple_stained_glass_flask.json
         │     │     │  ├─ medium_oak_red_stained_glass_flask.json
         │     │     │  ├─ medium_oak_tinted_glass_flask.json
         │     │     │  ├─ medium_oak_white_stained_glass_flask.json
         │     │     │  ├─ medium_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_black_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_blue_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_brown_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_glass_flask.json
         │     │     │  ├─ medium_pale_oak_gray_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_green_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_lime_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_orange_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_pink_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_purple_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_red_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_tinted_glass_flask.json
         │     │     │  ├─ medium_pale_oak_white_stained_glass_flask.json
         │     │     │  ├─ medium_pale_oak_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_black_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_blue_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_brown_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_glass_flask.json
         │     │     │  ├─ medium_spruce_gray_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_green_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_lime_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_orange_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_pink_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_purple_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_red_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_tinted_glass_flask.json
         │     │     │  ├─ medium_spruce_white_stained_glass_flask.json
         │     │     │  ├─ medium_spruce_yellow_stained_glass_flask.json
         │     │     │  ├─ medium_warped_black_stained_glass_flask.json
         │     │     │  ├─ medium_warped_blue_stained_glass_flask.json
         │     │     │  ├─ medium_warped_brown_stained_glass_flask.json
         │     │     │  ├─ medium_warped_cyan_stained_glass_flask.json
         │     │     │  ├─ medium_warped_glass_flask.json
         │     │     │  ├─ medium_warped_gray_stained_glass_flask.json
         │     │     │  ├─ medium_warped_green_stained_glass_flask.json
         │     │     │  ├─ medium_warped_light_blue_stained_glass_flask.json
         │     │     │  ├─ medium_warped_light_gray_stained_glass_flask.json
         │     │     │  ├─ medium_warped_lime_stained_glass_flask.json
         │     │     │  ├─ medium_warped_magenta_stained_glass_flask.json
         │     │     │  ├─ medium_warped_orange_stained_glass_flask.json
         │     │     │  ├─ medium_warped_pink_stained_glass_flask.json
         │     │     │  ├─ medium_warped_purple_stained_glass_flask.json
         │     │     │  ├─ medium_warped_red_stained_glass_flask.json
         │     │     │  ├─ medium_warped_tinted_glass_flask.json
         │     │     │  ├─ medium_warped_white_stained_glass_flask.json
         │     │     │  └─ medium_warped_yellow_stained_glass_flask.json
         │     │     └─ small
         │     │        ├─ small_acacia_black_stained_glass_flask.json
         │     │        ├─ small_acacia_blue_stained_glass_flask.json
         │     │        ├─ small_acacia_brown_stained_glass_flask.json
         │     │        ├─ small_acacia_cyan_stained_glass_flask.json
         │     │        ├─ small_acacia_glass_flask.json
         │     │        ├─ small_acacia_gray_stained_glass_flask.json
         │     │        ├─ small_acacia_green_stained_glass_flask.json
         │     │        ├─ small_acacia_light_blue_stained_glass_flask.json
         │     │        ├─ small_acacia_light_gray_stained_glass_flask.json
         │     │        ├─ small_acacia_lime_stained_glass_flask.json
         │     │        ├─ small_acacia_magenta_stained_glass_flask.json
         │     │        ├─ small_acacia_orange_stained_glass_flask.json
         │     │        ├─ small_acacia_pink_stained_glass_flask.json
         │     │        ├─ small_acacia_purple_stained_glass_flask.json
         │     │        ├─ small_acacia_red_stained_glass_flask.json
         │     │        ├─ small_acacia_tinted_glass_flask.json
         │     │        ├─ small_acacia_white_stained_glass_flask.json
         │     │        ├─ small_acacia_yellow_stained_glass_flask.json
         │     │        ├─ small_bamboo_black_stained_glass_flask.json
         │     │        ├─ small_bamboo_blue_stained_glass_flask.json
         │     │        ├─ small_bamboo_brown_stained_glass_flask.json
         │     │        ├─ small_bamboo_cyan_stained_glass_flask.json
         │     │        ├─ small_bamboo_glass_flask.json
         │     │        ├─ small_bamboo_gray_stained_glass_flask.json
         │     │        ├─ small_bamboo_green_stained_glass_flask.json
         │     │        ├─ small_bamboo_light_blue_stained_glass_flask.json
         │     │        ├─ small_bamboo_light_gray_stained_glass_flask.json
         │     │        ├─ small_bamboo_lime_stained_glass_flask.json
         │     │        ├─ small_bamboo_magenta_stained_glass_flask.json
         │     │        ├─ small_bamboo_orange_stained_glass_flask.json
         │     │        ├─ small_bamboo_pink_stained_glass_flask.json
         │     │        ├─ small_bamboo_purple_stained_glass_flask.json
         │     │        ├─ small_bamboo_red_stained_glass_flask.json
         │     │        ├─ small_bamboo_tinted_glass_flask.json
         │     │        ├─ small_bamboo_white_stained_glass_flask.json
         │     │        ├─ small_bamboo_yellow_stained_glass_flask.json
         │     │        ├─ small_birch_black_stained_glass_flask.json
         │     │        ├─ small_birch_blue_stained_glass_flask.json
         │     │        ├─ small_birch_brown_stained_glass_flask.json
         │     │        ├─ small_birch_cyan_stained_glass_flask.json
         │     │        ├─ small_birch_glass_flask.json
         │     │        ├─ small_birch_gray_stained_glass_flask.json
         │     │        ├─ small_birch_green_stained_glass_flask.json
         │     │        ├─ small_birch_light_blue_stained_glass_flask.json
         │     │        ├─ small_birch_light_gray_stained_glass_flask.json
         │     │        ├─ small_birch_lime_stained_glass_flask.json
         │     │        ├─ small_birch_magenta_stained_glass_flask.json
         │     │        ├─ small_birch_orange_stained_glass_flask.json
         │     │        ├─ small_birch_pink_stained_glass_flask.json
         │     │        ├─ small_birch_purple_stained_glass_flask.json
         │     │        ├─ small_birch_red_stained_glass_flask.json
         │     │        ├─ small_birch_tinted_glass_flask.json
         │     │        ├─ small_birch_white_stained_glass_flask.json
         │     │        ├─ small_birch_yellow_stained_glass_flask.json
         │     │        ├─ small_cherry_black_stained_glass_flask.json
         │     │        ├─ small_cherry_blue_stained_glass_flask.json
         │     │        ├─ small_cherry_brown_stained_glass_flask.json
         │     │        ├─ small_cherry_cyan_stained_glass_flask.json
         │     │        ├─ small_cherry_glass_flask.json
         │     │        ├─ small_cherry_gray_stained_glass_flask.json
         │     │        ├─ small_cherry_green_stained_glass_flask.json
         │     │        ├─ small_cherry_light_blue_stained_glass_flask.json
         │     │        ├─ small_cherry_light_gray_stained_glass_flask.json
         │     │        ├─ small_cherry_lime_stained_glass_flask.json
         │     │        ├─ small_cherry_magenta_stained_glass_flask.json
         │     │        ├─ small_cherry_orange_stained_glass_flask.json
         │     │        ├─ small_cherry_pink_stained_glass_flask.json
         │     │        ├─ small_cherry_purple_stained_glass_flask.json
         │     │        ├─ small_cherry_red_stained_glass_flask.json
         │     │        ├─ small_cherry_tinted_glass_flask.json
         │     │        ├─ small_cherry_white_stained_glass_flask.json
         │     │        ├─ small_cherry_yellow_stained_glass_flask.json
         │     │        ├─ small_crimson_black_stained_glass_flask.json
         │     │        ├─ small_crimson_blue_stained_glass_flask.json
         │     │        ├─ small_crimson_brown_stained_glass_flask.json
         │     │        ├─ small_crimson_cyan_stained_glass_flask.json
         │     │        ├─ small_crimson_glass_flask.json
         │     │        ├─ small_crimson_gray_stained_glass_flask.json
         │     │        ├─ small_crimson_green_stained_glass_flask.json
         │     │        ├─ small_crimson_light_blue_stained_glass_flask.json
         │     │        ├─ small_crimson_light_gray_stained_glass_flask.json
         │     │        ├─ small_crimson_lime_stained_glass_flask.json
         │     │        ├─ small_crimson_magenta_stained_glass_flask.json
         │     │        ├─ small_crimson_orange_stained_glass_flask.json
         │     │        ├─ small_crimson_pink_stained_glass_flask.json
         │     │        ├─ small_crimson_purple_stained_glass_flask.json
         │     │        ├─ small_crimson_red_stained_glass_flask.json
         │     │        ├─ small_crimson_tinted_glass_flask.json
         │     │        ├─ small_crimson_white_stained_glass_flask.json
         │     │        ├─ small_crimson_yellow_stained_glass_flask.json
         │     │        ├─ small_dark_oak_black_stained_glass_flask.json
         │     │        ├─ small_dark_oak_blue_stained_glass_flask.json
         │     │        ├─ small_dark_oak_brown_stained_glass_flask.json
         │     │        ├─ small_dark_oak_cyan_stained_glass_flask.json
         │     │        ├─ small_dark_oak_glass_flask.json
         │     │        ├─ small_dark_oak_gray_stained_glass_flask.json
         │     │        ├─ small_dark_oak_green_stained_glass_flask.json
         │     │        ├─ small_dark_oak_light_blue_stained_glass_flask.json
         │     │        ├─ small_dark_oak_light_gray_stained_glass_flask.json
         │     │        ├─ small_dark_oak_lime_stained_glass_flask.json
         │     │        ├─ small_dark_oak_magenta_stained_glass_flask.json
         │     │        ├─ small_dark_oak_orange_stained_glass_flask.json
         │     │        ├─ small_dark_oak_pink_stained_glass_flask.json
         │     │        ├─ small_dark_oak_purple_stained_glass_flask.json
         │     │        ├─ small_dark_oak_red_stained_glass_flask.json
         │     │        ├─ small_dark_oak_tinted_glass_flask.json
         │     │        ├─ small_dark_oak_white_stained_glass_flask.json
         │     │        ├─ small_dark_oak_yellow_stained_glass_flask.json
         │     │        ├─ small_jungle_black_stained_glass_flask.json
         │     │        ├─ small_jungle_blue_stained_glass_flask.json
         │     │        ├─ small_jungle_brown_stained_glass_flask.json
         │     │        ├─ small_jungle_cyan_stained_glass_flask.json
         │     │        ├─ small_jungle_glass_flask.json
         │     │        ├─ small_jungle_gray_stained_glass_flask.json
         │     │        ├─ small_jungle_green_stained_glass_flask.json
         │     │        ├─ small_jungle_light_blue_stained_glass_flask.json
         │     │        ├─ small_jungle_light_gray_stained_glass_flask.json
         │     │        ├─ small_jungle_lime_stained_glass_flask.json
         │     │        ├─ small_jungle_magenta_stained_glass_flask.json
         │     │        ├─ small_jungle_orange_stained_glass_flask.json
         │     │        ├─ small_jungle_pink_stained_glass_flask.json
         │     │        ├─ small_jungle_purple_stained_glass_flask.json
         │     │        ├─ small_jungle_red_stained_glass_flask.json
         │     │        ├─ small_jungle_tinted_glass_flask.json
         │     │        ├─ small_jungle_white_stained_glass_flask.json
         │     │        ├─ small_jungle_yellow_stained_glass_flask.json
         │     │        ├─ small_mangrove_black_stained_glass_flask.json
         │     │        ├─ small_mangrove_blue_stained_glass_flask.json
         │     │        ├─ small_mangrove_brown_stained_glass_flask.json
         │     │        ├─ small_mangrove_cyan_stained_glass_flask.json
         │     │        ├─ small_mangrove_glass_flask.json
         │     │        ├─ small_mangrove_gray_stained_glass_flask.json
         │     │        ├─ small_mangrove_green_stained_glass_flask.json
         │     │        ├─ small_mangrove_light_blue_stained_glass_flask.json
         │     │        ├─ small_mangrove_light_gray_stained_glass_flask.json
         │     │        ├─ small_mangrove_lime_stained_glass_flask.json
         │     │        ├─ small_mangrove_magenta_stained_glass_flask.json
         │     │        ├─ small_mangrove_orange_stained_glass_flask.json
         │     │        ├─ small_mangrove_pink_stained_glass_flask.json
         │     │        ├─ small_mangrove_purple_stained_glass_flask.json
         │     │        ├─ small_mangrove_red_stained_glass_flask.json
         │     │        ├─ small_mangrove_tinted_glass_flask.json
         │     │        ├─ small_mangrove_white_stained_glass_flask.json
         │     │        ├─ small_mangrove_yellow_stained_glass_flask.json
         │     │        ├─ small_oak_black_stained_glass_flask.json
         │     │        ├─ small_oak_blue_stained_glass_flask.json
         │     │        ├─ small_oak_brown_stained_glass_flask.json
         │     │        ├─ small_oak_cyan_stained_glass_flask.json
         │     │        ├─ small_oak_glass_flask.json
         │     │        ├─ small_oak_gray_stained_glass_flask.json
         │     │        ├─ small_oak_green_stained_glass_flask.json
         │     │        ├─ small_oak_light_blue_stained_glass_flask.json
         │     │        ├─ small_oak_light_gray_stained_glass_flask.json
         │     │        ├─ small_oak_lime_stained_glass_flask.json
         │     │        ├─ small_oak_magenta_stained_glass_flask.json
         │     │        ├─ small_oak_orange_stained_glass_flask.json
         │     │        ├─ small_oak_pink_stained_glass_flask.json
         │     │        ├─ small_oak_purple_stained_glass_flask.json
         │     │        ├─ small_oak_red_stained_glass_flask.json
         │     │        ├─ small_oak_tinted_glass_flask.json
         │     │        ├─ small_oak_white_stained_glass_flask.json
         │     │        ├─ small_oak_yellow_stained_glass_flask.json
         │     │        ├─ small_pale_oak_black_stained_glass_flask.json
         │     │        ├─ small_pale_oak_blue_stained_glass_flask.json
         │     │        ├─ small_pale_oak_brown_stained_glass_flask.json
         │     │        ├─ small_pale_oak_cyan_stained_glass_flask.json
         │     │        ├─ small_pale_oak_glass_flask.json
         │     │        ├─ small_pale_oak_gray_stained_glass_flask.json
         │     │        ├─ small_pale_oak_green_stained_glass_flask.json
         │     │        ├─ small_pale_oak_light_blue_stained_glass_flask.json
         │     │        ├─ small_pale_oak_light_gray_stained_glass_flask.json
         │     │        ├─ small_pale_oak_lime_stained_glass_flask.json
         │     │        ├─ small_pale_oak_magenta_stained_glass_flask.json
         │     │        ├─ small_pale_oak_orange_stained_glass_flask.json
         │     │        ├─ small_pale_oak_pink_stained_glass_flask.json
         │     │        ├─ small_pale_oak_purple_stained_glass_flask.json
         │     │        ├─ small_pale_oak_red_stained_glass_flask.json
         │     │        ├─ small_pale_oak_tinted_glass_flask.json
         │     │        ├─ small_pale_oak_white_stained_glass_flask.json
         │     │        ├─ small_pale_oak_yellow_stained_glass_flask.json
         │     │        ├─ small_spruce_black_stained_glass_flask.json
         │     │        ├─ small_spruce_blue_stained_glass_flask.json
         │     │        ├─ small_spruce_brown_stained_glass_flask.json
         │     │        ├─ small_spruce_cyan_stained_glass_flask.json
         │     │        ├─ small_spruce_glass_flask.json
         │     │        ├─ small_spruce_gray_stained_glass_flask.json
         │     │        ├─ small_spruce_green_stained_glass_flask.json
         │     │        ├─ small_spruce_light_blue_stained_glass_flask.json
         │     │        ├─ small_spruce_light_gray_stained_glass_flask.json
         │     │        ├─ small_spruce_lime_stained_glass_flask.json
         │     │        ├─ small_spruce_magenta_stained_glass_flask.json
         │     │        ├─ small_spruce_orange_stained_glass_flask.json
         │     │        ├─ small_spruce_pink_stained_glass_flask.json
         │     │        ├─ small_spruce_purple_stained_glass_flask.json
         │     │        ├─ small_spruce_red_stained_glass_flask.json
         │     │        ├─ small_spruce_tinted_glass_flask.json
         │     │        ├─ small_spruce_white_stained_glass_flask.json
         │     │        ├─ small_spruce_yellow_stained_glass_flask.json
         │     │        ├─ small_warped_black_stained_glass_flask.json
         │     │        ├─ small_warped_blue_stained_glass_flask.json
         │     │        ├─ small_warped_brown_stained_glass_flask.json
         │     │        ├─ small_warped_cyan_stained_glass_flask.json
         │     │        ├─ small_warped_glass_flask.json
         │     │        ├─ small_warped_gray_stained_glass_flask.json
         │     │        ├─ small_warped_green_stained_glass_flask.json
         │     │        ├─ small_warped_light_blue_stained_glass_flask.json
         │     │        ├─ small_warped_light_gray_stained_glass_flask.json
         │     │        ├─ small_warped_lime_stained_glass_flask.json
         │     │        ├─ small_warped_magenta_stained_glass_flask.json
         │     │        ├─ small_warped_orange_stained_glass_flask.json
         │     │        ├─ small_warped_pink_stained_glass_flask.json
         │     │        ├─ small_warped_purple_stained_glass_flask.json
         │     │        ├─ small_warped_red_stained_glass_flask.json
         │     │        ├─ small_warped_tinted_glass_flask.json
         │     │        ├─ small_warped_white_stained_glass_flask.json
         │     │        └─ small_warped_yellow_stained_glass_flask.json
         │     └─ tags
         │        ├─ alcohol_fluids.json
         │        ├─ alcohol_types.json
         │        ├─ barrels.json
         │        ├─ blocked_fluids.json
         │        ├─ drinkable_fluids.json
         │        ├─ large_flasks.json
         │        ├─ medium_flasks.json
         │        ├─ overlays.json
         │        ├─ small_flasks.json
         │        └─ storable_fluids.json
         ├─ fabric.mod.json
         └─ icon.png

```
