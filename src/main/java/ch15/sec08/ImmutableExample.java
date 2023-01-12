package ch15.sec08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
    public static void main(String[] args){
        List<String> immutableList1 = List.of("A", "B", "C");

        Set<String> immutableSet1 = Set.of("A", "B", "C");

        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
    }
}
