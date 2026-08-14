package be.kdg.week2_generics.basis_voorbeelden.bij_map;

public class Bestelling {
    private String product;

    public Bestelling(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product;
    }
}
