package TreeMap;
import java.util.TreeMap;
public class Zad1 {
    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        if (map == null || startKey == null || endKey == null) {
            throw new IllegalArgumentException("Puste");
        }

        TreeMap<K, V> nowa = new TreeMap<>();

        nowa.putAll(map.subMap(startKey, true, endKey, true));

        return nowa;
    }
}
