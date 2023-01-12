package ch12.sec03.exam02;

import java.util.HashSet;

public class HashCodeExample {
    public static void main(String[] args){
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));

        HashSet hashSet = new HashSet();

        Student s3 = new Student(1, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s4 = new Student(1, "홍길동");
        hashSet.add(s4);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s5 = new Student(2, "홍길동");
        hashSet.add(s5);
        System.out.println("저장된 객체 수: " + hashSet.size());
    }
}
