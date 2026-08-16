package be.kdg.week3_reflection_annotation.annotations.safevarargs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoSafeVarargs {

    public static void main(String[] args) {
        //eerste lijst
        List<String> myList1 = new ArrayList<>();
        myList1.add("Alfa");
        myList1.add("Bravo");
        myList1.add("Charlie");

        //tweede lijst
        List<String> myList2 = new ArrayList<>();
        myList2.add("Delta");
        myList2.add("Echo");

        //derde lijst
        List<String> myList3 = new LinkedList<>();
        myList3.add("Zoeloe");


        //we geven 3 List<String>-objecten mee
        printLists(myList1, myList2, myList3);
    }

    @SafeVarargs
    private static void printLists(List<String>... stringLists) {
        String firstString = stringLists[0].get(0);
        List<String> lastList = stringLists[stringLists.length - 1];
        String lastString = lastList.get(lastList.size() - 1);
        System.out.println("firstString = " + firstString);
        System.out.println("lastString = " + lastString);
    }

    //verwacht:
    //List<String>[]
    //
    //maar door verkeerd gebruik:
    //[ List<String>, List<Integer> ]
    //                 ↑
    //              fout type
}
