package be.kdg.week1_herhaling.collections_demos.set_demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_mothods {
    public static void main(String[] args) {
        Set<String> namen = new HashSet<>();


        // 1. add()
        // Element toevoegen
        namen.add("Ali");
        namen.add("Sara");
        namen.add("Mohammed");

        System.out.println("Set:");
        System.out.println(namen);


        // 2. size()
        // Aantal elementen
        System.out.println("Aantal: " + namen.size());


        // 3. isEmpty()
        // Is de Set leeg?
        System.out.println("Leeg? " + namen.isEmpty());


        // 4. contains()
        // Controleren of een element aanwezig is
        System.out.println("Bevat Sara? " + namen.contains("Sara"));


        // 5. remove()
        // Element verwijderen
        namen.remove("Sara");

        System.out.println("Na verwijderen Sara:");
        System.out.println(namen);


        // 6. iterator()
        // Door de Set lopen
        Iterator<String> iterator = namen.iterator();

        System.out.println("Met Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ------------------------------------------------
        // Een tweede Set om bulk-methoden te testen
        // ------------------------------------------------

        Set<String> andereNamen =
                new HashSet<>(Arrays.asList("Ali", "Youssef"));


        // 7. containsAll()
        // Controleert of ALLE elementen aanwezig zijn
        System.out.println(
                "Bevat alles uit andereNamen? "
                        + namen.containsAll(andereNamen)
        );


        // 8. addAll()
        // Alle elementen van andere Set toevoegen
        namen.addAll(andereNamen);

        System.out.println("Na addAll:");
        System.out.println(namen);


        // 9. removeAll()
        // Alle overeenkomende elementen verwijderen

        Set<String> verwijderen =
                new HashSet<>(Arrays.asList("Ali", "Mohammed"));

        namen.removeAll(verwijderen);

        System.out.println("Na removeAll:");
        System.out.println(namen);


        // We vullen de Set opnieuw voor retainAll()
        namen.clear();

        namen.add("Ali");
        namen.add("Sara");
        namen.add("Mohammed");
        namen.add("Youssef");


        // 10. retainAll()
        // Alleen elementen behouden
        // die ook in deze andere Set zitten

        Set<String> behouden =
                new HashSet<>(Arrays.asList("Sara", "Youssef"));

        namen.retainAll(behouden);

        System.out.println("Na retainAll:");
        System.out.println(namen);
        // Sara en Youssef blijven over


        // 11. toArray()
        // Set omzetten naar een array

        Object[] array = namen.toArray();

        System.out.println("Array:");

        for (Object naam : array) {
            System.out.println(naam);
        }


        // 12. clear()
        // Alles verwijderen

        namen.clear();

        System.out.println("Na clear:");
        System.out.println(namen);

        System.out.println("Leeg? " + namen.isEmpty());
    }
}
