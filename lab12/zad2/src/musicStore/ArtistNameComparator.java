package musicStore;

import java.util.Comparator;
public class ArtistNameComparator implements Comparator<Album>{
    public int compare(Album album1, Album album2) {
        return album1.getArtistName().compareTo(album2.getArtistName());
    }
}
