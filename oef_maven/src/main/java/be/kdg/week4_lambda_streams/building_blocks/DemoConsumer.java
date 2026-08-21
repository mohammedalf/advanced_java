package be.kdg.week4_lambda_streams.building_blocks;

import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();

        Consumer<Artikel> drukAf = artikel -> System.out.println(artikel);
        lijst.forEach(drukAf);

        System.out.println("\nToekennen korting 10%:\n");
        lijst.forEach(a-> a.setPrijs(a.getPrijs() * 0.9));
        lijst.forEach(System.out::println);

    }
}
