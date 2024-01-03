package zad15;

public class TestMax {
    public static void main(String[] args) {

        Integer[] tabi = {3, 7, 1, 9, 4};
        Double[] tabd = {1.5, 2.6, 3.7, 0.3};
        String[] tabs = {"XXX", "YYY", "ZZZ"};

        System.out.println("Int: " + MaxValue.maxValue(tabi));
        System.out.println("Double: " + MaxValue.maxValue(tabd));
        System.out.println("String: " + MaxValue.maxValue(tabs));

        Vehicle[] vehicles = {
                new Vehicle("A", 100),
                new Vehicle("B", 200),
                new Vehicle("C", 50)
        };

        System.out.println("Największa prędkość pojazdu: " + MaxValue.maxValue(vehicles).getSpeed());
    }
}
