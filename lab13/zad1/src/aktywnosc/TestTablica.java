package aktywnosc;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestTablica {

    public static void main(String[] args) {
        List<String> lista1 = Arrays.asList("A", "B", "C");
        List<Integer> lista2 = Arrays.asList(1, 2, 3);
        List<Double> lista3 = Arrays.asList(0.1, 0.2, 0.3);

        Collection[] tablica1 = {lista1};
        Collection[] tablica2 = {lista2};
        Collection[] tablica3 = {lista3};

        Tablica.printArrayElements(tablica1);
        Tablica.printArrayElements(tablica2);
        Tablica.printArrayElements(tablica3);
    }
}
