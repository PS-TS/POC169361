package Comparator.zad3;

import java.util.Comparator;

public class SamochodComparator implements Comparator<Samochod> {
    public int compare(Samochod samochod1, Samochod samochod2) {
        return Integer.compare(samochod1.getRokProdukcji(), samochod2.getRokProdukcji());
    }
}
