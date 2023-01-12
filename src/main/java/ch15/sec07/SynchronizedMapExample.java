package ch15.sec07;

import java.util.*;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 11; i <= 20; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadB.join();
            threadA.join();
        } catch (InterruptedException e) {}

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
