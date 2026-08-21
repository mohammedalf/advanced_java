package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoJoining {
    public static void main(String[] args) {
        String merken = Artikels.getArtikels()
                .stream()
                .map(Artikel::getMerk)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(merken);
    }
}
