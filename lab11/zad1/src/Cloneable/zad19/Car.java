package Cloneable.zad19;

class Car implements Cloneable {
    private String mark;
    private String model;
    private Engine engine;

    public Car(String mark, String model, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.engine = this.engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }

    public String toString() {
        return "Car{" +
                "make='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
