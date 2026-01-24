package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import dk.mosberg.taob.TAoB;
import dk.mosberg.taob.registry.RegistryManifest;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class BarrelItem {
    private BarrelItem() {}

    // Map keeps deterministic order (JSON order is preserved by our generator if desired).
    public static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    public static void registerAll() {
        JsonObject root = RegistryManifest.loadOrThrow();
        for (String id : RegistryManifest.getStringList(root, "barrel_items")) {
            var item = new Item(new Item.Settings().maxCount(1));
            ITEMS.put(id, Registry.register(Registries.ITEM, Identifier.of(TAoB.MOD_ID, id), item));
        }
    }
}
