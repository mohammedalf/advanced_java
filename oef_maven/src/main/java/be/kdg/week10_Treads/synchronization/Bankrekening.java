package be.kdg.week10_Treads.synchronization;

public class Bankrekening {
    private String rekeningNummer;
    private int saldo;

    public Bankrekening(String rekeningNummer, int saldo) {
        this.rekeningNummer = rekeningNummer;
        this.saldo = saldo;
    }

    public void geldOpname(int bedrag) throws InterruptedException {
        System.out.println("Geldopname te " + Thread.currentThread().getName() + " van rekening " + rekeningNummer);
        System.out.println("Bedrag: " + bedrag);
        synchronized (this) {
            if (bedrag <= saldo) {
                Thread.sleep(100);
                saldo -= bedrag;
                System.out.println("Nieuw saldo: " + saldo);

            } else {
                System.out.println("Het saldo is te klein!");
            }
        }
        System.out.println();
    }
}
