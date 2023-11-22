import java.util.Objects;

class Tester extends Pracownik {
    private String typTestowania;

    public Tester(String imie, String nazwisko, int placa, String typTestowania) {
        super(imie, nazwisko, placa);
        this.typTestowania = typTestowania;
    }

    public String getTypTestowania() {
        return typTestowania;
    }

    public void setTypTestowania(String typTestowania) {
        this.typTestowania = typTestowania;
    }

    public String toString() {
        return "Tester: " +
                "imie: " + getImie() +
                ", nazwisko: " + getNazwisko() +
                ", placa: " + getPlaca() +
                ", typTestowania: " + typTestowania;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tester tester = (Tester) o;
        return Objects.equals(typTestowania, tester.typTestowania);
    }
}
