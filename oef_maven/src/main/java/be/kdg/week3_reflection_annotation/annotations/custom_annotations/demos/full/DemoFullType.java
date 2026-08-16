package be.kdg.week3_reflection_annotation.annotations.custom_annotations.demos.full;

import java.lang.reflect.Method;

public class DemoFullType {
    public static void main(String[] args) {
        for(Method method : Spel.class.getDeclaredMethods()) {
            Unfinished unfinished = method.getAnnotation(Unfinished.class);
            System.out.print(method.getName());

            if(unfinished != null) {
                System.out.println(" --> NOG AFWERKEN: " +unfinished.toDo());
                System.out.println("\tPrioriteit: " + unfinished.belangrijkheid());
                System.out.println("\tEinddatum: "+ unfinished.eindDatum());;
            }else
                System.out.println(" --> OK");
        }
    }
}
