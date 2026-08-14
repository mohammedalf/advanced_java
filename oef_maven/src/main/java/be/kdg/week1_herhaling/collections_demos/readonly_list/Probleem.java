package be.kdg.week1_herhaling.collections_demos.readonly_list;

import java.util.LinkedList;
import java.util.List;

public class Probleem {
    static class Verzameling {

        private List<Integer> verzameling;

        public Verzameling() {
            verzameling = new LinkedList<>();

            verzameling.add(10);
            verzameling.add(20);
            verzameling.add(30);
        }

        public List<Integer> getVerzameling() {
            // GEVAARLIJK:
            // we geven de echte interne lijst terug
            return verzameling;
        }
    }
    public static void main(String[] args) {
        Verzameling v = new Verzameling();

        // We krijgen de echte interne lijst
        List<Integer> lijst = v.getVerzameling();

        System.out.println("Voor wijziging:");
        System.out.println(lijst);
        // [10, 20, 30]

        // Buiten de klasse veranderen we de lijst
        lijst.clear();

        System.out.println("Na clear:");
        System.out.println(lijst);
        // []

        // Ook de lijst IN Verzameling is nu leeg!
        System.out.println("Interne verzameling:");
        System.out.println(v.getVerzameling());
        // []
    }
}
