package ch12.pro10;

import java.lang.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i<= 10; i++) {
            stringBuilder.append(i + " ");
        }
        System.out.println(stringBuilder);
    }
}
