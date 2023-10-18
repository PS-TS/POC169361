import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for(int i =0;i<10;i++){
            tablica[i]=generateRandomInt()%5;
        }
        int[] tablica2 = new int[10];
        tablica2 = reverseArray(tablica);
        System.out.println("Metody");
        System.out.println("Zadanie 1: "+sumaszeregowa(20));
        System.out.println("Zadanie 10: "+samebinarnejedynki(63));
        System.out.println("Generowanie liczb pseudolosowych");
        System.out.println("Zadanie 1: "+generateRandomInt());
        System.out.println("Zadanie 3: "+generateRandomIntInRange(4,10));
        System.out.println("Tablice:");
        System.out.printf("Zadanie 1: "); tablica1();
        System.out.println("\nZadanie 10: "+ tablica2());
        System.out.printf("Zadanie 15: ");
        for (int i:tablica2) {
            System.out.printf(i+" ");
        }
        System.out.println("\nZadanie 17: "+countZeros(tablica2));
        tablica2=sortArray(tablica2);
        System.out.printf("Zadanie 24: ");
        for (int i:tablica2) {
            System.out.printf(i+" ");
        }
        System.out.println("\nZadanie 25: "+checkEquality(tablica,tablica2));
        System.out.println("Tablica 1");
        for (int i:tablica) {
            System.out.printf(i+" ");
        }
        System.out.println("\nTablica 2");
        for (int i:tablica2) {
            System.out.printf(i+" ");
        }
    }
    public static int sumaszeregowa(int n){
        int suma = 0;
        for(int i = 1;i<=n;i++){
            if(i%2==1)
                suma+=i;
            else
                suma-=i;
        }
        return suma;
    }
    public static int samebinarnejedynki(int n){
        while(n!=0) {
            if(n%2==0){
                return 0;
            }
            n/=2;
        }
        return 1;
    }
    public static int generateRandomInt(){
        Random rand = new Random();
        return rand.nextInt();
    }
    public static int generateRandomIntInRange(int a, int b){
        Random rand = new Random();
        int zakres;
        if(a<b){
            zakres=b-a+1;
            return rand.nextInt(zakres)+a;
        }
        zakres=a-b+1;
        return rand.nextInt(zakres)+a;
    }
    public static void tablica1(){
        int[] tab = new int[10];
        for(int i =0;i<10;i++){
            tab[i]=i+1;
        }
        for(int i =0;i<10;i++){
            System.out.printf(tab[9-i]+" ");
        }
    }
    public static int tablica2(){
        int kwadrat=0;
        int[] tab = new int[30];
        for(int i =0;i<30;i++){
            tab[i]=i+1;
        }
        for(int i =0;i<30;i++){
            if(Math.round(Math.sqrt(tab[i]))*Math.round(Math.sqrt(tab[i]))==tab[i])
                kwadrat++;
        }
        return kwadrat;
    }
    public static int[] reverseArray(int[] tab){
        int j=0;
        for(int i: tab){
            j++;
        }
        int[] tab2=new int[j];
        j--;
        for(int k=j;k>=0;k--)
            tab2[k]=tab[j-k];
    return tab2;
    }
    public static int countZeros(int[] tab){
        int wynik=0;
        for(int i =0;i<tab.length;i++){
            if(tab[i]==0)
                wynik++;
        }
        return wynik;
    }
    public static int[] sortArray(int[] tab){
        Arrays.sort(tab);
        return tab;
    }
    public static boolean checkEquality(int[] tab1, int[] tab2){
        boolean wynik = Arrays.equals(tab1,tab2);
        return wynik;
    }
}