package ch15.pro08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1, "KIM"));
        set.add(new Student(2, "KIM"));
        set.add(new Student(1, "LEE"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            System.out.println(temp.studentNum + "-" + temp.name);
        }
    }
}
