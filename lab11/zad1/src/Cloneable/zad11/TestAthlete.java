package Cloneable.zad11;
import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete o = new Athlete("A", new double[]{10, 9, 8, 9, 10});

        Athlete c = o.clone();

        o.getTimes()[2] = 7.5;

        System.out.println("Oryginał: " + Arrays.toString(o.getTimes()));
        System.out.println("Klon: " + Arrays.toString(c.getTimes()));
    }
}
