package be.kdg.week10_Treads.threads.demo_p17;

public class SleepDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Wacht 3 seconden...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {

        }
        System.out.println("Bedankt om te wachten!");
    }
}
