package ZbiorBazujacynaHashSet;
import java.util.HashSet;
import java.util.List;

public class TestZad1 {
    public static void main(String[] args) {

        List<String> lista = List.of("xy", "xy", "xx", "yy", "xx", "yy", "yx");

        HashSet<String> unikalne = Zad1.findUniqueElements(lista);

        System.out.println("Oryginalna lista: " + lista);
        System.out.println("Unikalne elementy: " + unikalne);
    }
}
