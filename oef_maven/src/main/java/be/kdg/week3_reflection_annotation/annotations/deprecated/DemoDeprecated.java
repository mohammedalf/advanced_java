package be.kdg.week3_reflection_annotation.annotations.deprecated;

public class DemoDeprecated {
    public static void main(String[] args) {

        Punt punt = new Punt();

        // *** Oude methode
        // *** Werkt nog, maar IntelliJ/compiler geeft een warning
        punt.setX(10);

        // *** Nieuwe aanbevolen methode
        punt.setCoordinaten(20, 30);

        System.out.println(punt);
    }
}
