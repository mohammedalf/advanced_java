package be.kdg.week10_Treads.synchronization.guarded_blocks;

import java.util.Random;

public class Consumer implements Runnable{
    private final Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random random = new Random();

        String threadName =
                Thread.currentThread().getName();

        String message = drop.take();

        while (!message.equals("DONE")) {

            System.out.println(
                    threadName
                            + " - MESSAGE RECEIVED: "
                            + message
            );

            try {
                //simuleer verwerkingstijd
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                //voor demo negeren
            }

            //volgend bericht ophalen
            message = drop.take();
        }
    }
}
