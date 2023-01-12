package ch13.sec05.exam02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args){
        List<Units> list = new ArrayList<Units>();
        list.add(new Human());
        list.add(new Fairy());
        printCollection(list);

        List<?> list2 = new ArrayList<String>();
        //list2.add(new String());
    }

    static void printCollection(List<? extends Units> c) {
            for (Units e : c) {
                System.out.println(e);
            }
    }
    static void printCollection3(List<? extends Units> c) {
            for (Units e : c) {}
    }
    static void addElement(List<? super Units> c) {
        c.add(new Oak());
        c.add(new Fairy());
    }
    static void printCollection2(List<Number> c) {
        for (Number e : c) {
            System.out.println(e);
        }
    }
}
