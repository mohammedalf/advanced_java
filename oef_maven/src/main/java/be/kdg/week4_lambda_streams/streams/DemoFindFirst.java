package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.List;
import java.util.Optional;

public class DemoFindFirst {
    public static void main(String[] args) {
        //findFirstis een terminal operation die een Optional teruggeeft
        List<Artikel> artikels = Artikels.getArtikels();

        // Zoek het eerste artikel van Lenovo goedkoper dan €500
        Optional<Artikel> artikel = artikels.stream()
                .filter(a-> a.getPrijs() <500)
                .filter(a -> a.getMerk().equals("Lenovo"))
                .findFirst();
        if (artikel.isPresent()) {
            System.out.println(artikel.get());
        }else
            System.out.println("geen artikel gevonden");
//        artikel.ifPresent(System.out::println);

        System.out.println("-------------------------manier2---------------------");
        artikels.stream()
                .filter(a-> a.getPrijs() <500)
                .filter(a -> a.getMerk().equals("Lenovo"))
                .findFirst()
                .ifPresentOrElse(e -> System.out.println(e),()-> System.out.println("Geen artikel gevonden"));
    }
}
