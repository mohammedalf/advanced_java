package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_sort_demo1 {
    public static final String[ ] woorden = {"Een", "twee", "Drie", "vier", "Vijf", "zes", "Zeven", "acht", "Negen", "tien"};

    public static void main(String[] args) {
        List<String> woordenlijst =  new LinkedList<>(Arrays.asList(woorden));
        System.out.println(woordenlijst);

        List<String> sortedList = new LinkedList<>(woordenlijst);

        // De kopie sorteren
        // String gebruikt hiervoor zijn compareTo()-methode
        Collections.sort(sortedList);

        // Gesorteerde lijst afdrukken
        System.out.println(sortedList);
    }
}
