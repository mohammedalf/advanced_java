package be.kdg.week2_generics.bound_generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundDemo {
    // ? super Integer betekent:
    // de lijst is van Integer OF een superklasse van Integer.
    //
    // Toegelaten:
    // List<Integer>
    // List<Number>
    // List<Object>
    public static void addIntegers(List<? super Integer> list) {
        // We mogen veilig Integers toevoegen.
        // Integer past namelijk in:
        // Integer, Number én Object.
        list.add(50);
        list.add(100);
    }

    public static void main(String[] args) {
        // 1. Object is een superklasse van Integer
        List<Object> list1 = new ArrayList<>();
        addIntegers(list1);
        System.out.println("list1 = " + list1);

        // 2. Exact Integer
        List<Integer> list2 = new ArrayList<>();
        addIntegers(list2);
        System.out.println("list2 = " + list2);

        // 3. Number is een superklasse van Integer
        List<Number> list3 = new ArrayList<>();
        addIntegers(list3);
        System.out.println("list3 = " + list3);
    }
}
