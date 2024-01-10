package TreeMap;
import java.util.TreeMap;
public class TestZad1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> mapa = new TreeMap<>();
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(3, "c");
        mapa.put(4, "d");
        mapa.put(5, "e");
        mapa.put(6, "f");
        mapa.put(7, "g");

        TreeMap<Integer, String> submapa = Zad1.subMapInRange(mapa, 3, 5);

        System.out.println("Mapa: " + mapa);
        System.out.println("Podmapa: " + submapa);
    }
}
