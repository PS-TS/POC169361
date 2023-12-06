package rekordy;

public class RekordyTest {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Władca pierścieni", "Tolkien", 30.00, 1955);

        System.out.println(book1);
        //////////////////////////////////////////////////////////////////
        Address address1 = new Address("31 lutego", "987", "123456", "Czarnobyl");
        Person person1 = new Person("Jan", "Jeleń", address1);

        System.out.println(person1);
        ///////////////////////////////////////////////////////////////////
        Car car1 = new Car("Fatalna Imitacja Auta Turystycznego", "126p", 4);

        System.out.println(car1);
        System.out.println("Koszt podróży: " + car1.fuelCost(6.5, 500));
        ////////////////////////////////////////////////////////////////////
        BankAccount account1 = new BankAccount("1234567890");

        System.out.println(account1);
    }
}

