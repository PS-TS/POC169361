package zad1i2;

public class Box<T> {
    private T t;
    public void set(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
    public static <T> boolean isEqual(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }

        if (obj1 == null || obj2 == null) {
            return false;
        }

        return obj1.equals(obj2);
    }
}
