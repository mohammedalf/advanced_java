package be.kdg.week1_herhaling.collections_demos.map_demos.eigen_object;

import java.util.HashMap;
import java.util.Map;

public class HashMap_met_eigen_object {
    public static void main(String[] args) {
        Map<Persoon, String> map = new HashMap<>();

        Persoon p1 = new Persoon("ali@gmail.com");
        Persoon p2 = new Persoon("ali@gmail.com");

        map.put(p1, "Ali");

        // p2 heeft dezelfde email als p1
        // → HashMap beschouwt dit als dezelfde key
        map.put(p2, "Nieuwe Ali");

        System.out.println(map);

        System.out.println("Aantal entries: " + map.size());
        // 1
    }
}
