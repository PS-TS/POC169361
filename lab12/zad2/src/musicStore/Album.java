package musicStore;

public class Album {
    private String catalogueNumber;
    private String albumTitle;
    private String artistName;

    public Album(String catalogueNumber, String albumTitle, String artistName) {
        this.catalogueNumber = catalogueNumber;
        this.albumTitle = albumTitle;
        this.artistName = artistName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
