package be.kdg.week4_lambda_streams.lamda.zonder_parameters;

public class Timer {
    public static void timerOperation(Operation operation) {

        // Starttijd opslaan
        long start = System.currentTimeMillis();

        // De meegegeven operatie uitvoeren
        operation.runOperation();

        // Eindtijd opslaan
        long end = System.currentTimeMillis();

        System.out.println("Tijd: " + (end - start) + " ms");
    }
}
