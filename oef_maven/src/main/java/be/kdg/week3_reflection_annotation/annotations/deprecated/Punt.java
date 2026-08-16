package be.kdg.week3_reflection_annotation.annotations.deprecated;

public class Punt {
    private int x;
    private int y;


    /**
     * Wijzigt alleen de x-coördinaat.
     *
     * @param x de nieuwe x-coördinaat
     *
     * @deprecated gebruik liever {@link #setCoordinaten(int, int)}
     */
    @Deprecated
    public void setX(int x) {
        this.x = x;
    }


    // *** Nieuwe methode
    public void setCoordinaten(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Punt{x=" + x + ", y=" + y + "}";
    }
}
