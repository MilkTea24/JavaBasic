package ch15.sec04.exam02;

import java.util.*;

public class HashtableExample {
    public static void main(String[] args){
        Map<String, Integer> map = new Hashtable<String, Integer>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    map.put(String.valueOf(i), i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++){
                    map.put(String.valueOf(i), i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) { }

        System.out.println("엔트리 수 : " + map.size());
    }
}
