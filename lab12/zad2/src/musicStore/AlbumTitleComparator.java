package musicStore;

import java.util.Comparator;

public class AlbumTitleComparator implements Comparator<Album> {

    public int compare(Album album1, Album album2) {
        return album1.getAlbumTitle().compareTo(album2.getAlbumTitle());
    }
}
