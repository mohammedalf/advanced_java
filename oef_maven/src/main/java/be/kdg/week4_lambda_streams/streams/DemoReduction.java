package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoReduction {
    public static void main(String[] args) {

        //Deze methode combineert een reeks invoerelementen in een
        //enkelvoudig resultaat door de accumulator herhaald toe te
        //passen
        List<Artikel> artikels = Artikels.getArtikels();

        // met reduce
        System.out.println("-----------------------------reduce---------------------------------");
        Optional<Double> totaal = artikels.stream()
                .map(Artikel::getPrijs)
                .reduce((a, b) -> a + b);
        if (totaal.isPresent()) {
            System.out.println(totaal.get());
        }

        System.out.println("-----------------------------sum---------------------------------");
        // alternatief met sum
        double som = artikels.stream()
                .mapToDouble(Artikel::getPrijs)
                .sum();
        System.out.println(som);

        System.out.println("-----------------------------average---------------------------------");
        OptionalDouble gemiddelde = artikels.stream()
                .mapToDouble(Artikel::getPrijs)
                .average();
        System.out.println(gemiddelde.getAsDouble());

        System.out.println("-----------------------------count---------------------------------");
        long aantal = artikels.stream()
                .count();
        System.out.println(aantal);

    }
}
