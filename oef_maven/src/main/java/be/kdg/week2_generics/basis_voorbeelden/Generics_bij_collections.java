package be.kdg.week2_generics.basis_voorbeelden;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics_bij_collections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");

        Iterator<String> it = list.iterator();
        //Geen cast nodig; de
        //compiler weet dat het over
        //String gaat
        while (it.hasNext()) {
            System.out.println(it.next().toUpperCase());
        }
    }
}
