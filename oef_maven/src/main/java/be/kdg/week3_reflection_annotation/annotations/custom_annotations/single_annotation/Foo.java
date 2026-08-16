package be.kdg.week3_reflection_annotation.annotations.custom_annotations.single_annotation;

public interface Foo {
    //value wordt 25
    @MaxLength(25)
    String getFirstName();


    // niets meegegeven
    // dus value wordt automatisch 80
    @MaxLength
    String getLastName();
}
