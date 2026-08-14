package be.kdg.week1_herhaling.collections_demos.set_demos.hashset_equal_en_hashcode.demo_met_eq_hash;

import java.util.Objects;

public class Persoon {
    private String naam;
    private String email;

    public Persoon(String naam, String email) {
        this.naam = naam;
        this.email = email;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(email, persoon.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return naam + " - " + email;
    }
}
