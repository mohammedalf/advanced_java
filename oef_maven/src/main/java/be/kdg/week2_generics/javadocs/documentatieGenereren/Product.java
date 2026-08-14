package be.kdg.week2_generics.javadocs.documentatieGenereren;

public class Product {
    private String naam;
    private double prijs;

    /**
     * Maakt een nieuw Product-object.
     *
     * @param naam de naam van het product
     * @param prijs de prijs van het product
     */
    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Geeft de naam van het product terug.
     *
     * @return de naam van het product
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Geeft de prijs van het product terug.
     *
     * @return de prijs van het product
     */
    public double getPrijs() {
        return prijs;
    }
}
