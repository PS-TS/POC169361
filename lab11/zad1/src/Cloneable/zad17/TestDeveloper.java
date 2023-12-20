package Cloneable.zad17;

public class TestDeveloper {
    public static void main(String[] args) {
        Developer d = new Developer("A", 10, 10000);

        Developer c = d.clone();
        d.setSalary(15000.0);
        System.out.println("Original Developer: " + d);
        System.out.println("Cloned Developer: " + c);

        SeniorDeveloper sd = new SeniorDeveloper("A", 10, 10000,1000);

        SeniorDeveloper sc = sd.clone();
        sd.setSalary(20000.0);
        System.out.println("Original Developer: " + sd);
        System.out.println("Cloned Developer: " + sc);
    }
}
