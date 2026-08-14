package be.kdg.week1_herhaling.collections_demos.list_interface_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list_interface_methods_demo {
    public static void main(String[] args) {
        // Een List maken
        List<String> namen = new ArrayList<>();


        // ==================================================
        // 1. add(element)
        // Voegt een element achteraan toe
        // ==================================================

        namen.add("Ali");
        namen.add("Sara");
        namen.add("Mohammed");

        System.out.println(namen);
        // [Ali, Sara, Mohammed]


        // ==================================================
        // 2. get(index)
        // Haalt het element op een bepaalde index op
        // ==================================================

        String naam = namen.get(1);

        System.out.println(naam);
        // Sara

        // index:
        // 0 = Ali
        // 1 = Sara
        // 2 = Mohammed


        // ==================================================
        // 3. set(index, element)
        // Vervangt een bestaand element
        // ==================================================

        namen.set(1, "Youssef");

        System.out.println(namen);
        // [Ali, Youssef, Mohammed]


        // ==================================================
        // 4. add(index, element)
        // Voegt een element toe op een specifieke plaats
        // ==================================================

        namen.add(1, "Adam");

        System.out.println(namen);
        // [Ali, Adam, Youssef, Mohammed]

        // De andere elementen schuiven op.


        // ==================================================
        // 5. remove(index)
        // Verwijdert het element op een bepaalde index
        // ==================================================

        namen.remove(2);

        System.out.println(namen);
        // [Ali, Adam, Mohammed]


        // ==================================================
        // 6. addAll(index, collection)
        // Voegt meerdere elementen toe vanaf een bepaalde index
        // ==================================================

        List<String> extraNamen = new ArrayList<>();

        extraNamen.add("Sara");
        extraNamen.add("Omar");

        namen.addAll(1, extraNamen);

        System.out.println(namen);
        // [Ali, Sara, Omar, Adam, Mohammed]


        // ==================================================
        // 7. indexOf(object)
        // Geeft de EERSTE index van een element terug
        // ==================================================

        namen.add("Sara");

        System.out.println(namen);
        // [Ali, Sara, Omar, Adam, Mohammed, Sara]

        int eersteIndex = namen.indexOf("Sara");

        System.out.println(eersteIndex);
        // 1


        // ==================================================
        // 8. lastIndexOf(object)
        // Geeft de LAATSTE index van een element terug
        // ==================================================

        int laatsteIndex = namen.lastIndexOf("Sara");

        System.out.println(laatsteIndex);
        // 5


        // ==================================================
        // 9. listIterator()
        // Maakt een ListIterator vanaf het BEGIN van de lijst
        // ==================================================

        ListIterator<String> iterator = namen.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ==================================================
        // 10. listIterator(index)
        // Maakt een ListIterator vanaf een bepaalde positie
        // ==================================================

        ListIterator<String> iteratorVanaf2 =
                namen.listIterator(2);

        while (iteratorVanaf2.hasNext()) {
            System.out.println(iteratorVanaf2.next());
        }

        // Begint vanaf index 2


        // ==================================================
        // 11. subList(from, to)
        // Maakt een deel van de lijst
        // from = inbegrepen
        // to   = NIET inbegrepen
        // ==================================================

        List<String> deel = namen.subList(1, 4);

        System.out.println(deel);

        // Bij:
        // [Ali, Sara, Omar, Adam, Mohammed, Sara]
        //
        // index 1 t/m index 3:
        // [Sara, Omar, Adam]
    }

}
