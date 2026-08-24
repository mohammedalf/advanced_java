package be.kdg.week10_Treads.threads.demo_19_p20;

public class StartRace {
    public static void main(String[] args) {

        Thread racerEen = new Thread(new Racer(), "Peter");
        Thread racerTwee = new Thread(new Racer(), "Julie");

        System.out.println("De deelnemers staan klaar");
        racerEen.start();
        racerTwee.start();
        System.out.println("De race is begonnen");
    }
}
