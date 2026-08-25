package be.kdg.week11_concurrency.cursus.concurrent_collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DemoConcurrentCollections {
    public static void main(String[] args) {
        //maximum 2 elementen
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(() -> {
            try {
                queue.put("A");
                queue.put("B");

                //Queue zit vol --> deze thread wacht
                queue.put("C");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(2000);

                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
    }
}
