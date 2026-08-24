package be.kdg.week10_Treads.threads;

public class DemoJoin {
    public static void main(String[] args) throws InterruptedException {
        //maak een taak
        Runnable taak = () -> {
            System.out.println("Thread: ik begin te werken...");

            try {
                Thread.sleep(3000); // simuleert 3 seconden werk
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread: ik ben klaar!");
        };



        //maak een thread met die taak
        Thread worker = new Thread(taak);


        System.out.println("Main: ik start de worker");

        worker.start();


        // ZONDER join zou main hier meteen verdergaan
        // MET join wacht main tot 'worker' volledig klaar is
        worker.join();

        System.out.println("Main: worker is klaar, ik ga nu verder");
    }
}
