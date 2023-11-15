package pl.edu.uwm.vehicles;

public class Car {
    private String model;
    private int yearOfManufacture;
    private double mileage;

    public Car(String model, int yearOfManufacture, double mileage) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
    }

    public String toString() {
        return "Samochód. " + "Model: " + model + ", rok produkcji: " + yearOfManufacture + ", przebieg: " + mileage + " km.";
    }
}
