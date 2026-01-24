package dk.mosberg.taob;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.taob.util.ResourceScanner;
import net.fabricmc.api.ModInitializer;

public class TAoB implements ModInitializer {
    public static final String MOD_ID = "taob";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing The Art of Brewing...");
        scanAndRegisterBarrels();
        scanAndRegisterFlasks();
    }

    private void scanAndRegisterBarrels() {
        // Example: scan resources/data/taob/barrels/ for JSON definitions
        try {
            Path barrelsPath = Paths.get("src/main/resources/data/taob/barrels/");
            List<Path> barrelDefs =
                    ResourceScanner.scan(barrelsPath, p -> p.toString().endsWith(".json"));
            for (Path def : barrelDefs) {
                // TODO: parse JSON, create BarrelBlock/BarrelItem, register
                LOGGER.info("Found barrel definition: {}", def.getFileName());
            }
        } catch (Exception e) {
            LOGGER.error("Failed to scan/register barrels", e);
        }
    }

    private void scanAndRegisterFlasks() {
        // Example: scan resources/data/taob/flasks/ for JSON definitions
        try {
            Path flasksPath = Paths.get("src/main/resources/data/taob/flasks/");
            List<Path> flaskDefs =
                    ResourceScanner.scan(flasksPath, p -> p.toString().endsWith(".json"));
            for (Path def : flaskDefs) {
                // TODO: parse JSON, create Small/Medium/LargeFlaskItem, register
                LOGGER.info("Found flask definition: {}", def.getFileName());
            }
        } catch (Exception e) {
            LOGGER.error("Failed to scan/register flasks", e);
        }
    }
}
