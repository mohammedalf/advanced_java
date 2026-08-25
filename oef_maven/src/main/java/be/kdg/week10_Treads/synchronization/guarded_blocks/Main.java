package be.kdg.week10_Treads.synchronization.guarded_blocks;

public class Main {
    public static void main(String[] args) {
        //één gedeeld Drop-object
        Drop drop = new Drop();

        //producer en Consumer gebruiken
        //exact hetzelfde Drop-object
        Producer producer = new Producer(drop);
        Consumer consumer = new Consumer(drop);

        //twee aparte threads
        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        //starten
        producerThread.start();
        consumerThread.start();
    }
}
