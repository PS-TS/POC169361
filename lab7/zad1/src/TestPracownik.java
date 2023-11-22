public class TestPracownik {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 5000);
        Programista programista = new Programista("Janusz", "Kowalski", 4000, "java");
        Tester tester = new Tester("Janek", "Kowalski", 3000, "jakis");

        System.out.println(pracownik.toString());
        System.out.println(programista.toString());
        System.out.println(tester.toString());
    }
}
