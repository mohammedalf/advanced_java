package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DemoMinMax {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();
        // Druk het goedkoopste artikel af
        System.out.println("----------------------Goedkoopste-----------------------");
        Artikel goedkoopste = artikels.stream()
                .min(Comparator.comparing(Artikel::getPrijs))
                .get();
        System.out.println(goedkoopste);

        // Druk het duurste artikel af indien er een artikel aanwezig is
        System.out.println("----------------------Duurste-----------------------");
        Artikel duurste = artikels.stream()
                .max(Comparator.comparing(Artikel::getPrijs))
                .get();
        System.out.println(duurste);
    }
}
