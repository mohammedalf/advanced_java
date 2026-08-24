package be.kdg.week10_Treads.threads;

public class ThreadStateDemo {
    public static void main(String[] as) throws InterruptedException {
        Runnable runnableJob =
                () -> System.out.println("Job is running");
        Thread thread = new Thread(runnableJob);
        System.out.println(thread.getState() + " " + thread.isAlive());
        thread.start();
        System.out.println(thread.getState() + " " + thread.isAlive());
        Thread.sleep(1000);
        System.out.println(thread.getState() + " " + thread.isAlive());
    }
}
