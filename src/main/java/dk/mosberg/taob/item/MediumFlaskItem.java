


package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered medium flask items.
 */
public class MediumFlaskItem extends Item {
    public MediumFlaskItem(Settings settings) {
        super(settings);
    }

    public static final Map<Identifier, MediumFlaskItem> MEDIUM_FLASK_ITEMS = new LinkedHashMap<>();

    public static void register(Identifier id, MediumFlaskItem item) {
        MEDIUM_FLASK_ITEMS.put(id, item);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
