package be.kdg.week1_herhaling.collections_demos.map_demos.eigen_object;

import java.util.Objects;

public class Persoon {
    private String email;

    public Persoon(String email) {
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
        return "Persoon{" +
                "email='" + email + '\'' +
                '}';
    }
}
