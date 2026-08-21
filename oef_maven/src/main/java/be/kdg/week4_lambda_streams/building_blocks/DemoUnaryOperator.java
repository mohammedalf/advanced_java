package be.kdg.week4_lambda_streams.building_blocks;

import java.util.List;

public class DemoUnaryOperator {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();
        artikels.forEach(System.out::println);
        System.out.println("Vervangt elk artikel door een kopie met prijs die 25% hoger ligt ");
        artikels.replaceAll(a -> new Artikel(a.getNummer(),a.getMerk(),a.getModel(), a.getPrijs() * 1.25));
        artikels.forEach(System.out::println);
    }
}
