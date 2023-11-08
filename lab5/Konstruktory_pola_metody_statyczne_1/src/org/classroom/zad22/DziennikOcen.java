package org.classroom.zad22;

import java.util.ArrayList;

public class DziennikOcen {
    private String imie;
    private String nazwisko;
    private ArrayList<Integer> oceny = new ArrayList<Integer>();

    public DziennikOcen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Integer> getOceny() {
        return oceny;
    }

    public void setImie(String imie, String nazwisko, ArrayList<Integer> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }
    public void dodajOcene(int ocena){
        this.oceny.add(ocena);
    }
    public void usunOcene(int indeks){
        this.oceny.remove(indeks);
    }
    public void sredniaOcen(){
        int srednia=0;
        for(int i = 0;i<this.oceny.size();i++){
            srednia+=oceny.get(i);
        }
        srednia=srednia/this.oceny.size();
        // dziala System.out.println(srednia);
    }
}
