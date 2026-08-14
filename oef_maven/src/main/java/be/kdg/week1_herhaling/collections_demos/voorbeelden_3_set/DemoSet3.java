package be.kdg.week1_herhaling.collections_demos.voorbeelden_3_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet3 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("een");
        set.add("twee");
        set.add("drie");
        set.add("vier");
        set.add(new String("twee"));

        System.out.println("alfabetisch gesorteerd");
        for (String s : set) {
            System.out.println( s);
        }
    }
}
