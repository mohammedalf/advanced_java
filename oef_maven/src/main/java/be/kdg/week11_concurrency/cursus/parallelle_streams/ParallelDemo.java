package be.kdg.week11_concurrency.cursus.parallelle_streams;

import java.util.Arrays;
import java.util.List;

public class ParallelDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alfa", "Beta", "Gamma", "Delta");

        //sequentieel
        list.stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        //parallel
        list.parallelStream()
                .forEach(s -> System.out.print(s + " "));
    }
}
