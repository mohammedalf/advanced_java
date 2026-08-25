package be.kdg.week11_concurrency.cursus.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleThreadPool {
    public static void main(String[] args) {
        //pool met maximaal 5 worker threads
        ExecutorService exServ = Executors.newFixedThreadPool(5);

        //we geven 10 taken aan de pool
        for (int i = 0; i < 10; i++) {

            Runnable worker = new WorkerThread("" + i);

            //Geef de taak aan de Executor
            //Vergelijkbaar met new Thread(worker).start()
            exServ.execute(worker);
        }
        //geen nieuwe taken meer aannemen
        exServ.shutdown();

        try {
            //wacht tot alle taken klaar zijn
            //een beetje vergelijkbaar met join()
            exServ.awaitTermination(5, TimeUnit.MINUTES);

        } catch (InterruptedException e) {
            System.err.println("Executor onderbroken: " + e);
        }

        System.out.println("Finished all threads");
    }





}
