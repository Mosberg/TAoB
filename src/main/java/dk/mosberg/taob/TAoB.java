package dk.mosberg.taob;

import java.nio.file.Paths;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dk.mosberg.taob.block.BarrelBlock;
import dk.mosberg.taob.item.BarrelItem;
import dk.mosberg.taob.item.LargeFlaskItem;
import dk.mosberg.taob.item.MediumFlaskItem;
import dk.mosberg.taob.item.SmallFlaskItem;
import dk.mosberg.taob.util.DynamicRegistry;
import dk.mosberg.taob.util.RecipeRegistrar;
import dk.mosberg.taob.util.ResourceScanner;
import dk.mosberg.taob.util.TagLoader;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class TAoB implements ModInitializer {
    public static final String MOD_ID = "taob";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Dynamic registries for blocks and items
    private final DynamicRegistry<Block> BARREL_BLOCK_REGISTRY = new DynamicRegistry<>(block -> {
        // TODO: Register with Fabric/MC registry
    });
    private final DynamicRegistry<Item> BARREL_ITEM_REGISTRY = new DynamicRegistry<>(item -> {
        // TODO: Register with Fabric/MC registry
    });
    private final DynamicRegistry<Item> LARGE_FLASK_REGISTRY = new DynamicRegistry<>(item -> {
        // TODO: Register with Fabric/MC registry
    });
    private final DynamicRegistry<Item> MEDIUM_FLASK_REGISTRY = new DynamicRegistry<>(item -> {
        // TODO: Register with Fabric/MC registry
    });
    private final DynamicRegistry<Item> SMALL_FLASK_REGISTRY = new DynamicRegistry<>(item -> {
        // TODO: Register with Fabric/MC registry
    });

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing The Art of Brewing...");
        scanAndRegisterContainers();
        scanAndRegisterRecipes();
        loadFluidProperties();
        private void loadFluidProperties() {
            var fluidDir = java.nio.file.Paths.get("src/main/resources/data/taob/alcohol_fluid_properties");
            FLUID_PROPERTIES.loadFluidProperties(fluidDir);
        }
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
                    Identifier id = new Identifier(idStr);
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
                Identifier id = new Identifier(idStr);
                String recipePath =
                        "src/main/resources/data/taob/recipes/barrels/" + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> largeFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/large_flasks.json");
            for (String idStr : largeFlaskIds) {
                Identifier id = new Identifier(idStr);
                String recipePath = "src/main/resources/data/taob/recipes/flasks/large/"
                        + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> mediumFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/medium_flasks.json");
            for (String idStr : mediumFlaskIds) {
                Identifier id = new Identifier(idStr);
                String recipePath = "src/main/resources/data/taob/recipes/flasks/medium/"
                        + id.getPath() + ".json";
                RecipeRegistrar.registerRecipe(recipePath);
            }
            List<String> smallFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/small_flasks.json");
            for (String idStr : smallFlaskIds) {
                Identifier id = new Identifier(idStr);
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
