package be.kdg.week10_Treads.synchronization;

public class Automaat extends Thread{
    private Bankrekening bankrekening;

    public Automaat(String threadName, Bankrekening bankrekening) {
        super(threadName);
        this.bankrekening = bankrekening;
    }

    @Override
    public void run() {
        try {
            bankrekening.geldOpname(500);
            bankrekening.geldOpname(250);
        } catch (InterruptedException e) {

        }
    }
}
