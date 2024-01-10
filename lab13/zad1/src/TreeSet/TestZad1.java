package TreeSet;
import java.util.TreeSet;
import java.util.Set;

public class TestZad1 {
    public static void main(String[] args) {
        TreeSet<Integer> caly = new TreeSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

        TreeSet<Integer> zakres = Zad1.findElementsInRange(caly, 3, 7);

        System.out.println("Calosc: " + caly);
        System.out.println("Zakres: " + zakres);
    }
}
