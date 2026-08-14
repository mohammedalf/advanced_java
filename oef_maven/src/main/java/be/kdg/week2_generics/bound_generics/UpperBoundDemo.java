package be.kdg.week2_generics.bound_generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundDemo {

    // Deze methode accepteert een List van:
    // Number OF een subtype van Number
    // bv. Integer, Double, Long,..
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        //lijst van integers
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);

        // Werkt omdat Integer een subtype is van Number
        double sum = sum(ints);

        System.out.println("sum of ints = " + sum);

        // Lijst met Doubles
        List<Double> doubles = new ArrayList<>();

        doubles.add(1.5);
        doubles.add(3.5);
        doubles.add(10.0);

        // Werkt omdat Double ook een subtype is van Number
        sum = sum(doubles);

        System.out.println("Sum of doubles = " + sum);
    }

}
