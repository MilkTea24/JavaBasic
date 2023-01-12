package ch17.sec07.exam02;

import java.util.*;

public class SortingExample {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        studentList.stream()
                .sorted((a, b) -> Integer.compare(a.getScore(), b.getScore()))
                .forEach(student -> System.out.println(student));

        studentList.stream()
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .forEach(student -> System.out.println(student));
    }
}
