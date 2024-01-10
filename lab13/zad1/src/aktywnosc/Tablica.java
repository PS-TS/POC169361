package aktywnosc;
import java.util.Collection;
public class Tablica {
    public static <T> void printArrayElements(Collection<T>[] tab){
        if(tab==null) {
            System.out.println("Pusta tablica");
            return;
        }
        for(int i=0;i<tab.length;i++)
            System.out.println(tab[i]);
    }
}
