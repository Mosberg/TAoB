package dk.mosberg.taob.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Utility for scanning resources (JSON, assets, etc.) at runtime for dynamic registration.
 */
public class ResourceScanner {
    public static List<Path> scan(Path root, Predicate<Path> filter) throws IOException {
        List<Path> result = new ArrayList<>();
        Files.walk(root).filter(filter).forEach(result::add);
        return result;
    }

    public static InputStream getResourceAsStream(ClassLoader loader, String resourcePath) {
        return loader.getResourceAsStream(resourcePath);
    }
}
