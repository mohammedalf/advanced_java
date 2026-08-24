package be.kdg.week10_Treads.threads;

public class DaemonDemo {
    public static void main(String[] args) {

        Thread achtergrond = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Achtergrond stap " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        });

        //deze thread mag stoppen zodra alle user threads klaar zijn
        achtergrond.setDaemon(true);

        achtergrond.start();

        System.out.println("Main doet zijn werk...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println("Main is klaar");
    }
}
