package compare.zad1;
import java.util.Collections;
import java.util.ArrayList;


public class TestStudent {
    public static void main(String[] args){
    ArrayList<Student> lista = new ArrayList<Student>();
    lista.add(new Student(4.5));
    lista.add(new Student(4.4));
    lista.add(new Student(4.3));
    lista.add(new Student(4.6));
    lista.add(new Student(4.7));
    Collections.sort(lista);
    System.out.println(lista);
    }
}
