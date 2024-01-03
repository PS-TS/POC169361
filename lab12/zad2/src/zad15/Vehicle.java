package zad15;

class Vehicle implements Comparable<Vehicle> {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int compareTo(Vehicle other) {
        return Integer.compare(this.speed, other.speed);
    }
}
