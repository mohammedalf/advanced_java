package be.kdg.week3_reflection_annotation.reflection.domos;

import java.time.LocalDate;

public class DemoGetName {
    public static void main(String[] args) {
        Student student = new Student(
                123456,
                "Igor De Verschrikkelijke",
                LocalDate.of(1995, 9, 18)
        );

        System.out.printf(
                "Volledige naam van de klasse: %s%n",
                student.getClass().getName()
        );

        Integer intObj = Integer.valueOf(123);

        System.out.printf(
                "Volledige naam van de klasse: %s%n",
                intObj.getClass().getName()
        );

        //enkel de naam
        System.out.println(student.getClass().getSimpleName());
    }
}
