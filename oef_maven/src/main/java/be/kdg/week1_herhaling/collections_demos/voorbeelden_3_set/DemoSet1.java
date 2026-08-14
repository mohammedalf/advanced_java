package be.kdg.week1_herhaling.collections_demos.voorbeelden_3_set;

import java.util.HashSet;
import java.util.Set;

public class DemoSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("een");
        set.add("twee");
        set.add("drie");
        set.add("vier");

        set.add(new String("twee"));

        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
