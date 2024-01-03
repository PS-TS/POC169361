package musicStore;

import java.util.Arrays;

public class TestAlbum {
    public static void main(String[] args) {
        Album[] albums = {
                new Album("1", "A", "X"),
                new Album("2", "B", "X"),
                new Album("3", "C", "X"),
                new Album("4", "D", "B"),
                new Album("5", "D", "A")
        };
        Arrays.sort(albums, new AlbumTitleComparator().thenComparing(new ArtistNameComparator()));
    }

}
