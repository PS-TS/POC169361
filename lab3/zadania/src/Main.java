import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Zad 2: "+suma());
        ArrayList<Double> lista1 = new ArrayList<Double>();
        for(int i=0;i<10;i++)
            lista1.add((double)i/2);
        System.out.println("Zad 5: "+averange(lista1));

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        for(int i=0;i<5;i++) {
            lista2.add(i);
            lista3.add(i+5);
        }
        System.out.println("Zad 14: "+mergeArrays(lista2,lista3));
        ////////////////////////////////////////////////////////////////
        System.out.println("Napisy");
        System.out.println("Zadanie 4: "+zamiana("Proba"));
        System.out.println("Zadanie 7: "+sprawdzenie("kajak"));
        System.out.println("Zadanie 19: "+countOccurrences("Stol z powylamywanymi nogami",'m'));
    }
    public static double suma(){
        double wynik=0;
        ArrayList<Double> lista = new ArrayList<Double>();
        for(int i=0;i<10;i++)
            lista.add((double)i/2);
        for(int i=0;i<lista.size();i++){
            wynik+=lista.get(i);
        }
        return wynik;
    }
    public static double averange(ArrayList<Double> lista){
        if (lista.isEmpty())
            return 0;
        double srednia=0;
        for(int i=0;i<lista.size();i++){
            srednia+=lista.get(i);
        }
        srednia/=lista.size();
        return srednia;
    }
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> l1,ArrayList<Integer> l2){
        ArrayList<Integer> nowa = new ArrayList<Integer>();
        for(int i=0;i<l1.size();i++){
            nowa.add(l1.get(i));
        }
        for(int i=0;i<l2.size();i++){
            nowa.add(l2.get(i));
        }
        return nowa;
    }
    public static String zamiana(String tekst){
        char p = tekst.charAt(0);
        char o = tekst.charAt(tekst.length()-1);
        return o + tekst.substring(1,tekst.length()-1) + p;
    }
    public static String sprawdzenie(String tekst){
        char p=tekst.charAt(0);
        char o=tekst.charAt(tekst.length()-1);
        if(p==o)
            return "Tak";
        return "Nie";
    }
    public static int countOccurrences(String tekst, char znak){
        int suma=0;
        for (int i =0;i<tekst.length();i++)
            if(znak==tekst.charAt(i))
                suma++;
        return suma;
    }
}