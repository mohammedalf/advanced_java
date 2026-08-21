package be.kdg.week4_lambda_streams.streams;

import be.kdg.week4_lambda_streams.building_blocks.Artikel;
import be.kdg.week4_lambda_streams.building_blocks.Artikels;

import java.util.List;

public class DemoKlassiek_vs_Stream {
    public static void main(String[] args) {
        //Tel het aantal artikels goedkoper dan €400
        List<Artikel> artikels = Artikels.getArtikels();
        System.out.println("-------------------------klassiek----------------------------");
        int aantal = 0;
        for (Artikel artikel : artikels) {
            if (artikel.getPrijs() > 400.0) {
                aantal++;
            }
        }
        System.out.println(aantal);
        System.out.println("-----------------------------met streaams-------------------");
        long aantalArtikels = artikels.stream()
                .filter(a -> a.getPrijs() > 400)
                .count();
        System.out.println(aantalArtikels);
    }
}
