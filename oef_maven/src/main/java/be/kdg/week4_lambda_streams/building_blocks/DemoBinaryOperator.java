package be.kdg.week4_lambda_streams.building_blocks;

import java.util.function.BinaryOperator;

public class DemoBinaryOperator {
    public static void main(String[] args) {
        //2 waarden van hetzelfde type erin → 1 waarde van hetzelfde type eruit
        System.out.println("optellen");
        BinaryOperator<Integer> optellen = (a, b) -> a + b;
        int sum = optellen.apply(10, 20);
        System.out.println(sum);

        System.out.println("_________________________________");
        System.out.println("saamenvoegen");

        BinaryOperator<String> saamenvoegen = (a, b) -> a +" "+ b;
        System.out.println(saamenvoegen.apply("Hello", "World"));
    }
}
