package be.kdg.week5_Testen_Logging.testing;

import java.util.Objects;

public class Persoon {

    private String naam;


    public Persoon(String naam) {
        this.naam = naam;
    }


    @Override
    public boolean equals(Object o) {

        // zelfde object?
        if (this == o) {
            return true;
        }

        // null of ander type?
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Persoon persoon = (Persoon) o;

        // Persoon is uniek op basis van naam
        return Objects.equals(
                naam,
                persoon.naam
        );
    }


    @Override
    public int hashCode() {

        // zelfde attribuut gebruiken als equals
        return Objects.hash(naam);
    }
}
