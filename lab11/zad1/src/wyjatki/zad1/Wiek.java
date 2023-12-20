package wyjatki.zad1;

public class Wiek {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Nieletni");
        }
        System.out.println("Ok: " + age);
    }
}