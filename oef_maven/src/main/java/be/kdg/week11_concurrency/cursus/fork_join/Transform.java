package be.kdg.week11_concurrency.cursus.fork_join;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    private final double[] data;
    private final int start;
    private final int end;
    private final int threshold;

    public Transform(double[] data, int start, int end, int threshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }


    @Override
    protected void compute() {
        //klein genoeg? Dan zelf uitvoeren
        if ((end - start) < threshold) {

            for (int i = start; i < end; i++) {

                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }

        } else {

            //te groot? Splits in twee delen
            int middle = (start + end) / 2;

            //beide subtaken parallel uitvoeren
            invokeAll(
                    new Transform(data, start, middle, threshold),
                    new Transform(data, middle, end, threshold)
            );
        }
    }
}
