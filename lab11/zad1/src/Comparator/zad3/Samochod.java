package Comparator.zad3;

public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String toString() {
        return "Samochod " +
                "rokProdukcji " + rokProdukcji;
    }
}
