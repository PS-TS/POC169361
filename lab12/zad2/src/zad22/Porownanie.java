package zad22;

public class Porownanie {
    public static <T extends Car> boolean compareObjects(T object1, T object2) {
        return object1.getClass().equals(object2.getClass());
    }
}
