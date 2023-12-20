package wyjatki.zad1;

public class TestWiek {
    public static void main(String[] args) {
        try {
            Wiek.checkAge(25);
            Wiek.checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
