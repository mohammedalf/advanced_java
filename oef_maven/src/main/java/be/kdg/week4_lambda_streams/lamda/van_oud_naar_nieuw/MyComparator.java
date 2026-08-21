package be.kdg.week4_lambda_streams.lamda.van_oud_naar_nieuw;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //vergelijk de lengte van string 1 met string 2
        return o1.length() - o2.length();
    }
}
