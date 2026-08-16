package be.kdg.week3_reflection_annotation.annotations.custom_annotations.demos.reflectievoorbeeld;

@DoeDeGroeten("Hello, class!")
public class Hallo {
    @DoeDeGroeten("Hello, field!")
    private String groetToestand;


    @DoeDeGroeten("Hello, constructor!")
    public Hallo() {
    }


    @DoeDeGroeten("Hello, method!")
    public void groet() {
    }
}
