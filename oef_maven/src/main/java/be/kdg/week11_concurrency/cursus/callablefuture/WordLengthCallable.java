package be.kdg.week11_concurrency.cursus.callablefuture;

import java.util.concurrent.Callable;

public class WordLengthCallable implements Callable<Integer> {
    private String word;

    public WordLengthCallable(String word) {
        this.word = word;
    }

    @Override
    public Integer call() throws Exception {
        //dit resultaat wordt teruggegeven aan de Future
        return word.length();
    }
}
