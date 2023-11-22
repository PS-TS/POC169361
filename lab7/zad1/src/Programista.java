import java.util.Objects;

class Programista extends Pracownik{
    private String jezykProgramowania;

    public Programista(String imie, String nazwisko, int placa, String jezykProgramowania) {
        super(imie,nazwisko,placa);
        this.jezykProgramowania = jezykProgramowania;
    }

    public String getJezykProgramowania() {
        return jezykProgramowania;
    }

    public void setJezykProgramowania(String jezykProgramowania) {
        this.jezykProgramowania = jezykProgramowania;
    }

    public String toString() {
        return "Programista: " +
                "imie: " + getImie() +
                ", nazwisko: " + getNazwisko() +
                ", placa: " + getPlaca() +
                ", jezykProgramowania: " + jezykProgramowania;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programista that = (Programista) o;
        return Objects.equals(jezykProgramowania, that.jezykProgramowania);
    }
}
