package be.kdg.week4_lambda_streams.streams;

import java.util.List;
import java.util.stream.IntStream;

public class DemoIntStream {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5)
                .forEach(System.out::println);

        List<Integer> getallen = List.of(1, 2, 3, 4, 5);

        System.out.println("---------------------------getallen groter dan 2-----------------------------");
        getallen.stream()             // 1 stream maken
                .filter(x -> x > 2)   // 2 intermediate operation
                .forEach(System.out::println); // 3 terminal operation
    }


}
