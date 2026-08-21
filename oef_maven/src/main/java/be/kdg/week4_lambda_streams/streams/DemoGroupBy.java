package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoGroupBy {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        //groupingBy verdeelt de elementen van de stream
        //in meerdere groepen op basis van een function.

        Map<String, List<Artikel>> map = artikels
                .stream()
                .collect(Collectors.groupingBy(Artikel::getMerk));

        map.forEach((k, v) -> System.out.printf("%-8s %s\n",
                k, v.stream()
                        .map(e -> e.getModel() + " -> €" + e.getPrijs())
                        .collect(Collectors.joining(", "))));
    }
}
