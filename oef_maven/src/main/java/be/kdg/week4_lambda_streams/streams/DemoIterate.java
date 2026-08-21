package be.kdg.week4_lambda_streams.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIterate {
    public static void main(String[] args) {
        List<Integer> machten = Stream.iterate(1, n -> n * 2)
                .limit(20)
                .collect(Collectors.toList());
        machten.forEach(System.out::println);
    }
}
