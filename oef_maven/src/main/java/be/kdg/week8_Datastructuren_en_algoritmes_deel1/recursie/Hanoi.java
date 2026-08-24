package be.kdg.week8_Datastructuren_en_algoritmes_deel1.recursie;

public class Hanoi {
    public void moveTower(int height, int from, int to, int hulp) {
        if (height == 0) return; // stopconditie

        //1. verplaats de bovenste n-1 schijven naar de hulppaal
        moveTower(height - 1, from, hulp, to);

        //2. verplaats de grootste schijf naar de doelpaal
        movePiece(from, to);

        //3 verplaats de n-1 schijven van de hulppaal naar de doelpaal
        moveTower(height - 1, hulp, to, from);
    }

    private void movePiece(int from, int to) {
        System.out.printf("Moving piece from %d to %d\n", from, to);
    }

    public static void main(String[] args) {
        Hanoi h = new Hanoi();
        h.moveTower(3, 1, 3, 2);
    }
}
