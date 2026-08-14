package be.kdg.week1_herhaling.herhaling.interface_demo;

public class Main {
    public static void main(String[] args) {
        Getal getal = new Getal(10);

        System.out.println(getal);   // 10
        getal.deel();
        System.out.println(getal);   // 5


        Tabel tabel = new Tabel(new int[]{10, 20, 30, 40});

        System.out.println(tabel);   // [10, 20, 30, 40]
        tabel.deel();
        System.out.println(tabel);   // [5, 10, 15, 20]
    }
}
