package core.basesyntax.db;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static final Map<String, Integer> fruits = new HashMap<>();

    public static void addFruit(String name, int quantity) {
        fruits.put(name, fruits.getOrDefault(name, 0) + quantity);
    }

    public static int getQuantity(String name) {
        return fruits.getOrDefault(name, 0);
    }

    public static Map<String, Integer> getAllFruits() {
        return new HashMap<>(fruits);
    }
}
