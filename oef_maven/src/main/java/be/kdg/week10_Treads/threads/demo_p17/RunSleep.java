package be.kdg.week10_Treads.threads.demo_p17;

public class RunSleep {
    public static void main(String[] args) {
        System.out.println("Begin van de main thread");

        Thread myThread = new Thread(new SleepDemo());
        myThread.start();
        System.out.println("Einde main thread!");
    }
}
