package be.kdg.week11_concurrency.cursus.completablefuture;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneStepCompletable {
    private static final String[] wordArray = "May the force be with you".split(" ");

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //start taak asynchroon
        CompletableFuture<Stream<String>> upperFuture =
                CompletableFuture.supplyAsync(
                        () -> Arrays.stream(wordArray)
                                .map(word -> word.toUpperCase())
                );

        //main kan ondertussen verder
        System.out.println("Main werkt verder");

        //wacht hier op het resultaat
        String result = upperFuture.get()
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
