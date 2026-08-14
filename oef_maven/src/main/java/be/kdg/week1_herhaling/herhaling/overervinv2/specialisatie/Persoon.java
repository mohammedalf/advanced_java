package be.kdg.week1_herhaling.herhaling.overervinv2.specialisatie;

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
        return "Persoon{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
