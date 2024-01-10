package HashMap;
import java.util.HashMap;

public class TestZad1 {
    public static void main(String[] args) {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("x", 1);
        test.put("y", 2);
        test.put("z", 3);
        test.put("y", 2);

        HashMap<Integer, Integer> wystapienia = Zad1.countValueOccurrences(test);

        System.out.println("Mapa: " + test);
        System.out.println("Wystapienia: " + wystapienia);
    }
}
