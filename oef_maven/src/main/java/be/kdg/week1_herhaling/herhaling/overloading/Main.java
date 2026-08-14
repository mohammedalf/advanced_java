package be.kdg.week1_herhaling.herhaling.overloading;

public class Main {
    public static void main(String[] args) {
        Rekenmachine r = new Rekenmachine();

        System.out.println(r.som(2, 3));
        System.out.println(r.som(2.5, 3.5));
        System.out.println(r.som(2, 3, 4));
    }
}
