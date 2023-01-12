package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        String key = "홍길동";

        System.out.println(key + ": " + map.get(key));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String temp = iter.next();
            Integer value = map.get(temp);
            System.out.println(temp + ": " + value);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> iter2 = entrySet.iterator();
        while (iter2.hasNext()) {
            Entry<String, Integer> tempEntry = iter2.next();
            String tempEntryKey = tempEntry.getKey();
            Integer tempEntryValue = tempEntry.getValue();
            System.out.println(tempEntryKey + ": " + tempEntryValue);
        }

        map.remove("홍길동");
        System.out.println("entry 수 : " + map.size());

    }
}
