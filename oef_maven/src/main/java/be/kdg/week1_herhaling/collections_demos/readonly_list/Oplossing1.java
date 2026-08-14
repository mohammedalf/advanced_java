package be.kdg.week1_herhaling.collections_demos.readonly_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Oplossing1 {
    static class Verzameling {

        private List<Integer> verzameling;

        public Verzameling() {
            verzameling = new LinkedList<>();

            verzameling.add(10);
            verzameling.add(20);
            verzameling.add(30);
        }
        public List<Integer> getVerzameling() {
            // Oplossing 1:
            // read-only versie teruggeven
            return Collections.unmodifiableList(verzameling);
        }
    }

    public static void main(String[] args) {
        Verzameling v = new Verzameling();

        List<Integer> lijst = v.getVerzameling();

        System.out.println(lijst);
        // [10, 20, 30]

        // Lezen mag:
        System.out.println(lijst.get(0));
        // 10

        // Wijzigen mag NIET:
        // lijst.add(40);
        // lijst.clear();

        // Deze regels zouden een
        // UnsupportedOperationException geven.
    }


}
