package pl.edu.uwm.a1;

public class TestGrafikaKomputerowa {
    public static void main(String[] args) {
        Wektor w = new Wektor();
        w.wczytajPlik();
        w.wysokosc=10;
        w.zapiszPlik();
        Bitmapa b = new Bitmapa();
        b.wczytajPlik();
        b.nazwaPliku="Nazwa01234567";
    }
}
