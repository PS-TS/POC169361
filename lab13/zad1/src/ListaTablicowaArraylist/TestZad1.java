package ListaTablicowaArraylist;
import java.util.ArrayList;
import java.util.List;
public class TestZad1 {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>(List.of("a", "b", "c"));
        ArrayList<String> lista2 = new ArrayList<>(List.of("x", "y", "z"));

        List<String> sklejona = Zad1.mergeLists(lista1, lista2);

        // Wyświetlenie wyniku
        System.out.println("List1: " + lista1);
        System.out.println("List2: " + lista2);
        System.out.println("Merged List: " + sklejona);
    }
}
