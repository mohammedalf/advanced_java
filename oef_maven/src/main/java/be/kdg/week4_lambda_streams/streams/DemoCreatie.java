package be.kdg.week4_lambda_streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoCreatie {
    public static void main(String[] args) {
        System.out.println("---------manier1--------------");
        List<String> rijders = Arrays.asList(
                "Lewis", "Nico", "Sebastian", "Kimi"
        );
        rijders.stream().forEach(System.out::println);

        System.out.println("---------manier2--------------");
        Stream<String> piloten = Stream.of(
                "Lewis", "Nico", "Sebastian", "Kimi"
        );
        piloten.forEach(System.out::println);

        System.out.println("---------manier3--------------");
        String[] drivers = {
                "Lewis", "Nico", "Sebastian", "Kimi"
        };
        Stream.of(drivers).forEach(System.out::println);
    }
}
