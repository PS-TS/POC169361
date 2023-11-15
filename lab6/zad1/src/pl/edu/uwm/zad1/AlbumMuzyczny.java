package pl.edu.uwm.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class AlbumMuzyczny {
    public String tytul;
    public String artysta;
    public ArrayList<Double> oceny = new ArrayList<>();;

    public AlbumMuzyczny() {

    }

    public String getTytul() {
        return tytul;
    }

    public String getArtysta() {
        return artysta;
    }

    public ArrayList<Double> getOceny() {
        return oceny;
    }
    public void setAlbum(String tytul,String artysta){
        this.artysta=artysta;
        this.tytul=tytul;
    }

    public void dodajOcene(double ocena) {
        oceny.add(ocena);
    }

    public void usunOcene(int indeks) {
        oceny.remove(indeks);
    }

    public String toString() {
        return "AlbumMuzyczny: " +
                "tytuł - " + tytul +
                ", artysta  - " + artysta +
                ", oceny  - " + oceny;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumMuzyczny that = (AlbumMuzyczny) o;
        return Objects.equals(tytul, that.tytul) && Objects.equals(artysta, that.artysta) && Objects.equals(oceny, that.oceny);
    }
}
