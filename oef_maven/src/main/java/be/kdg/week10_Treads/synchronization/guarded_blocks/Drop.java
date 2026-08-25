package be.kdg.week10_Treads.synchronization.guarded_blocks;

public class Drop {
    private String message;

    //true = er zit momenteel geen bericht in de Drop
    private boolean empty = true;

    //Consumer roept deze methode op
    public synchronized String take() {

        //zolang er niets beschikbaar is:
        while (empty) {
            try {
                //Consumer wacht
                wait();
            } catch (InterruptedException e) {
                //voor deze demo negeren we dit
            }
        }

        //bericht wordt opgehaald --> Drop wordt terug leeg
        empty = true;

        //laat de producer weten dat de toestand veranderd is
        notifyAll();

        return message;
    }


    // Producer roept deze methode op
    public synchronized void put(String message) {

        //zolang er nog een bericht aanwezig is:
        while (!empty) {
            try {
                //producer wacht tot consumer het bericht heeft opgehaald
                wait();
            } catch (InterruptedException e) {
                //voor deze demo negeren we dit
            }
        }

        //nieuw bericht plaatsen
        empty = false;
        this.message = message;

        //laat de consumer weten dat er een bericht beschikbaar is
        notifyAll();
    }
}
