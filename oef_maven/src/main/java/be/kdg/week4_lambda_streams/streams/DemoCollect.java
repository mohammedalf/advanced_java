package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoCollect {
    public static void main(String[] args) {
        List<Integer> nummers = Arrays.asList(2, 6, 8);
        List<Artikel> specials =
                nummers.stream()
                        .map(Artikels::zoekArtikel)
                        .collect(Collectors.toList());

        System.out.println(specials);

        System.out.println("-----------------------------");
        List<String> piloten = Arrays.asList(
                "Niko",
                "Lewis",
                "Kimi",
                "Sebastian",
                "Valtteri",
                "Felipe"
        );

        Set<String> drivers = piloten.stream()
                .filter(e -> e.charAt(0) < 'S')
                .collect(Collectors.toSet());

        drivers.forEach(System.out::println);

    }
}
