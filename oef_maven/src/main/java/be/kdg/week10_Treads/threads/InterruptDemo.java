package be.kdg.week10_Treads.threads;

public class InterruptDemo {
    public static void main(String[] args) {

        Thread worker = new Thread(() -> {

            System.out.println("Worker begint");

            try {
                System.out.println("Worker gaat 10 seconden slapen...");

                Thread.sleep(10000);

                System.out.println("Worker is normaal wakker geworden");

            } catch (InterruptedException e) {

                //hier komen we terecht als interrupt() wordt uitgevoerd
                System.out.println("Worker werd onderbroken!");
            }

            System.out.println("Worker stopt");
        });

        worker.start();

        try {
            //main wacht 2 seconden
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //onderbreek de worker terwijl hij aan het slapen is
        worker.interrupt();
    }
}
