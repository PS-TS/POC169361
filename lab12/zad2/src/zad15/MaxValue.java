package zad15;

public class MaxValue {
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
