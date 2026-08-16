package be.kdg.week3_reflection_annotation.annotations.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class DemoSuppressWarnings {
    public static void main(String[] args) {
        demoWarnings();
    }

    @SuppressWarnings({"unchecked", "unused"})
    private static void demoWarnings() {

        //wij zeggen hier niet welke type elementen in de list zetten
        List lijst = new ArrayList();

        //een string toevoegen
        lijst.add("hallo");

        //UNCHECKED WARNING:
        //Java kan niet volledig controleren of 'lijst'
        //werkelijk alleen Strings bevat
        List<String> strings = lijst;

        //UNUSED WARNING:
        int getal = 10;

    }
}
