


package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered medium flask items.
 */
public class MediumFlaskItem extends Item {
    private final String woodType;
    private final String color;

    public MediumFlaskItem(Settings settings, String woodType, String color) {
        super(settings);
        this.woodType = woodType;
        this.color = color;
    }

    public String getWoodType() {
        return woodType;
    }

    public String getColor() {
        return color;
    }

    public static final Map<Identifier, MediumFlaskItem> MEDIUM_FLASK_ITEMS = new LinkedHashMap<>();

    public static void register(Identifier id, MediumFlaskItem item) {
        MEDIUM_FLASK_ITEMS.put(id, item);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
