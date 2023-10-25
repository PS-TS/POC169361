import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    System.out.println("Zadanie 1:");
        Dog dog = new Dog();
        dog.Bark();
        BankAccount account = new BankAccount();
    System.out.println("Zadanie 3:");
        System.out.println(account.balance);
        account.deposit(100);
        System.out.println(account.balance);
        account.withdraw(50);
        System.out.println(account.balance);
    System.out.println("Zadanie 5:");
        Time time = new Time();
        time.hours=10;
        time.minutes=7;
        Time time2 = new Time();
        time2.hours=23;
        time2.minutes=59;
        time = time.addTime(time2);
        System.out.println(time.hours + ":" + time.minutes);
    System.out.println("Zadanie 6:");
        Car car = new Car();
        car=null;
        System.out.println(/*car.brand*/"Exception in thread \"main\" java.lang.NullPointerException: Cannot read field \"brand\" because \"car\" is null\n" +
                "\tat Main.main(Main.java:26)");
        if(car!=null)
            System.out.println(car.brand);
        else
            System.out.println("Obiekt zawiera null");
    System.out.println("Zadanie 9:");
        ArrayList<Osoba> nowa = new ArrayList<Osoba>();
        //nowa.imie;
        //nowa[0].imie;
        System.out.println("java: not a statement");
    System.out.println("Zadanie 11:");
        Kot kot = new Kot();
        kot = kot.stworzKota("Mruczek");
        System.out.println(kot.imie);
        System.out.println("Jeśli imie jest puste, obiekt również będzie pusty i nieczytelny");
    System.out.println("Zadanie aktywność:");
        House dom=new House();
        dom.setAddress("Javowa");
        System.out.println("Długość adresu: "+dom.getNumber());
    }
}
