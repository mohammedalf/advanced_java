package be.kdg.week11_concurrency.cursus.fork_join;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {
    public static void main(String[] args) {
        int cores = 4;
        int size = 1000;

        //pool met 4 worker threads
        ForkJoinPool pool = new ForkJoinPool(cores);

        double[] numbers = new double[1_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        Transform task = new Transform(numbers, 0, numbers.length, size);

        //start de Fork/Join-taak en wacht tot ze klaar is
        pool.invoke(task);

        //resultaat
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d -> %.2f%n", i, numbers[i]);
        }
    }
}
