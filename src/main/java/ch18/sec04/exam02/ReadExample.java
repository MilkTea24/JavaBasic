package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
    public static void main(String[] args){
        try {
            Reader reader = null;

            reader = new FileReader("D:\\만재\\휴학학기\\JAVA\\test.txt");

            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }

            reader.close();
            System.out.println();

            reader = new FileReader("D:\\만재\\휴학학기\\JAVA\\test.txt");
            char[] chars = new char[100];

            while (true) {
                int num = reader.read(chars);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(chars[i]);
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
