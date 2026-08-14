package be.kdg.week2_generics.javadocs.documentatiecommentaar;

public class Vierkant {
    private double zijde;

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    /**
     * Maakt een nieuw Vierkant-object.
     *
     * @param zijde de zijde van het vierkant
     * @return een nieuw Vierkant-object
     */
    public static Vierkant maakVierkant(double zijde) {
        return new Vierkant(zijde);
    }
}
