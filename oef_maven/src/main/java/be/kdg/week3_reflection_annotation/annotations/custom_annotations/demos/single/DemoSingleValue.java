package be.kdg.week3_reflection_annotation.annotations.custom_annotations.demos.single;

import java.lang.reflect.Method;

public class DemoSingleValue {
    public static void main(String[] args) {
        for(Method method : Spel.class.getDeclaredMethods()) {
            Unfinished unfinished = method.getAnnotation(Unfinished.class);
            System.out.println(method.getName());

            if (unfinished != null) {
                System.out.println(" --> NOG AFWERKEN: " + unfinished.value());
            }
            else  {
                System.out.println("OK");
            }
        }
    }
}
