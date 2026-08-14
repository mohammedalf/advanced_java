package be.kdg.week1_herhaling.herhaling.interface_demo;

public class Getal implements Deelbaar {
    private int getal;

    public Getal(int getal) {
        this.getal = getal;
    }

    @Override
    public void deel() {
        getal /= FACTOR;
    }

    @Override
    public String toString() {
        return "Getal{" +
                "getal=" + getal +
                '}';
    }
}
