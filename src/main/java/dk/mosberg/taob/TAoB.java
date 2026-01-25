package dk.mosberg.taob;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dk.mosberg.taob.block.BarrelBlock;
import dk.mosberg.taob.effect.TipsyStatusEffect;
import dk.mosberg.taob.item.BarrelItem;
import dk.mosberg.taob.item.LargeFlaskItem;
import dk.mosberg.taob.item.MediumFlaskItem;
import dk.mosberg.taob.item.SmallFlaskItem;
import dk.mosberg.taob.util.DynamicRegistry;
import dk.mosberg.taob.util.FluidPropertiesLoader;
import dk.mosberg.taob.util.RecipeRegistrar;
import dk.mosberg.taob.util.ResourceScanner;
import dk.mosberg.taob.util.TagLoader;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class TAoB implements ModInitializer {
    // Fluid mixing recipes (inputA+inputB -> result)
    public static final Map<FluidMixKey, FluidMixRecipe> FLUID_MIX_RECIPES = new HashMap<>();
    public static Item BREWERY_LOGBOOK_ITEM;
    // Map of unlockable brewing recipes (id -> definition)
    public static final Map<String, UnlockableRecipe> UNLOCKABLE_RECIPES = new HashMap<>();
    // Status effect registry
    public static StatusEffect TIPSY_STATUS_EFFECT;
    public static final String MOD_ID = "taob";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    // Item group (creative tab) identifiers
    public static final Identifier BARRELS_GROUP_ID = Identifier.of(MOD_ID, "barrels");
    public static final Identifier SMALL_FLASKS_GROUP_ID = Identifier.of(MOD_ID, "small_flasks");
    public static final Identifier MEDIUM_FLASKS_GROUP_ID = Identifier.of(MOD_ID, "medium_flasks");
    public static final Identifier LARGE_FLASKS_GROUP_ID = Identifier.of(MOD_ID, "large_flasks");

    // Dynamic registries for blocks/items
    public static final DynamicRegistry<BarrelBlock> BARREL_BLOCK_REGISTRY =
            new DynamicRegistry<>(block -> {
            });
    public static final DynamicRegistry<BarrelItem> BARREL_ITEM_REGISTRY =
            new DynamicRegistry<>(item -> {
            });
    public static final DynamicRegistry<SmallFlaskItem> SMALL_FLASK_REGISTRY =
            new DynamicRegistry<>(item -> {
            });
    public static final DynamicRegistry<MediumFlaskItem> MEDIUM_FLASK_REGISTRY =
            new DynamicRegistry<>(item -> {
            });
    public static final DynamicRegistry<LargeFlaskItem> LARGE_FLASK_REGISTRY =
            new DynamicRegistry<>(item -> {
            });

    // Fluid properties loader
    public static final FluidPropertiesLoader FLUID_PROPERTIES = new FluidPropertiesLoader();

    // Item group registry keys
    public static final net.minecraft.registry.RegistryKey<net.minecraft.item.ItemGroup> BARRELS_GROUP_KEY =
            net.minecraft.registry.RegistryKey
                    .of(net.minecraft.registry.Registries.ITEM_GROUP.getKey(), BARRELS_GROUP_ID);
    public static final net.minecraft.registry.RegistryKey<net.minecraft.item.ItemGroup> SMALL_FLASKS_GROUP_KEY =
            net.minecraft.registry.RegistryKey.of(
                    net.minecraft.registry.Registries.ITEM_GROUP.getKey(), SMALL_FLASKS_GROUP_ID);
    public static final net.minecraft.registry.RegistryKey<net.minecraft.item.ItemGroup> MEDIUM_FLASKS_GROUP_KEY =
            net.minecraft.registry.RegistryKey.of(
                    net.minecraft.registry.Registries.ITEM_GROUP.getKey(), MEDIUM_FLASKS_GROUP_ID);
    public static final net.minecraft.registry.RegistryKey<net.minecraft.item.ItemGroup> LARGE_FLASKS_GROUP_KEY =
            net.minecraft.registry.RegistryKey.of(
                    net.minecraft.registry.Registries.ITEM_GROUP.getKey(), LARGE_FLASKS_GROUP_ID);

    // Item group objects
    public static net.minecraft.item.ItemGroup BARRELS_GROUP;
    public static net.minecraft.item.ItemGroup SMALL_FLASKS_GROUP;
    public static net.minecraft.item.ItemGroup MEDIUM_FLASKS_GROUP;
    public static net.minecraft.item.ItemGroup LARGE_FLASKS_GROUP;

    @Override
    public void onInitialize() {
        loadFluidMixRecipes();
        loadUnlockableBrewingRecipes();
        registerStatusEffects();
        registerItemGroups();
        LOGGER.info("Initializing The Art of Brewing...");
        scanAndRegisterContainers();
        scanAndRegisterRecipes();
        loadFluidProperties();
        registerDynamicItemsToGroups();
        LOGGER.info("Creative tabs and dynamic item group population complete.");
    }



    // (No method calls or statements outside of methods)
    // All method calls and statements must be inside methods only.

    // (Stray method calls and LOGGER.info statements have been removed)
    // All method calls and statements must be inside methods only.

    // All method calls and statements must be inside methods only.

    // Loads fluid mixing recipes from data/taob/fluid_mixes/*.json
    private void loadFluidMixRecipes() {
        try {
            java.nio.file.Path dir =
                    java.nio.file.Paths.get("src/main/resources/data/taob/fluid_mixes");
            com.google.gson.Gson gson = new com.google.gson.Gson();
            try (java.nio.file.DirectoryStream<java.nio.file.Path> stream =
                    java.nio.file.Files.newDirectoryStream(dir, "*.json")) {
                for (java.nio.file.Path entry : stream) {
                    try (java.io.FileReader reader = new java.io.FileReader(entry.toFile())) {
                        @SuppressWarnings("null")
                        FluidMixRecipe recipe = gson.fromJson(reader, FluidMixRecipe.class);
                        FLUID_MIX_RECIPES.put(new FluidMixKey(recipe.inputA, recipe.inputB),
                                recipe);
                        FLUID_MIX_RECIPES.put(new FluidMixKey(recipe.inputB, recipe.inputA),
                                recipe); // allow both orders
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("Failed to load fluid mix recipes: {}", e.getMessage());
        }
    }

    // Utility: get mix result for two fluids (returns null if no match)
    public static String getFluidMixResult(String fluidA, int amountA, String fluidB, int amountB) {
        FluidMixRecipe recipe = FLUID_MIX_RECIPES.get(new FluidMixKey(fluidA, fluidB));
        if (recipe == null)
            return null;
        int minA =
                recipe.conditions != null && recipe.conditions.minA != null ? recipe.conditions.minA
                        : 0;
        int minB =
                recipe.conditions != null && recipe.conditions.minB != null ? recipe.conditions.minB
                        : 0;
        if (amountA >= minA && amountB >= minB) {
            return recipe.result;
        }
        return null;
    }

    // Fluid mix recipe definition
    public static class FluidMixRecipe {
        public String inputA;
        public String inputB;
        public String result;
        public MixConditions conditions;
    }
    public static class MixConditions {
        public Integer minA;
        public Integer minB;
    }
    // Key for unordered fluid pairs
    public static class FluidMixKey {
        public final String a, b;

        public FluidMixKey(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof FluidMixKey k))
                return false;
            return (java.util.Objects.equals(a, k.a) && java.util.Objects.equals(b, k.b))
                    || (java.util.Objects.equals(a, k.b) && java.util.Objects.equals(b, k.a));
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(a) + java.util.Objects.hash(b);
        }
    }

    @SuppressWarnings("null")
    private void registerLogbookItem() {
        // Register the item first, then assign the static field
        Item logbook = net.minecraft.registry.Registry.register(
                net.minecraft.registry.Registries.ITEM, Identifier.of(MOD_ID, "brewery_logbook"),
                new dk.mosberg.taob.item.BreweryLogbookItem(new Item.Settings().maxCount(1)));
        BREWERY_LOGBOOK_ITEM = logbook;
        // Add to barrels creative tab for now
        net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.modifyEntriesEvent(BARRELS_GROUP_KEY)
                .register(entries -> entries.add(BREWERY_LOGBOOK_ITEM));
    }

    // Loads unlockable brewing recipes from data/taob/brewing_unlockable_recipes/*.json
    private void loadUnlockableBrewingRecipes() {
        try {
            java.nio.file.Path dir = java.nio.file.Paths
                    .get("src/main/resources/data/taob/brewing_unlockable_recipes");
            com.google.gson.Gson gson = new com.google.gson.Gson();
            try (java.nio.file.DirectoryStream<java.nio.file.Path> stream =
                    java.nio.file.Files.newDirectoryStream(dir, "*.json")) {
                for (java.nio.file.Path entry : stream) {
                    try (java.io.FileReader reader = new java.io.FileReader(entry.toFile())) {
                        @SuppressWarnings("null")
                        UnlockableRecipe recipe = gson.fromJson(reader, UnlockableRecipe.class);
                        UNLOCKABLE_RECIPES.put(recipe.id, recipe);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("Failed to load unlockable brewing recipes: {}", e.getMessage());
        }
    }

    // Unlockable recipe definition (matches JSON schema)
    public static class UnlockableRecipe {
        public String id;
        public String[] ingredients;
        public UnlockCriterion[] unlock_criteria;
        public String result;
    }

    // Minimal stub for UnlockCriterion to fix build
    public static class UnlockCriterion {
        public String type;
        public String value;
    }

    // Register custom status effects
    private void registerStatusEffects() {
        TIPSY_STATUS_EFFECT = new TipsyStatusEffect(StatusEffectCategory.NEUTRAL, 0xE0C97F);
        // Register with Fabric/MC registry if needed
    }

    // (All stray method calls and LOGGER.info statements between methods have been removed)

    private void registerItemGroups() {
        // Fabric API 0.76.0+ (1.20+) pattern
        BARRELS_GROUP = net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                .displayName(net.minecraft.text.Text.translatable("itemGroup.taob.barrels"))
                .icon(() -> new net.minecraft.item.ItemStack(net.minecraft.item.Items.BARREL))
                .build();
        SMALL_FLASKS_GROUP = net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                .displayName(net.minecraft.text.Text.translatable("itemGroup.taob.small_flasks"))
                .icon(() -> new net.minecraft.item.ItemStack(net.minecraft.item.Items.POTION))
                .build();
        MEDIUM_FLASKS_GROUP = net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                .displayName(net.minecraft.text.Text.translatable("itemGroup.taob.medium_flasks"))
                .icon(() -> new net.minecraft.item.ItemStack(
                        net.minecraft.item.Items.SPLASH_POTION))
                .build();
        LARGE_FLASKS_GROUP = net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                .displayName(net.minecraft.text.Text.translatable("itemGroup.taob.large_flasks"))
                .icon(() -> new net.minecraft.item.ItemStack(
                        net.minecraft.item.Items.LINGERING_POTION))
                .build();

        net.minecraft.registry.Registry.register(net.minecraft.registry.Registries.ITEM_GROUP,
                BARRELS_GROUP_ID, BARRELS_GROUP);
        net.minecraft.registry.Registry.register(net.minecraft.registry.Registries.ITEM_GROUP,
                SMALL_FLASKS_GROUP_ID, SMALL_FLASKS_GROUP);
        net.minecraft.registry.Registry.register(net.minecraft.registry.Registries.ITEM_GROUP,
                MEDIUM_FLASKS_GROUP_ID, MEDIUM_FLASKS_GROUP);
        net.minecraft.registry.Registry.register(net.minecraft.registry.Registries.ITEM_GROUP,
                LARGE_FLASKS_GROUP_ID, LARGE_FLASKS_GROUP);
    }

    @SuppressWarnings("null")
    private void registerDynamicItemsToGroups() {
        // Add all dynamically registered items to their respective creative tabs
        net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.modifyEntriesEvent(BARRELS_GROUP_KEY)
                .register(entries -> {
                    BARREL_ITEM_REGISTRY.getAll().values().forEach(entries::add);
                });
        net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
                .modifyEntriesEvent(SMALL_FLASKS_GROUP_KEY).register(entries -> {
                    SMALL_FLASK_REGISTRY.getAll().values().forEach(entries::add);
                });
        net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
                .modifyEntriesEvent(MEDIUM_FLASKS_GROUP_KEY).register(entries -> {
                    MEDIUM_FLASK_REGISTRY.getAll().values().forEach(entries::add);
                });
        net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
                .modifyEntriesEvent(LARGE_FLASKS_GROUP_KEY).register(entries -> {
                    LARGE_FLASK_REGISTRY.getAll().values().forEach(entries::add);
                });
    }

    private void loadFluidProperties() {
        java.nio.file.Path fluidDir =
                java.nio.file.Paths.get("src/main/resources/data/taob/alcohol_fluid_properties");
        FLUID_PROPERTIES.loadFluidProperties(fluidDir);
    }


    private void scanAndRegisterContainers() {
        // Scan containers from resource-driven JSON definitions
        try {
            var containerDir = Paths.get("src/main/resources/data/taob/containers");
            var jsonFiles = ResourceScanner.scan(containerDir, p -> p.toString().endsWith(".json"));
            for (var path : jsonFiles) {
                try (var reader = Files.newBufferedReader(path)) {
                    JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
                    String idStr = obj.get("id").getAsString();
                    Identifier id = Identifier.of(idStr);
                    String type = obj.get("type").getAsString();
                    if ("taob:container_block".equals(type)) {
                        BarrelBlock block = new BarrelBlock(Block.Settings.create(),
                                obj.has("wood_type") ? obj.get("wood_type").getAsString() : "oak",
                                obj.has("metal_type") ? obj.get("metal_type").getAsString()
                                        : "iron");
                        BARREL_BLOCK_REGISTRY.register(id.toString(), block);
                        LOGGER.info("Registered barrel block: {}", id);
                    } else if ("taob:container_item".equals(type)) {
                        String containerType =
                                obj.has("container_type") ? obj.get("container_type").getAsString()
                                        : "flask";
                        String size = obj.has("size") ? obj.get("size").getAsString() : "standard";
                        String woodType =
                                obj.has("wood_type") ? obj.get("wood_type").getAsString() : "oak";
                        String color = obj.has("color") ? obj.get("color").getAsString() : "clear";
                        if ("barrel".equals(containerType)) {
                            BarrelItem item = new BarrelItem(null, new Item.Settings(), woodType,
                                    obj.has("metal_type") ? obj.get("metal_type").getAsString()
                                            : "iron");
                            BARREL_ITEM_REGISTRY.register(id.toString(), item);
                            LOGGER.info("Registered barrel item: {}", id);
                        } else if ("flask".equals(containerType)) {
                            if ("large".equals(size)) {
                                LargeFlaskItem item =
                                        new LargeFlaskItem(new Item.Settings(), woodType, color);
                                LARGE_FLASK_REGISTRY.register(id.toString(), item);
                                LOGGER.info("Registered large flask: {}", id);
                            } else if ("medium".equals(size)) {
                                MediumFlaskItem item =
                                        new MediumFlaskItem(new Item.Settings(), woodType, color);
                                MEDIUM_FLASK_REGISTRY.register(id.toString(), item);
                                LOGGER.info("Registered medium flask: {}", id);
                            } else if ("small".equals(size)) {
                                SmallFlaskItem item =
                                        new SmallFlaskItem(new Item.Settings(), woodType, color);
                                SMALL_FLASK_REGISTRY.register(id.toString(), item);
                                LOGGER.info("Registered small flask: {}", id);
                            }
                        } else if ("logbook".equals(containerType)) {
                            dk.mosberg.taob.item.BreweryLogbookItem item =
                                    new dk.mosberg.taob.item.BreweryLogbookItem(
                                            new Item.Settings().maxCount(obj.has("max_count")
                                                    ? obj.get("max_count").getAsInt()
                                                    : 1));
                            // Register to MC registry and assign static field
                            Item registered = net.minecraft.registry.Registry
                                    .register(net.minecraft.registry.Registries.ITEM, id, item);
                            BREWERY_LOGBOOK_ITEM = registered;
                            LOGGER.info("Registered brewery logbook item: {}", id);
                        }
                    }
                } catch (Exception e) {
                    LOGGER.error("Failed to register container from {}", path, e);
                }
            }
        } catch (Exception e) {
            LOGGER.error("Failed to scan/register containers", e);
        }
    }

    private void scanAndRegisterRecipes() {
        // Automate recipe registration for barrels and flasks
        try {
            List<String> barrelIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/barrels.json");
            for (String idStr : barrelIds) {
                Identifier id = Identifier.of(idStr);
                String recipePath =
                        "src/main/resources/data/taob/recipes/barrels/" + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> largeFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/large_flasks.json");
            for (String idStr : largeFlaskIds) {
                Identifier id = Identifier.of(idStr);
                String recipePath = "src/main/resources/data/taob/recipes/flasks/large/"
                        + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> mediumFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/medium_flasks.json");
            for (String idStr : mediumFlaskIds) {
                Identifier id = Identifier.of(idStr);
                String recipePath = "src/main/resources/data/taob/recipes/flasks/medium/"
                        + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> smallFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/small_flasks.json");
            for (String idStr : smallFlaskIds) {
                Identifier id = Identifier.of(idStr);
                String recipePath = "src/main/resources/data/taob/recipes/flasks/small/"
                        + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            LOGGER.info("Automated recipe registration complete.");
        } catch (Exception e) {
            LOGGER.error("Failed to automate recipe registration", e);
        }
    }
}
