package ZbiorBazujacynaHashSet;
import java.util.HashSet;
import java.util.List;
public class Zad1 {
    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Pusta Lista");
        }
        return new HashSet<>(list);
    }
}
