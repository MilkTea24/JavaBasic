package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            System.out.println(temp);
            if (temp.equals("jsp")) iterator.remove();
        }

        set.remove("jdbc");

        System.out.println();

        for (String s : set){
            System.out.println(s);
        }
    }
}
