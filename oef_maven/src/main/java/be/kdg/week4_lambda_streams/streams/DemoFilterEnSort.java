package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.List;

public class DemoFilterEnSort {
    public static void main(String[] args) {
        //filter maakt een nieuwe stream met alleen de elementen die aan een bepaalde voorwaarde voldoen. Die voorwaarde is een Predicate

        List<Artikel> artikels = Artikels.getArtikels();
        // Druk alle artikels van het merk Asus die minder dan €500 kosten
        // gesorteerd op prijs:

        artikels.stream()
                .filter(artikel -> artikel.getMerk().equals("Asus"))
                .filter(artikel -> artikel.getPrijs() < 500)
                .sorted((a,b) -> Double.compare(a.getPrijs(), b.getPrijs()))
                .forEach(System.out::println);


    }
}
