package be.kdg.week4_lambda_streams.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoGenerate {
    public static void main(String[] args) {

        //Maakt een gesorteerde List van 100 willekeurige getallen in het
        //bereik 100 .. 999
        Random random = new Random();
        Supplier<Integer> generator = () -> random.nextInt(900) + 100;
        List<Integer> getallen = Stream.generate(generator)
                .limit(100)
                .sorted()
                .collect(Collectors.toList());
    }
}
