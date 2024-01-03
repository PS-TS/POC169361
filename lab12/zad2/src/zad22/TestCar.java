package zad22;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("X");
        Car c2 = new Car("D");
        ElectricCar ec = new ElectricCar("EX", 150);

        System.out.println(Porownanie.compareObjects(c1, c2));
        System.out.println(Porownanie.compareObjects(c1, ec));
    }
}
