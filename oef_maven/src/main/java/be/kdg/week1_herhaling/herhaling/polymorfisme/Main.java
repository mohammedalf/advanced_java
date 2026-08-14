package be.kdg.week1_herhaling.herhaling.polymorfisme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figuur> figuren = new ArrayList<Figuur>();
        figuren.add(new Cirkel());
        figuren.add(new Vierkant());

        for (Figuur figuur : figuren) {
            figuur.teken();
        }
    }
}
