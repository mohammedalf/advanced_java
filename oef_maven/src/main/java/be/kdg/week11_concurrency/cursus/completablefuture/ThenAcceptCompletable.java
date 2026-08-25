package be.kdg.week11_concurrency.cursus.completablefuture;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ThenAcceptCompletable {
    private static final String[] wordArray =
            "May the force be with you".split(" ");

    public static void main(String[] args) {
        ExecutorService pool =
                Executors.newFixedThreadPool(3);

        CompletableFuture
                //taak 1: woorden naar hoofdletters
                .supplyAsync(
                        () -> Arrays.stream(wordArray)
                                .map(word -> word.toUpperCase()),
                        pool
                )

                //taak 2: automatisch uitvoeren wanneer taak 1 klaar is
                .thenAccept(result ->
                        System.out.println(
                                result.collect(Collectors.joining(" "))
                        )
                );

        //main hoeft niet te wachten op taak 1
        System.out.println("Main werkt verder");
        System.out.println("Einde main");

        pool.shutdown();
    }
}
