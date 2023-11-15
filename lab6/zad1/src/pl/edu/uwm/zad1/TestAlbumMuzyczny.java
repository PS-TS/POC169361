package pl.edu.uwm.zad1;

public class TestAlbumMuzyczny {
    public static void main(String[] args) {
        AlbumMuzyczny album1 = new AlbumMuzyczny();
        album1.dodajOcene(4.5);
        album1.dodajOcene(4.6);
        album1.dodajOcene(4.7);
        album1.usunOcene(0);
        System.out.println(album1);

        AlbumRockowy albumRockowy1 = new AlbumRockowy();
        albumRockowy1.dodajOcene(4.0);
        albumRockowy1.setAlbumRockowy("Classic Rock","1945","Sabaton");
        System.out.println(albumRockowy1);
    }
}
