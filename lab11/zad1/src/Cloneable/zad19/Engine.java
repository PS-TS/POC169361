package Cloneable.zad19;

class Engine implements Cloneable {
    private int power;
    private String type;
    private String serialNumber;

    public Engine(int power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }

    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
