package be.kdg.week1_herhaling.herhaling.static_demo;

public class DemoStatic {
    public static void main(String[] args) {
        Werknemer wn1 = new Werknemer("Fred");
        Werknemer wn2 = new Werknemer("Annit");

        System.out.printf("Werknemer wn1 heet: %s\n", wn1.getNaam());
        System.out.printf("Werknemer wn2 heet: %s\n", wn2.getNaam());

        System.out.println("Aantal werknemers: " + Werknemer.getAantal());
    }
}
