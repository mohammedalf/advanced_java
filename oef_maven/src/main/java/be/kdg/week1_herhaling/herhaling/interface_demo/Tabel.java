package be.kdg.week1_herhaling.herhaling.interface_demo;

import java.util.Arrays;

public class Tabel implements Deelbaar {

    private int[] tabel;

    public Tabel(int[] tabel) {
        this.tabel = tabel;
    }

    @Override
    public void deel() {
        for (int i = 0; i < tabel.length; i++) {
            tabel[i] /= FACTOR;
        }
    }

    @Override
    public String toString() {
        return "Tabel{" +
                "tabel=" + Arrays.toString(tabel) +
                '}';
    }
}
