package be.kdg.week4_lambda_streams.streams;

import java.util.Arrays;
import java.util.List;

public class DemoMap {
    public static void main(String[] args) {
        //mapmaakt een nieuwe stream die het resultaat is van het
        //toepassen van een Function op elk element van de
        //oorspronkelijke stream.
        List<Integer> getallen = Arrays.asList( 1, 2, 3, 4, 5);
        getallen.stream()
                .map(i -> i*i)
                .forEach(e-> System.out.println(e + " "));


        //mapToInt
        //→maakt IntStream–mapToDouble–flatMap
        //→maakt DoubleStream
        //1 4 9 16 25
        //→combineert geneste streams tot een
        //enkelvoudige stream

    }
}
