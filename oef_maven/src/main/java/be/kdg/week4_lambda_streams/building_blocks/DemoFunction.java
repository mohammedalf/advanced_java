package be.kdg.week4_lambda_streams.building_blocks;

import java.util.List;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();
        //casting nodig omdat nummer geen double waarde is
        System.out.println("Som artikelnummers: " + mapSum(lijst, a -> (double)a.getNummer()));
        System.out.println("Som prijzen: " + mapSum(lijst, a->a.getPrijs()));
        System.out.println("Som prijzen: " + mapSum(lijst, Artikel::getPrijs));
    }

    //uit elk element van een lijst een double-waarde halen en al die waarden optellen
    public static <T> double mapSum(List<T> entries, Function<T, Double> mapper) {
        double sum = 0;
        for (T entry : entries) {
            sum += mapper.apply(entry);
        }
        return sum;
    }

}
