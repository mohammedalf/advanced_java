package be.kdg.week1_herhaling.collections_demos.set_demos.hashset_equal_en_hashcode.demo_zonder_eq_hash;

import java.util.HashSet;
import java.util.Set;

public class DemoZonderEqualsHashCode {

    public static void main(String[] args) {

        Set<Persoon> personen = new HashSet<>();

        Persoon p1 = new Persoon("Mohammed", "m@gmail.com");
        Persoon p2 = new Persoon("Mohammed", "m@gmail.com");

        personen.add(p1);
        personen.add(p2);

        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }

        System.out.println("Aantal: " + personen.size());
    }
}
