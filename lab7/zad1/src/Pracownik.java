import java.util.Objects;

class Pracownik {
    private String imie;
    private String nazwisko;
    private int placa;

    public Pracownik(String imie, String nazwisko, int placa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getPlaca() {
        return placa;
    }
    public void setPracownik(String imie, String nazwisko, int placa){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.placa=placa;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return placa == pracownik.placa && Objects.equals(imie, pracownik.imie) && Objects.equals(nazwisko, pracownik.nazwisko);
    }
    public String toString() {
        return "Pracownik: " +
                "imie: " + imie +
                ", nazwisko: " + nazwisko +
                ", placa: " + placa;
    }
}
