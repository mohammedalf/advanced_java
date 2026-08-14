package be.kdg.week1_herhaling.collections_demos.readonly_list;

import java.util.LinkedList;
import java.util.List;

public class Oplossing2 {
    static class Verzameling {

        private List<Integer> verzameling;

        public Verzameling() {
            verzameling = new LinkedList<>();

            verzameling.add(10);
            verzameling.add(20);
            verzameling.add(30);
        }
        public List<Integer> getVerzameling() {
            // Oplossing 2:
            // een NIEUWE lijst/kopie teruggeven
            return new LinkedList<>(verzameling);
        }
    }

    public static void main(String[] args) {
        Verzameling v = new Verzameling();

        // Dit is een KOPIE
        List<Integer> lijst = v.getVerzameling();

        System.out.println("Kopie:");
        System.out.println(lijst);
        // [10, 20, 30]

        // De kopie veranderen
        lijst.clear();

        System.out.println("Kopie na clear:");
        System.out.println(lijst);
        // []

        // Origineel controleren
        System.out.println("Originele verzameling:");
        System.out.println(v.getVerzameling());
        // [10, 20, 30]
    }


}
