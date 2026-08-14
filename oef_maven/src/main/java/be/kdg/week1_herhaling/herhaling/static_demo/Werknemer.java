package be.kdg.week1_herhaling.herhaling.static_demo;

public class Werknemer {
    private String naam;
    private static int aantal;

    public Werknemer(String naam) {
        this.naam = naam;
        aantal++;
    }

    public String getNaam() {
        return naam;
    }

    public static int getAantal() {
        return aantal;
    }
}
