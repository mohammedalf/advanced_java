package be.kdg.week10_Treads.threads;

public class YieldDemo {
    public static void main(String[] args) {

        Runnable taak = () -> {

            for (int i = 1; i <= 5; i++) {

                //toon welke thread bezig is
                System.out.println(
                        Thread.currentThread().getName()
                                + " - stap " + i
                );

                //geef andere threads de kans om te draaien
                Thread.yield();
            }
        };

        Thread peter = new Thread(taak, "Peter");
        Thread julie = new Thread(taak, "Julie");

        peter.start();
        julie.start();
    }
}
