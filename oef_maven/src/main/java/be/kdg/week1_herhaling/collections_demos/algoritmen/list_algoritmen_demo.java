package be.kdg.week1_herhaling.collections_demos.algoritmen;

import java.util.*;

public class list_algoritmen_demo {
    public static void main(String[] args) {
        // We maken een lijst met getallen
        List<Integer> getallen = new ArrayList<>();

        getallen.add(5);
        getallen.add(2);
        getallen.add(8);
        getallen.add(1);
        getallen.add(4);

        System.out.println("Origineel:");
        System.out.println(getallen);


        // -------------------------------------------------
        // 1. SORT
        // Sorteert de lijst van klein naar groot
        // -------------------------------------------------

        Collections.sort(getallen);

        System.out.println("\nNa sort:");
        System.out.println(getallen);
        // [1, 2, 4, 5, 8]


        // -------------------------------------------------
        // 2. BINARY SEARCH
        // Zoekt een element in een GESORTEERDE lijst
        // Geeft de index terug
        // -------------------------------------------------

        int index = Collections.binarySearch(getallen, 5);

        System.out.println("\nIndex van 5:");
        System.out.println(index);
        // 5 staat op index 3


        // -------------------------------------------------
        // 3. REVERSE
        // Draait de volgorde van de lijst om
        // -------------------------------------------------

        Collections.reverse(getallen);

        System.out.println("\nNa reverse:");
        System.out.println(getallen);
        // [8, 5, 4, 2, 1]


        // -------------------------------------------------
        // 4. SHUFFLE
        // Zet de elementen in een willekeurige volgorde
        // -------------------------------------------------

        Collections.shuffle(getallen);

        System.out.println("\nNa shuffle:");
        System.out.println(getallen);
        // bijvoorbeeld [4, 1, 8, 2, 5]
        // resultaat kan elke keer anders zijn


        // -------------------------------------------------
        // 5. MIN
        // Geeft het kleinste element terug
        // -------------------------------------------------

        int kleinste = Collections.min(getallen);

        System.out.println("\nKleinste:");
        System.out.println(kleinste);
        // 1


        // -------------------------------------------------
        // 6. MAX
        // Geeft het grootste element terug
        // -------------------------------------------------

        int grootste = Collections.max(getallen);

        System.out.println("\nGrootste:");
        System.out.println(grootste);
        // 8


        // -------------------------------------------------
        // 7. COPY
        // Kopieert elementen van source naar destination
        // De destination moet al groot genoeg zijn!
        // -------------------------------------------------

        List<Integer> bron = new ArrayList<>();
        bron.add(10);
        bron.add(20);
        bron.add(30);

        List<Integer> bestemming = new ArrayList<>();
        bestemming.add(0);
        bestemming.add(0);
        bestemming.add(0);

        Collections.copy(bestemming, bron);

        System.out.println("\nNa copy:");
        System.out.println(bestemming);
        // [10, 20, 30]


        // -------------------------------------------------
        // 8. UNMODIFIABLE LIST
        // Maakt een read-only versie van een List
        // -------------------------------------------------

        List<Integer> readonlyList =
                Collections.unmodifiableList(getallen);

        System.out.println("\nRead-only List:");
        System.out.println(readonlyList);

        // Dit zou een fout geven tijdens uitvoering:
        // readonlyList.add(100);


        // -------------------------------------------------
        // 9. UNMODIFIABLE SET
        // Maakt een read-only versie van een Set
        // -------------------------------------------------

        Set<String> namen = new HashSet<>();

        namen.add("Ali");
        namen.add("Sara");
        namen.add("Mohammed");

        Set<String> readonlySet =
                Collections.unmodifiableSet(namen);

        System.out.println("\nRead-only Set:");
        System.out.println(readonlySet);

        // Dit zou een fout geven tijdens uitvoering:
        // readonlySet.add("Jan");
    }

}
