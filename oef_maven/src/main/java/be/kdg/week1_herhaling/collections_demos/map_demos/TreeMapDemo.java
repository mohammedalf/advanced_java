package be.kdg.week1_herhaling.collections_demos.map_demos;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studenten = new TreeMap<>();

        studenten.put(3, "Sara");
        studenten.put(1, "Ali");
        studenten.put(2, "Nora");

        System.out.println(studenten);

        // value ophalen via key
        System.out.println(studenten.get(1));
    }
}
