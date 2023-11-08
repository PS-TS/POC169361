package pl.cars.zad12;

public class Samochod {
    private String marka;
    private String model;
    private int rokProdukcji;
    private int przebieg;
    private String kolor;

    public Samochod(String marka, String model, int rokProdukcji, int przebieg, String kolor) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public String getKolor() {
        return kolor;
    }

    public void setSamochod(String marka,String model,int rokProdukcji,int przebieg,String kolor){
        this.marka=marka;
        this.model=model;
        this.rokProdukcji=rokProdukcji;
        this.przebieg=przebieg;
        this.kolor=kolor;
    }

    public void wyswietlInformacje(){
        System.out.println(getMarka());
        System.out.println(getModel());
        System.out.println(getRokProdukcji());
        System.out.println(getPrzebieg());
        System.out.println(getKolor());
    }
}
