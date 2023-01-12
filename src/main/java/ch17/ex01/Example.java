package ch17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args){
        int[] intArray = {10, 34, 100231, 12321, 243, 41234};
        Arrays.stream(intArray)
                .mapToObj(number -> Integer.toString(number))
                .filter(number -> number.startsWith("1"))
                .forEach(number -> System.out.println(number));

        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(25, "a"));
        memberList.add(new Member(16, "b"));
        memberList.add(new Member(26, "c"));
        memberList.add(new Member(34, "d"));

        double age = memberList.stream()
                .mapToInt(member -> member.getAge())
                .average()
                .getAsDouble();
        System.out.println(age);
    }
}
