package pl.edu.uwm.zad11;

class Dom extends Budynek {
    private int liczbaPokoi;

    public Dom(int wysokosc, String kolor, int liczbaPokoi) {
        super(wysokosc, kolor);
        this.liczbaPokoi = liczbaPokoi;
    }
}
