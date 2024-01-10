package TreeSet;
import java.util.TreeSet;
public class Zad1 {
    public static <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> tab, T lowerBound, T upperBound) {
        if (tab == null || lowerBound == null || upperBound == null) {
            throw new IllegalArgumentException("Pusto");
        }

        TreeSet<T> elementywzakresie = new TreeSet<>();

        for (T x : tab) {
            if (x.compareTo(lowerBound) >= 0 && x.compareTo(upperBound) <= 0) {
                elementywzakresie.add(x);
            }
        }

        return elementywzakresie;
    }
}
