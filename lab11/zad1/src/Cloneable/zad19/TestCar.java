package Cloneable.zad19;

public class TestCar {
    public static void main(String[] args) {
        Engine s = new Engine(30, "Benzyna", "1234");

        Car c = new Car("Fiat", "Camry126p", s);
        Car cc = c.clone();

        s.setPower(60);
        c.setModel("127p");

        System.out.println("Original Car: " + c);
        System.out.println("Cloned Car: " + cc);
    }
}
