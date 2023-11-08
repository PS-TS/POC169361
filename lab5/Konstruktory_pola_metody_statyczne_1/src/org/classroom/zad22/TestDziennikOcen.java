package org.classroom.zad22;

public class TestDziennikOcen {
    public static void main(String[] args){
        DziennikOcen dziennik = new DziennikOcen("P","S");
        dziennik.dodajOcene(3);
        dziennik.dodajOcene(5);
        dziennik.sredniaOcen();
    }
}
