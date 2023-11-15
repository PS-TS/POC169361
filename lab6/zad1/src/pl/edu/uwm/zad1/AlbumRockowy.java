package pl.edu.uwm.zad1;

import java.util.Arrays;
import java.util.Objects;

public class AlbumRockowy extends AlbumMuzyczny {
    public String gatunekRocka;

    public AlbumRockowy() {
    }

    public String getGatunekRocka() {
        return gatunekRocka;
    }

    public void setAlbumRockowy(String gatunekRocka, String tytul,String artysta) {
        this.gatunekRocka = gatunekRocka;
        this.artysta=artysta;
        this.tytul=tytul;
    }

    public String toString() {
        return "AlbumRockowy: " +
                "gatunekRocka - " + gatunekRocka +
                ", tytul - " + tytul +
                ", artysta - " + artysta +
                ", oceny - " + oceny;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlbumRockowy that = (AlbumRockowy) o;
        return Objects.equals(gatunekRocka, that.gatunekRocka);
    }
}
