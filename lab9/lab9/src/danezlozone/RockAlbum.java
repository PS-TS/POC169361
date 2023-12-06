package danezlozone;

import java.util.Objects;

// Klasa potomna
class RockAlbum extends MusicAlbum {
    private String rockGenre;

    public RockAlbum(String title, String artist, String rockGenre) {
        super(title, artist);
        this.rockGenre = rockGenre;
    }
    public String getRockGenre() {
        return rockGenre;
    }
    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }
    public String toString() {
        return "RockAlbum: " +
                "Tytuł: " + getTitle() +
                ", Artysta: " + getArtist() +
                ", Oceny: " + getRatings() +
                ", Gatunek Rocka: " + rockGenre;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RockAlbum rockAlbum = (RockAlbum) o;
        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), rockGenre);
    }
}
