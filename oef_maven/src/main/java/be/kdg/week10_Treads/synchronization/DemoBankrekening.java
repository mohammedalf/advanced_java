package be.kdg.week10_Treads.synchronization;

public class DemoBankrekening {
    private static final int BEGINSALDO = 1325;

    public static void main(String[] args) {
        Bankrekening rekening = new Bankrekening("BE26-3699-6941-1532", BEGINSALDO);

        Automaat a1 = new Automaat("Antwerpen", rekening);
        Automaat a2 = new Automaat("Gent", rekening);

        System.out.println("Beginsaldo: " + BEGINSALDO + "\n");
        a1.start();
        a2.start();
    }
}
