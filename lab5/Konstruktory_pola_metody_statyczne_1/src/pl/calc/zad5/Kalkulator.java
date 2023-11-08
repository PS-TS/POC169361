package pl.calc.zad5;

public class Kalkulator {
    public static double dodawanie(int l1, int l2){
        return l1+l2;
    }
    public static double odejmowanie(int l1, int l2){
        return l1-l2;
    }
    public static double mnozenie(int l1, int l2){
        return l1*l2;
    }
    public static double dzielenie(int l1, int l2){
        if(l2!=0)
            return l1/l2;
        return 0;
    }

}
