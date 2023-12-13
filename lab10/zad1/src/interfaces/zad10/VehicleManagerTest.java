package interfaces.zad10;

public class VehicleManagerTest {
    public static void main(String[] args){
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        System.out.println(c.getFuelLevel());
        System.out.println(m.getFuelLevel());
        System.out.println(c.startEngine());
        System.out.println(m.startEngine());
    }
}
