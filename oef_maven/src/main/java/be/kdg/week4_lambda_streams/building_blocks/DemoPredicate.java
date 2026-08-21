package be.kdg.week4_lambda_streams.building_blocks;

import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        //haal de lijst met Artikels op uit de klasse Artikels
        List<Artikel> lijst = Artikels.getArtikels();

        //zoek het EERSTE artikel waarvan de prijs groter is dan 500
        Artikel resultaat = firstMatch(lijst, a -> a.getPrijs() > 500);
        System.out.println(resultaat);

        //
        System.out.println(firstMatch(lijst, a-> a.getMerk().equals("Lenovo")));

        //
        System.out.println(firstMatch(lijst, a -> a.getNummer() == 4));
    }

    public static <T> T firstMatch(List<T> candidates, Predicate<T> matchFunction) {
        for (T match : candidates) {
            if (matchFunction.test(match)) {
                return match;
            }
        }
        return null;
    }

}
