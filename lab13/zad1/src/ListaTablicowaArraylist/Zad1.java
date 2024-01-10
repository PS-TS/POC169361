package ListaTablicowaArraylist;
import java.util.ArrayList;
import java.util.List;
public class Zad1 {
    public static <T> List<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Pusta lista");
        }

        List<T> polaczona = new ArrayList<>(list1);
        polaczona.addAll(list2);

        return polaczona;
    }
}
