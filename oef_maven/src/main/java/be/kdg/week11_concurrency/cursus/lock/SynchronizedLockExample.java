package be.kdg.week11_concurrency.cursus.lock;

public class SynchronizedLockExample implements Runnable {
    private final Resource resource;

    public SynchronizedLockExample(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        //slechts 1 thread tegelijk mag dit resource-object gebruiken
        synchronized (resource) {
            resource.doSomething();
        } //lock wordt hier automatisch vrijgegeven

        //dit zit buiten het synchronized-blok
        resource.doLogging();
    }
}
