package be.kdg.week2_generics.bound_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnBoundDemo {
    // <?> betekent:
    // "een List van een onbekend type"
    //
    // Het maakt ons hier niet uit welk type dat is,
    // want we willen de elementen alleen afdrukken.
    
    public static void printData(List<?> list){
        for (Object o : list) {
            System.out.print(o + "::");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Een lijst met Integers
        List<Integer> ints = new ArrayList<>();

        ints.add(3);
        ints.add(5);
        ints.add(10);

        // Werkt: printData accepteert eender welk lijsttype
        printData(ints);

        // 2. Een lijst met Strings
        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("b");
        strs.add("c");

        // Werkt ook
        printData(strs);

        // 3. Een lijst met Objects
        // Hier mogen zelfs verschillende soorten objecten in zitten.
        List<Object> objects = new ArrayList<>();

        objects.add(3.14);
        objects.add("Hello");
        objects.add(new Random());

        // Werkt ook
        printData(objects);

    }
}