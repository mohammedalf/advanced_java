package be.kdg.week1_herhaling.collections_demos.arraylist_vs_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_demo {
    public static void main(String[] args) {
        List<Integer> lijst = new ArrayList<>();

        lijst.add(10);
        lijst.add(20);
        lijst.add(30);

        System.out.println(lijst.get(1)); // 20
        System.out.println(lijst.size()); // 3
    }
}
