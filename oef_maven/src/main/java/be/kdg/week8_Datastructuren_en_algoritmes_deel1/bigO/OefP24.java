package be.kdg.week8_Datastructuren_en_algoritmes_deel1.bigO;

import java.util.Random;

public class OefP24 {
    public static void main(String[] args) {

    }
    public static void randomSort(int[] array) {
        Random random = new Random();

        for (int i = 0;
             i < array.length * array.length * array.length;
             i++) {

            int randomIndex1 = random.nextInt(array.length - 1);

            int randomIndex2 =
                    random.nextInt(array.length - randomIndex1)
                            + randomIndex1;

            if (array[randomIndex1] > array[randomIndex2]) {
                int tmp = array[randomIndex1];
                array[randomIndex1] = array[randomIndex2];
                array[randomIndex2] = tmp;
            }
        }
    }

    //Aantal stappen:
    //ongeveer n³
    //
    //Tijdscomplexiteit:
    //O(n³)
    //
    //Geheugencomplexiteit:
    //O(n)
}
