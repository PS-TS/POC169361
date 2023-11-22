package pl.edu.uwm.zad2;

class Ebook extends Ksiazka {
    public Ebook() {
    }
    public void zmienModyfikatoryDostepu() {
        // this.tytul = "tytul"; nie zadziała
        this.autor = "autor";
    }
}
