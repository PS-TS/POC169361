package pl.edu.uwm.a1;

abstract class GrafikaKomputerowa {
    protected int szerokosc;
    protected int wysokosc;
    protected String nazwaPliku;

    public GrafikaKomputerowa()
    {

    }
    public abstract void wczytajPlik();
    public abstract void zapiszPlik();
}