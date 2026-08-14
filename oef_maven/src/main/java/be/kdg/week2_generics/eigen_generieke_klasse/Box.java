package be.kdg.week2_generics.eigen_generieke_klasse;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    List<T> list = new ArrayList<>();

    public void add(T t){
        list.add(t);
    }

    public T get(int i){
        return list.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : list) {
            sb.append(t + " ");
        }

        return sb.toString();
    }
}
