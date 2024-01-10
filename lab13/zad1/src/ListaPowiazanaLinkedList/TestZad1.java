package ListaPowiazanaLinkedList;
import java.util.LinkedList;
import java.util.List;
public class TestZad1 {
    public static void main(String[] args) {
        LinkedList<String> Lista = new LinkedList<>(List.of("a", "b", "c", "b", "a"));
        boolean Czyjest = Zad1.isPalindrome(Lista);

        System.out.println("Czy lista jest palindromem? " + Czyjest);
    }
}
