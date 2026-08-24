package be.kdg.week8_Datastructuren_en_algoritmes_deel1.recursie;

public class Demo {

    public static void main(String[] args) {
        sayHello(5);
        System.out.println(factorial(5));

        System.out.println("-----------------------");
        rec(3);
    }

    public static void sayHello(int n){
        if (n <= 0) return ;

        System.out.println("Hello! :" + n);

        sayHello(n-1);

    }

    public static long factorial(int n){
        if (n < 0) throw  new IllegalArgumentException();
        if (n == 0) return 1; //stop
        return n * factorial(n-1);
    }

    public static void rec(int n){
        if (n == 0) return;   //stopconditie
        rec(n - 1);
        System.out.println(n);
        rec(n - 1);
    }
}
