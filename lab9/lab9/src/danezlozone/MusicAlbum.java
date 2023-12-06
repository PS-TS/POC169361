package danezlozone;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Klasa bazowa
class MusicAlbum {
    private String title;
    private String artist;
    private List<Double> ratings;

    public MusicAlbum(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.ratings = new ArrayList<>();
    }
    public void addRating(double rating) {
        ratings.add(rating);
    }
    public void removeRating(double rating) {
        ratings.remove(rating);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public List<Double> getRatings() {
        return ratings;
    }
    public void setRatings(List<Double> ratings) {
        this.ratings = ratings;
    }
    public String toString() {
        return "MusicAlbum: " +
                "Tytuł: " + title +
                ", Artysta: " + artist +
                ", Oceny: " + ratings;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MusicAlbum that = (MusicAlbum) obj;
        return Objects.equals(title, that.title) &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(ratings, that.ratings);
    }
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }
}


