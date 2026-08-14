package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist.linkedlist_sort_demo3;

import java.util.*;

public class Linkedlist_sort_demo3 {
    public static final String[] woorden = {
            "Een", "twee", "Drie", "vier", "Vijf",
            "zes", "Zeven", "acht", "Negen", "tien"
    };

    public static void main(String[] args) {
        // Maak een LinkedList van de array
        List<String> woordenlijst =
                new LinkedList<>(Arrays.asList(woorden));

        // Originele lijst
        System.out.println(woordenlijst);


        // Kopie maken
        List<String> sortedList =
                new LinkedList<>(woordenlijst);

        // Sorteren met onze EIGEN Comparator
        Collections.sort(sortedList , new MyStringComparator());

        // Gesorteerde lijst
        System.out.println(sortedList);
    }
}
