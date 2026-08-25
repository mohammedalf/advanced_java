package be.kdg.week11_concurrency.cursus.lock;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();

        //een gedeeld runnable-object
        //beide threads gebruiken dezelfde ReentrantLock
        ConcurrencyLockExample task = new ConcurrencyLockExample(resource);

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
