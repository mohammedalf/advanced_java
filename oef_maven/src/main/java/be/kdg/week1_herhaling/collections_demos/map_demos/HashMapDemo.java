package be.kdg.week1_herhaling.collections_demos.map_demos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studenten = new HashMap<>();
        studenten.put(3, "Rachid");
        studenten.put(1, "Ali");
        studenten.put(2, "Nora");

        System.out.println("studenten = " + studenten);

        // value ophalen via key
        System.out.println(studenten.get(1));
    }
}
