package dk.mosberg.taob;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.taob.block.BarrelBlock;
import dk.mosberg.taob.item.BarrelItem;
import dk.mosberg.taob.item.LargeFlaskItem;
import dk.mosberg.taob.item.MediumFlaskItem;
import dk.mosberg.taob.item.SmallFlaskItem;
import dk.mosberg.taob.util.RecipeRegistrar;
import dk.mosberg.taob.util.TagLoader;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class TAoB implements ModInitializer {
    public static final String MOD_ID = "taob";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing The Art of Brewing...");
        scanAndRegisterBarrels();
        scanAndRegisterFlasks();
        scanAndRegisterRecipes();
    }

    private void scanAndRegisterBarrels() {
        // Scan barrels from tag file and automate registration
        try {
            List<String> barrelIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/barrels.json");
            for (String idStr : barrelIds) {
                Identifier id = new Identifier(idStr);
                BarrelBlock block = new BarrelBlock(Block.Settings.create());
                BarrelBlock.register(id, block);
                BarrelItem item = new BarrelItem(block, new net.minecraft.item.Item.Settings());
                BarrelItem.register(id, item);
                LOGGER.info("Registered barrel: {}", id);
            }
        } catch (Exception e) {
            LOGGER.error("Failed to scan/register barrels", e);
        }
    }

    private void scanAndRegisterFlasks() {
        // Scan flasks from tag files and automate registration
        try {
            List<String> largeFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/large_flasks.json");
            for (String idStr : largeFlaskIds) {
                Identifier id = new Identifier(idStr);
                LargeFlaskItem item = new LargeFlaskItem(new net.minecraft.item.Item.Settings());
                LargeFlaskItem.register(id, item);
                LOGGER.info("Registered large flask: {}", id);
            }
            List<String> mediumFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/medium_flasks.json");
            for (String idStr : mediumFlaskIds) {
                Identifier id = new Identifier(idStr);
                MediumFlaskItem item = new MediumFlaskItem(new net.minecraft.item.Item.Settings());
                MediumFlaskItem.register(id, item);
                LOGGER.info("Registered medium flask: {}", id);
            }
            List<String> smallFlaskIds =
                    TagLoader.loadIds("src/main/resources/data/taob/tags/small_flasks.json");
            for (String idStr : smallFlaskIds) {
                Identifier id = new Identifier(idStr);
                SmallFlaskItem item = new SmallFlaskItem(new net.minecraft.item.Item.Settings());
                SmallFlaskItem.register(id, item);
                LOGGER.info("Registered small flask: {}", id);
            }
        } catch (Exception e) {
            LOGGER.error("Failed to scan/register flasks", e);
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
