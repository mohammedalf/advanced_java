package be.kdg.week2_generics.basis_voorbeelden.bij_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Generics_bij_Map {
    public static void main(String[] args) {
        Map<Klant, List<Bestelling>> myMap = new TreeMap<>();

        Klant klant1 = new Klant(2, "Mohammed");
        Klant klant2 = new Klant(1, "Ali");

        List<Bestelling> bestellingen1 = new ArrayList<>();
        bestellingen1.add(new Bestelling("Laptop"));
        bestellingen1.add(new Bestelling("Muis"));

        List<Bestelling> bestellingen2 = new ArrayList<>();
        bestellingen2.add(new Bestelling("Toetsenbord"));

        myMap.put(klant1, bestellingen1);
        myMap.put(klant2, bestellingen2);

        System.out.println(myMap);
    }
}
