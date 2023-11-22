package pl.edu.uwm.zad11;

class Budynek {
    private int wysokosc;
    private String kolor;

    public Budynek(int wysokosc, String kolor) {
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }
    public Budynek() {
        this.wysokosc = 0;
        this.kolor = "Biały";
    }
}

