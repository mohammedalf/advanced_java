package be.kdg.week4_lambda_streams.lamda.methodrefrence;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> namen = List.of("Mohammed", "Ali", "Sara");

        //Met lambda
        namen.forEach(naam -> System.out.println(naam));
        System.out.println("____________________________");

        //met method refrence
        namen.forEach(System.out::println );
        System.out.println("____________________________");

        //met lambda
        namen.sort((n1,n2)-> n1.compareTo(n2));
        System.out.println(namen);

        //met method refrence
        namen.sort(String::compareTo);

    }
}
