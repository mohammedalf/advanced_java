package be.kdg.week2_generics.vars;

import java.util.*;

public class VarDemo {
    public static void main(String[] args) {
        // 1. Gewone declaratie
        String foo1 = "Foo";

        // Met var:
        // Java kijkt naar "Foo"
        // en leidt af dat foo2 een String is.
        var foo2 = "Foo";

        System.out.println(foo1);
        System.out.println(foo2);


        // 2. var met een collection
        //
        // Java leidt af:
        // myList is een ArrayList<String>
        var myList = new ArrayList<String>();

        myList.add("Hello");
        myList.add("World");

        System.out.println(myList);


        // 3. var bij een langer generiek type
        //
        // Zonder var:
        Map<String, Double> scores1 = new TreeMap<>();

        scores1.put("Ali", 15.5);
        scores1.put("Sara", 18.0);


        // Met var:
        //
        // Java leidt af:
        // scores2 = TreeMap<String, Double>
        var scores2 = new TreeMap<String, Double>();

        scores2.put("Ali", 15.5);
        scores2.put("Sara", 18.0);


        // 4. var kan ook in een foreach
        for (var entry : scores2.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }


        // 5. BELANGRIJK verschil met interface-declaratie

        // Hier is het type van diamond1:
        // List<Integer>
        List<Integer> diamond1 = new ArrayList<>();

        // Daarom mag je later een andere List-implementatie gebruiken.
        diamond1 = new LinkedList<Integer>();   // OK


        // Hier leidt Java het concrete type af:
        // ArrayList<Integer>
        var diamond2 = new ArrayList<Integer>();

        // Dit zou NIET mogen:
        //
        // diamond2 = new LinkedList<Integer>();
        //
        // want diamond2 is een ArrayList<Integer>,
        // geen algemene List<Integer>.

    }
}
