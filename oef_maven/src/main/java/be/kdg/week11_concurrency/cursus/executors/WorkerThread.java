package be.kdg.week11_concurrency.cursus.executors;

public class WorkerThread implements Runnable {
    private final String nummer;
    public WorkerThread(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public void run() {
        System.out.println(
                "Taak " + nummer +
                        " uitgevoerd door " +
                        Thread.currentThread().getName()
        );
    }
}
