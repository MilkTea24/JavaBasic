package ch17.pro07;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args){
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(member -> member.getJob().equals("개발자"))
                .toList();
        developers.stream().forEach(member -> System.out.println(member.getName()));

        Map<String, List<Member>> map = list.stream()
                .collect(
                        Collectors.groupingBy(member -> member.getJob())
                );

        Set<Entry<String, List<Member>>> entrySet = map.entrySet();
        for (Entry<String, List<Member>> entry : entrySet) {
            System.out.println("[" + entry.getKey() + "]");
            for (Member member : entry.getValue()) {
                    System.out.println("{name: " + member.getName() + ", job: " + member.getJob() + "}");
            }
        }
    }
}
