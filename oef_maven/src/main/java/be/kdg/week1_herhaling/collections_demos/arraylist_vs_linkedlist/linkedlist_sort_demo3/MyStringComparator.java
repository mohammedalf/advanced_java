package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist.linkedlist_sort_demo3;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        // Hoofdletters negeren
        // én omgekeerd sorteren
        return second.compareToIgnoreCase(first);
    }
}
