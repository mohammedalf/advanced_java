package be.kdg.week2_generics.basis_voorbeelden.bij_map;

public class Klant implements Comparable<Klant>{
    private int id;
    private String naam;

    public Klant(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }
    @Override
    public int compareTo(Klant o) {
        // Klanten worden gesorteerd volgens id
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return naam;
    }
}
