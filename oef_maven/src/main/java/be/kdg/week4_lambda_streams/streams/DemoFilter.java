package be.kdg.week4_lambda_streams.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoFilter {
    public static void main(String[] args) {
        //filter maakt een nieuwe stream met alleen de elementen die aan een bepaalde voorwaarde voldoen. Die voorwaarde is een Predicate

        // Maak een tabel met alle getallen van 1 tot en met 100
        Integer[] getallenTabel = Stream
                .iterate(1, n -> n + 1)
                .limit(100)
                .toArray(Integer[]::new);


        // Maak een stream met alle even getallen kleiner dan 40
        Arrays.stream(getallenTabel)
                .filter(n -> n % 2 == 0)
                .filter(n -> n < 40)
                .forEach(a -> System.out.print(a + " "));
    }
}
