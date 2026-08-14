package be.kdg.week1_herhaling.herhaling.inkapseling;

public class Vat {
    private int inhoud;
    private int capaciteit;

    public Vat() {
    }

    public int getInhoud() {
        return inhoud;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        if (capaciteit>0)
            this.capaciteit = capaciteit;
    }
}
