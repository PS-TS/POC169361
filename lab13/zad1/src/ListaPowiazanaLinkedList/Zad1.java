package ListaPowiazanaLinkedList;
import java.util.LinkedList;
public class Zad1 {
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("Pusta Lista");
        }
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }

        LinkedList<T> zwykla = new LinkedList<>(list);
        LinkedList<T> odtylu = new LinkedList<>(list);
        odtylu.descendingIterator();

        while (!zwykla.isEmpty() && !odtylu.isEmpty()) {
            if (!zwykla.pollFirst().equals(odtylu.pollFirst())) {
                return false;
            }
        }
        return zwykla.isEmpty() && odtylu.isEmpty();
    }
}
