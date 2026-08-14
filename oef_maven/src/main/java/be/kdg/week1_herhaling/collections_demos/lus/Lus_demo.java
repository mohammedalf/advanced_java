package be.kdg.week1_herhaling.collections_demos.lus;

import be.kdg.week1_herhaling.herhaling.overerving.specialisatie.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lus_demo {
    public static void main(String[] args) {
        List<Student> myList = new ArrayList<>();

        myList.add(new Student("mo",1));
        myList.add(new Student("moo",2));

        //shortcut itli
        for (int i = 0; i < myList.size(); i++) {
            Student student =  myList.get(i);
            System.out.println(student);
        }

        //shortcut iter
        for (Student student : myList) {
            System.out.println(student);
        }

        //shortcut itco
        for (Iterator<Student> iterator = myList.iterator(); iterator.hasNext(); ) {
            Student next =  iterator.next();
            System.out.println(next);
        }
    }
}
