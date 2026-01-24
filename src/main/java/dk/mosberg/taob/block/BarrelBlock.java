package dk.mosberg.taob.block;

import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import dk.mosberg.taob.TAoB;
import dk.mosberg.taob.registry.RegistryManifest;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class BarrelBlock {
    private BarrelBlock() {}

    public static final Map<String, Block> BLOCKS = new LinkedHashMap<>();

    public static void registerAll() {
        JsonObject root = RegistryManifest.loadOrThrow();
        for (String id : RegistryManifest.getStringList(root, "barrel_blocks")) {
            var block = new Block(AbstractBlock.Settings.copy(Blocks.BARREL));
            BLOCKS.put(id,
                    Registry.register(Registries.BLOCK, Identifier.of(TAoB.MOD_ID, id), block));
        }
    }
}
