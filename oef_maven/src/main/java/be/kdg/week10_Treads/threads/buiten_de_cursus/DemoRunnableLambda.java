package be.kdg.week10_Treads.threads.buiten_de_cursus;

public class DemoRunnableLambda {
    public static void main(String[] args) {
        Runnable taak = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + ": werk " + i
                );
            }
        };

        Thread thread = new Thread(taak);

        thread.start();

        System.out.println("Main draait verder...");
    }
}
