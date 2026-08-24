package be.kdg.week10_Treads.threads;

public class PriorityDemo {
    public static void main(String[] args) {

        Runnable taak = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " - stap " + i
                );
            }
        };

        Thread lage = new Thread(taak, "Lage priority");
        Thread hoge = new Thread(taak, "Hoge priority");

        //priority instellen
        lage.setPriority(Thread.MIN_PRIORITY);   // 1
        hoge.setPriority(Thread.MAX_PRIORITY);  // 10

        lage.start();
        hoge.start();
    }
}
