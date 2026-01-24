


package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered large flask items.
 */
public class LargeFlaskItem extends Item {
    public LargeFlaskItem(Settings settings) {
        super(settings);
    }

    public static final Map<Identifier, LargeFlaskItem> LARGE_FLASK_ITEMS = new LinkedHashMap<>();

    public static void register(Identifier id, LargeFlaskItem item) {
        LARGE_FLASK_ITEMS.put(id, item);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
