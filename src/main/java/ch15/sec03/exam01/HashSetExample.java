package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("java");
        set.add("spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
