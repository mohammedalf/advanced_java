package be.kdg.week10_Treads.threads;

public class IsAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {

            System.out.println("Worker is gestart");

            try {
                Thread.sleep(3000); // 3 seconden bezig
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Worker is klaar");
        });

        //thread is nog niet gestart
        System.out.println("Voor start: " + worker.isAlive());

        worker.start();

        //thread is nu bezig
        System.out.println("Na start: " + worker.isAlive());

        //wacht tot worker klaar is
        worker.join();

        //thread is volledig afgelopen
        System.out.println("Na join: " + worker.isAlive());
    }
}
