package be.kdg.week10_Treads.threads.demo_p38;

public class DaemonTest {
    public static void main(String[] args) {

        System.out.println("Begin van de main thread");

        Thread daemonThread = new Thread(() -> {

            System.out.println("Wacht 4 sec");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Bedankt voor uw geduld");
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Einde van de main thread");
    }
}
