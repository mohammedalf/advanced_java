package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoLimit {
    public static void main(String[] args) {
        //limitgeeft een stream terug met een opgegeven maxSizeelementen:



        // Maak een tabel met 10000 willekeurige getallen
        // van 1 tot en met 1000:
        IntStream getallen = new Random().ints(10000, 1, 1001);

        // Druk de eerste 10 gegenereerde getallen kleiner dan 100 af
        getallen.filter(e -> e <100)
                .limit(10)
                .forEach(e -> System.out.print(e + " "));

        System.out.println();
        // Druk de eerste 12 oneven getallen af
        Stream.iterate(1, n -> n + 2)
                .limit(12)
                .forEach(n -> System.out.print(n + " "));

    }
}
