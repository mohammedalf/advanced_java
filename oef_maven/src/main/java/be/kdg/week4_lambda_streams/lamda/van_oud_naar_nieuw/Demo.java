package be.kdg.week4_lambda_streams.lamda.van_oud_naar_nieuw;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        String[] testStrings = {
                "Jan",
                "Alexander",
                "Piet",
                "Koen"
        };

        //we geven aan array.sort een comparator object mee
        //manier 1
//        Arrays.sort(testStrings, new MyComparator());

        //manier 2
        Arrays.sort(testStrings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


        System.out.println(Arrays.toString(testStrings));
    }

}
