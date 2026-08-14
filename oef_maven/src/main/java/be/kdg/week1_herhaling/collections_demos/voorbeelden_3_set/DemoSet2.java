package be.kdg.week1_herhaling.collections_demos.voorbeelden_3_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet2 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("een");
        set.add("twee");
        set.add("drie");
        set.add("vier");

        set.add("drie");
        set.add(new String("twee"));

        System.out.println("Volgorde van toevoeging");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
