package be.kdg.week4_lambda_streams.building_blocks;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoFuncionSorteren {
    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();
        System.out.println("Alfabetisch gesorteerd op merk en vervolgens op dalende prijs:");

        Collections.sort(lijst, Comparator.comparing(Artikel::getMerk)
                .thenComparing(Artikel::getPrijs).reversed());


        lijst.forEach(System.out::println);
    }
}
