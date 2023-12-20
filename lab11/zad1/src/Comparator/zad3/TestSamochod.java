package Comparator.zad3;
import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] samochody = {
                new Samochod(2020),
                new Samochod(2019),
                new Samochod(2021),
                new Samochod(2018),
                new Samochod(2022)
        };

        Arrays.sort(samochody, new SamochodComparator());

        for (Samochod samochod : samochody) {
            System.out.println(samochod);
        }
    }
}
