package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_demo {
    public static void main(String[] args) {
        List<String> namen = new LinkedList<>();

        // Elementen toevoegen
        namen.add("Rachid");
        namen.add("Mohammed");

        // Vooraan toevoegen
        namen.addFirst("Ali");

        // Achteraan toevoegen
        namen.addLast("Youssef");

        System.out.println(namen);
        // [Ali, Sara, Mohammed, Youssef]


        // Eerste element ophalen
        System.out.println(namen.getFirst());
        // Ali


        // Laatste element ophalen
        System.out.println(namen.getLast());
        // Youssef


        // Eerste element verwijderen
        namen.removeFirst();

        // Laatste element verwijderen
        namen.removeLast();

        System.out.println(namen);
        // [Sara, Mohammed]
    }
}
