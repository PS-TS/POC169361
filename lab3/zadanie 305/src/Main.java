// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(maxZDwoch(10,5));
        System.out.println(maxZDwoch(10,15));
    }

    public static int maxZDwoch(int a, int b){
        if(a>b)
            return a;
        return b;
    }
}