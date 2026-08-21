package be.kdg.week4_lambda_streams.lamda.zonder_parameters;

import java.util.Arrays;
import java.util.Random;


public class Demo {
    public static void main(String[] args) {

        int size = 100000;

        //OUDE MANIER:
        //we maken een anonieme klasse die Operation implementeert
        Timer.timerOperation(new Operation() {

            @Override
            public void runOperation() {

                // Dit is de code die Timer zal uitvoeren
                sortArray(size);
            }
        });
    }


    // Methode die een array maakt en sorteert
    public static void sortArray(int size) {

        int[] numbers = new int[size];
        Random random = new Random();

        // Array vullen met random getallen
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        // Array sorteren
        Arrays.sort(numbers);
    }
}
