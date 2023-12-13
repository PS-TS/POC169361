package interfaces.zad17;

public interface VATCalculator {
    public double vatRate = 0.23;
    public static double calculateWithVAT(double price){
        return price+(price*vatRate);
    }
}
