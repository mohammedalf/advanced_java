package be.kdg.week4_lambda_streams.lamda.van_oud_naar_nieuw;

import java.util.Arrays;

public class DemoNieuwMetLamda {

    public static void main(String[] args) {
        String[] testStrings = {
                "Jan",
                "Alexander",
                "Piet",
                "Koen"
        };
        //manier 3
//        Arrays.sort(testStrings,(String s1, String s2)->{return s1.length() - s2.length();});


        //manier 4
        //types weglaten
        Arrays.sort(testStrings,( s1, s2)->{return s1.length() - s2.length();});

        //manier 5
        //{} en return weglaten bij één statement
        Arrays.sort(testStrings,( s1, s2)->s1.length() - s2.length());
        System.out.println(Arrays.toString(testStrings));

        //speciaal geval één parameter
        //e -> System.out.println(e)
    }

}
