package be.kdg.week11_concurrency.cursus.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {
    private static final String[] words = {
            "red", "green", "blue"
    };

    public static void main(String[] args) throws Exception {
        //3 worker threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //hier bewaren we de toekomstige resultaten
        List<Future<Integer>> list = new ArrayList<>();
        for (String word : words) {
            //maak voor elk woord een taak
            Callable<Integer> callable = new WordLengthCallable(word);

            //submit start de taak
            //Future bevat later het resultaat
            Future<Integer> future = pool.submit(callable);
            list.add(future);
        }

        int sum = 0;
        for (Future<Integer> future : list) {

            //get() wacht indien nodig en haalt resultaat op
            sum += future.get();
        }
        System.out.printf(
                "Het aantal letters is %s%n", sum
        );

        pool.shutdown();

    }
}
