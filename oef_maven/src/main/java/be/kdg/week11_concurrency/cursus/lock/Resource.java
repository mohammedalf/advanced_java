package be.kdg.week11_concurrency.cursus.lock;

public class Resource {
    public void doSomething() {
        System.out.println(
                Thread.currentThread().getName() + " gebruikt de resource"
        );
    }

    public void doLogging() {
        System.out.println(
                Thread.currentThread().getName() + " is klaar"
        );
    }
}
