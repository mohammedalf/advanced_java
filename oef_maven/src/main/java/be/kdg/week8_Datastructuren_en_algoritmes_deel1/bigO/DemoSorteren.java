package be.kdg.week8_Datastructuren_en_algoritmes_deel1.bigO;

import java.util.Random;

public class DemoSorteren {

    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        for (int anInt : ints) {
//            anInt = Random.
            System.out.println(anInt);
        }
        System.out.println("--------");
        selectionSort2(ints);
        System.out.println("steps: "+stepCounter);

        for (int anInt : ints) {
            System.out.println(anInt);
        }

        System.out.println("--------");
        System.out.println("meten");
        timeSelectionSort(ints.length);


    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexSmallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexSmallest]) {
                    indexSmallest = j;
                }
            }
            int tmp = array[i];
            array[i] = array[indexSmallest];
            array[indexSmallest] = tmp;
        }
    }

    //snelheid meten
    public static void timeSelectionSort(int arraySize) {
        int[] numbers = new Random().ints(arraySize).toArray();
        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long duration = System.currentTimeMillis() - startTime;
        System.out.printf("Sorting array of n = %d took %d milliseconds\n", arraySize,
                duration);
    }

    private static long stepCounter = 0;
    //Tellen van het aantal stappen
    public static void selectionSort2(int[] array) {
        stepCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int indexSmallest = i;
            for (int j = i + 1; j < array.length; j++) {
                stepCounter++;
                if (array[j] < array[indexSmallest]) {
                    indexSmallest = j;
                }
            }
            int tmp = array[i];
            array[i] = array[indexSmallest];
            array[indexSmallest] = tmp;
        }
    }
}
