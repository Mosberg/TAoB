package dk.mosberg.taob.util;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Utility to load tag JSON files and extract ID lists for dynamic registration.
 */
public class TagLoader {
    public static List<String> loadIds(String filePath) {
        List<String> ids = new ArrayList<>();
        try (FileReader reader = new FileReader(filePath)) {
            JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray values = obj.getAsJsonArray("values");
            for (int i = 0; i < values.size(); i++) {
                ids.add(values.get(i).getAsString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ids;
    }
}
