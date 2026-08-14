package be.kdg.week2_generics.generieke_interface;

public class Klant implements Comparable<Klant>{
    private int id;

    public Klant(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Klant o) {
        return this.id - o.id;
    }


    // Demo
    public static void main(String[] args) {

        Klant klant1 = new Klant(5);
        Klant klant2 = new Klant(2);

        if (klant1.compareTo(klant2) < 0) {
            System.out.println("klant1 komt voor klant2");
        } else if (klant1.compareTo(klant2) > 0) {
            System.out.println("klant1 komt na klant2");
        } else {
            System.out.println("Ze zijn gelijk");
        }
    }
}
