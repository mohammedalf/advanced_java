package be.kdg.week10_Treads.threads.demo_p40_lambda;

public class MyLambda {
    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {

            for (int i = 0; i < 100000; i++) {
                System.out.println("Child Thread step " + (i + 1));

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });

        myThread.setDaemon(true);
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread step " + (i + 1));

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}
