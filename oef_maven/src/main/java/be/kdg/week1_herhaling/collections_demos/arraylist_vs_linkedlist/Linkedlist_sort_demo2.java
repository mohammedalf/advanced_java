package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist;

import java.util.*;

public class Linkedlist_sort_demo2 {
    public static final String[] woorden = {
            "Een", "twee", "Drie", "vier", "Vijf",
            "zes", "Zeven", "acht", "Negen", "tien"
    };

    public static void main(String[] args) {
        // Maak een lijst van de array
        List<String> woordenlijst =
                new LinkedList<>(Arrays.asList(woorden));

        // Originele lijst afdrukken
        System.out.println(woordenlijst);

        // Kopie maken zodat de originele lijst niet verandert
        List<String> sortedList =
                new LinkedList<>(woordenlijst);

        // Sorteren ZONDER rekening te houden met hoofdletters
        Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);

        // Gesorteerde lijst afdrukken
        System.out.println(sortedList);
    }
}
