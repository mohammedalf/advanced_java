package be.kdg.week1_herhaling.collections_demos.map_demos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map_algoritmen {
    public static void main(String[] args) {
        // We maken een Map:
        // key   = studentnummer
        // value = naam
        Map<Integer, String> studenten = new HashMap<>();


        // --------------------------------------------------
        // 1. put(key, value)
        // Voegt een key-value paar toe
        // --------------------------------------------------

        studenten.put(101, "Ali");
        studenten.put(102, "Sara");
        studenten.put(103, "Mohammed");

        System.out.println(studenten);


        // --------------------------------------------------
        // 2. get(key)
        // Haalt de value op die bij een key hoort
        // --------------------------------------------------

        String naam = studenten.get(102);

        System.out.println("Student 102: " + naam);
        // Sara


        // --------------------------------------------------
        // 3. remove(key)
        // Verwijdert een entry op basis van de key
        // --------------------------------------------------

        studenten.remove(103);

        System.out.println("Na verwijderen:");
        System.out.println(studenten);


        // --------------------------------------------------
        // 4. containsKey(key)
        // Controleert of een bepaalde key bestaat
        // --------------------------------------------------

        boolean heeftKey = studenten.containsKey(101);

        System.out.println("Bestaat key 101? " + heeftKey);


        // --------------------------------------------------
        // 5. containsValue(value)
        // Controleert of een bepaalde value bestaat
        // --------------------------------------------------

        boolean heeftNaam = studenten.containsValue("Sara");

        System.out.println("Bevat Sara? " + heeftNaam);


        // --------------------------------------------------
        // 6. size()
        // Geeft het aantal entries terug
        // --------------------------------------------------

        System.out.println("Aantal studenten: " + studenten.size());


        // --------------------------------------------------
        // 7. isEmpty()
        // Controleert of de Map leeg is
        // --------------------------------------------------

        System.out.println("Is de Map leeg? " + studenten.isEmpty());


        // --------------------------------------------------
        // 8. putAll(map)
        // Voegt alle entries van een andere Map toe
        // --------------------------------------------------

        Map<Integer, String> extraStudenten = new HashMap<>();

        extraStudenten.put(104, "Youssef");
        extraStudenten.put(105, "Nora");

        studenten.putAll(extraStudenten);

        System.out.println("Na putAll:");
        System.out.println(studenten);


        // --------------------------------------------------
        // 9. keySet()
        // Geeft alle KEYS terug als een Set
        // --------------------------------------------------

        Set<Integer> keys = studenten.keySet();

        System.out.println("Alle keys:");

        for (Integer key : keys) {
            System.out.println(key);
        }


        // --------------------------------------------------
        // 10. values()
        // Geeft alle VALUES terug als een Collection
        // --------------------------------------------------

        Collection<String> values = studenten.values();

        System.out.println("Alle values:");

        for (String value : values) {
            System.out.println(value);
        }


        // --------------------------------------------------
        // 11. entrySet()
        // Geeft alle key-value paren terug
        // --------------------------------------------------

        Set<Map.Entry<Integer, String>> entries =
                studenten.entrySet();

        System.out.println("Alle entries:");

        for (Map.Entry<Integer, String> entry : entries) {

            System.out.println(
                    "Key: " + entry.getKey()
                            + " - Value: " + entry.getValue()
            );
        }


        // --------------------------------------------------
        // 12. clear()
        // Verwijdert ALLES uit de Map
        // --------------------------------------------------

        studenten.clear();

        System.out.println("Na clear:");
        System.out.println(studenten);

        System.out.println("Is leeg? " + studenten.isEmpty());
    }
}
