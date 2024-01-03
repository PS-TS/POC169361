package zad1i2;

public class TestBox {
    public static void main(String[] args) {

        Box<String> stringBox1 = new Box<>();
        stringBox1.set("X");
        System.out.println(stringBox1.get());

        System.out.println(Box.isEqual("Test","Test"));
        System.out.println(Box.isEqual("Test","TesT"));
        System.out.println(Box.isEqual(123,123));
        System.out.println(Box.isEqual(123,124));

    }
}
