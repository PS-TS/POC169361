package HashMap;
import java.util.HashMap;

public class Zad1 {
    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        if (map == null) {
            throw new IllegalArgumentException("Pustka");
        }
        HashMap<V, Integer> wystapienia = new HashMap<>();
        for (V value : map.values()) {
            wystapienia.put(value, wystapienia.getOrDefault(value, 0) + 1);
        }

        return wystapienia;
    }
}
