package be.kdg.week1_herhaling.collections_demos.set_demos.hashset_equal_en_hashcode.demo_met_eq_hash;

import java.util.HashSet;
import java.util.Set;

public class DemoMetEqualsHashCode {
    public static void main(String[] args) {
        Set<Persoon> personen = new HashSet<>();

        Persoon p1 = new Persoon("Mohammed", "m@gmail.com");
        Persoon p2 = new Persoon("Mohammed", "m@gmail.com");
        Persoon p3 = new Persoon("Rachid", "s@gmail.com");

        personen.add(p1);
        personen.add(p2);   // zelfde email → niet opnieuw toegevoegd
        personen.add(p3);

        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }

        System.out.println("Aantal: " + personen.size());
        // 2
    }
}
