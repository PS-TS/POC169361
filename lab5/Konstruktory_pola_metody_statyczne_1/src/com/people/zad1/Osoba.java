package com.people.zad1;

public class Osoba {
    private String imie;
    private static int licznik;

    public Osoba(String imie) {
        this.imie = imie;
        this.licznik++;
    }

    public int getLicznik() {
        return licznik;
    }
}
