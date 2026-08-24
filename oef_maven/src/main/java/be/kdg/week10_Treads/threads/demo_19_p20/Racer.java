package be.kdg.week10_Treads.threads.demo_19_p20;

import java.util.concurrent.ThreadLocalRandom;

public class Racer implements Runnable {
    @Override
    public void run() {
        String naam = Thread.currentThread().getName();
        //eigen veilige random generator
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 10; i++) {
            System.out.println(naam + " ronde " + (i + 1));

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                // negeer
            }

        }
        System.out.println(naam + " AANGEKOMEN");
    }
}
