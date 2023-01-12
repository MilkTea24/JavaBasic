package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        set.add(new Member("김철수", 30));

        System.out.println(set.size());
    }
}
