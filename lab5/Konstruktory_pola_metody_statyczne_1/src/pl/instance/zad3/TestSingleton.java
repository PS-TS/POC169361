package pl.instance.zad3;

public class TestSingleton {
    public static void main(String[] args){
        Singleton i1 = Singleton.getInstance();
        System.out.println(i1);
        Singleton i2 = Singleton.getInstance();
        System.out.println(i2);
        Singleton i3 = Singleton.getInstance();
        System.out.println(i3);
    }
}
