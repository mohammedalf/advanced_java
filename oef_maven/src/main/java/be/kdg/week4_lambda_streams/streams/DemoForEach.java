package be.kdg.week4_lambda_streams.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoForEach {
    public static void main(String[] args) {
        Stream.of("One", "Two", "Three", "Four")
                .forEach(System.out::println);

        System.out.println("---------------string concat--------");
        IntStream.of(1, 2, 3, 4)
                .forEach(e -> System.out.print(e + " "));
    }
}
