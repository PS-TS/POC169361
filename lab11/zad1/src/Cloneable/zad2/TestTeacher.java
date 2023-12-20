package Cloneable.zad2;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher o = new Teacher("Pan X", "WIAI", 100);

        Teacher klon = o.clone();

        o.setExperience(150);

        System.out.println("Oryginał: " + o.getExperience());
        System.out.println("Kopia: " + klon.getExperience());
    }
}
