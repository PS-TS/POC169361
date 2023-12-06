package danezlozone;

public class RockAlbumTest {
        public static void main(String[] args) {
            MusicAlbum m1 = new MusicAlbum("Cos", "Grajek");
            m1.addRating(2.5);
            m1.addRating(5.0);
            m1.addRating(4.8);

            RockAlbum r1 = new RockAlbum("KamienneCos", "SkalnyGrajek", "Cos");
            r1.addRating(4.2);
            r1.addRating(3.8);

            System.out.println(m1);
            System.out.println(r1);
        }

}
