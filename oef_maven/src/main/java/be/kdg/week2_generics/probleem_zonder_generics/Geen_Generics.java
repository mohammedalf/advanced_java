package be.kdg.week2_generics.probleem_zonder_generics;

import java.util.ArrayList;
import java.util.List;

public class Geen_Generics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        
        //Expliciete cast is nodig!
        String str = (String)list.get(0);

        System.out.println("str = " + str);

        //Verkeerde cast; wordt niet door de
        //compiler ontdekt en resulteert at runtime
        //in: ClassCastException
       // Integer integer = (Integer)list.get(0);


    }
}
