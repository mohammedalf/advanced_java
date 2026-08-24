package be.kdg.week8_Datastructuren_en_algoritmes_deel1.recursie;

public class DmoGGD {

    public static void main(String[] args) {
        System.out.println(ggd(12, 8));
    }
    public static int ggd(int a, int b) {
        //stopcondities
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        //recursieve stap
        return ggd(b, a % b);
    }
}
