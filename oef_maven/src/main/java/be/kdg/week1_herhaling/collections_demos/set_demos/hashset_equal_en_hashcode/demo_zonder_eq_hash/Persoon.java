package be.kdg.week1_herhaling.collections_demos.set_demos.hashset_equal_en_hashcode.demo_zonder_eq_hash;

import java.util.HashSet;
import java.util.Set;

public class Persoon {
    private String naam;
    private String email;

    public Persoon(String naam, String email) {
        this.naam = naam;
        this.email = email;
    }

    @Override
    public String toString() {
        return naam + " - " + email;
    }


}
