package be.kdg.week10_Treads.threads;

public class ShowStates {
    public static void main(String[] args) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}
