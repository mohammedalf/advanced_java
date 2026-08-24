package be.kdg.week10_Treads.threads.buiten_de_cursus;

public class DemoRunnable {

    public static void main(String[] args) {
        //1 de taak die uitgevoerd moet worden
        Runnable taak = new Runnable() {
            @Override
            public void run() {
                //codeblok
                System.out.println("Taak gestart door: "
                        + Thread.currentThread().getName());

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Werk " + i);
                }
            }
        };

        //2 Thread krijgt de runnable taak
        Thread thread = new Thread(taak);

        //3 start een nieuwe thread
        thread.start();

        //dit wordt uitgevoerd door de main thread
        System.out.println("Main draait verder...");
    }
}
