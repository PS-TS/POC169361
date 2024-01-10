package InterfejsCollection;
import java.util.Collection;
import java.util.HashSet;
public class Zad1 {
    public static <T> void printUnique(Collection<T> items) {
        if (items == null) {
            System.out.println("Pusto");
            return;
        }

        HashSet<T> uniqueSet = new HashSet<>(items);
        System.out.println("Elementy unikalne:");
        for (T item : uniqueSet) {
            System.out.println(item);
        }
    }
}
