package be.kdg.week2_generics.probleem_zonder_generics;

import java.util.ArrayList;
import java.util.List;

public class Met_Generics {
    public static void main(String[] args) {

        //generics en diamond operator:
        //<> krijgt waarde <String>
        //(zelfde type als in declaratie )
        List<String> list = new ArrayList<>();
        list.add("test");

        String str = list.get(0);
        System.out.println("str = " + str);

        //De compiler garandeert een homogene Collection:
        //je kan er alleen Strings in stoppen
        //list.add(5);
    }
}
