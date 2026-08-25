package be.kdg.week11_concurrency.cursus.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable {
    private final Resource resource;
    private Lock lock;

    public ConcurrencyLockExample(Resource resource) {
        this.resource = resource;

        //expliciet Lock-object
        this.lock = new ReentrantLock();
    }
    @Override
    public void run() {
        try {

            //probeer maximaal 10 seconden de lock te verkrijgen
            if (lock.tryLock(10, TimeUnit.SECONDS)) {

                //enkel uitvoeren als de lock verkregen werd
                resource.doSomething();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {

            //lock expliciet terug vrijgeven
            lock.unlock();
        }

        resource.doLogging();
    }
}
