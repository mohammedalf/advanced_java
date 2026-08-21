package be.kdg.week4_lambda_streams.lamda.functional_interface;

public class Demo {
    public static void main(String[] args) {
        Actie actie = () -> System.out.println("Actie");
        actie.uitvoeren();

        //dit is de oude manier van werken
        Actie actie2 = new Actie() {
            @Override
            public void uitvoeren() {
                System.out.println("Actie2");
            }
        };
        actie2.uitvoeren();
    }
}
