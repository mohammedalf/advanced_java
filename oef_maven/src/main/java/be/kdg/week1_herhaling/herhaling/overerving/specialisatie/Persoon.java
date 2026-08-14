package be.kdg.week1_herhaling.herhaling.overerving.specialisatie;

public class Persoon {
    private String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "persoon{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
