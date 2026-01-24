


package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered small flask items.
 */
public class SmallFlaskItem extends Item {
    private final String woodType;
    private final String color;

    public SmallFlaskItem(Settings settings, String woodType, String color) {
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

    public static final Map<Identifier, SmallFlaskItem> SMALL_FLASK_ITEMS = new LinkedHashMap<>();

    public static void register(Identifier id, SmallFlaskItem item) {
        SMALL_FLASK_ITEMS.put(id, item);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
