package be.kdg.week3_reflection_annotation.annotations.custom_annotations.demos.marker;

import java.lang.reflect.Method;

public class DemoMarker {
    public static void main(String[] args) {
        for (Method method : Spel.class.getDeclaredMethods()) {

            //kijk of deze methode de annotation @Unfinished heeft
            Unfinished unfinished =
                    method.getAnnotation(Unfinished.class);

            //print eerst de naam van de methode
            System.out.print(method.getName());

            //als @Unfinished gevonden is:
            if (unfinished != null) {
                System.out.println(" --> NOG AFWERKEN!");
            } else {
                System.out.println(" --> OK");
            }
        }
    }
}
