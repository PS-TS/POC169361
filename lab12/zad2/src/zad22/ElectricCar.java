package zad22;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
