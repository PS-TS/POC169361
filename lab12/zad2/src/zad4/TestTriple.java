package zad4;

public class TestTriple {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("XXX", 1500, 3.14);

        String firstElement = triple.getFirst();
        Integer secondElement = triple.getSecond();
        Double thirdElement = triple.getThird();

        System.out.println("Pierwszy: " + firstElement);
        System.out.println("Drugi: " + secondElement);
        System.out.println("Trzeci: " + thirdElement);
    }
}
