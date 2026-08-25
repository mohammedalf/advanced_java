package be.kdg.week10_Treads.synchronization.immutable_klasse;

public final class DwergPlaneet {

    private final int diameter;
    private final String naam;
    private final Ontdekker ontdekker;

    public DwergPlaneet(int diameter, String naam, Ontdekker ontdekker) {
        this.diameter = diameter;
        this.naam = naam;

        // Ontdekker is mutable:
        // daarom maken we een kopie
        this.ontdekker =
                new Ontdekker(ontdekker.getNaamOntdekker());
    }

    public int getDiameter() {
        return diameter;
    }

    public String getNaam() {
        return naam;
    }

    public Ontdekker getOntdekker() {
        // Geen interne referentie teruggeven,
        // maar opnieuw een kopie
        return new Ontdekker(
                ontdekker.getNaamOntdekker()
        );
    }
}
