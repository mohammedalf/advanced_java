package be.kdg.week11_concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock {
    private static final Lock lock = new ReentrantLock();

    public static void taak() {
        lock.lock();

        try {
            System.out.println(
                    Thread.currentThread().getName() + " is bezig"
            );

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(DemoLock::taak, "Thread 1");
        Thread t2 = new Thread(DemoLock::taak, "Thread 2");

        t1.start();
        t2.start();
    }
}
