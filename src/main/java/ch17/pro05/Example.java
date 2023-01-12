package ch17.pro05;

import java.util.*;

public class Example {
    public static void main(String[] args){
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        list.stream()
                .filter(str -> str.toLowerCase().contains("java"))
                .forEach(str -> System.out.println(str));
    }
}
