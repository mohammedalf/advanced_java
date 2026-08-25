package be.kdg.week10_Treads.synchronization.guarded_blocks;

import java.util.Random;

public class Producer implements Runnable {
    private final Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String[] messages = {
                "Bericht 1",
                "Bericht 2",
                "Bericht 3",
                "Bericht 4"
        };

        Random random = new Random();

        for (String message : messages) {

            //bericht in Drop plaatsen
            drop.put(message);

            try {
                //simuleer dat producer tijd nodig heeft
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                //voor demo negeren
            }
        }
        //speciaal bericht om aan consumer te zeggen:
        //er komen geen berichten meer
        drop.put("DONE");
    }
}
