package ch18.sec06;

import java.io.*;

public class CharcaterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("D:\\만재\\휴학학기\\JAVA\\test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("D:\\만재\\휴학학기\\JAVA\\test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];

        StringBuilder sb = new StringBuilder();
        while (true) {
            int num = reader.read(data);
            if (num == -1) break;

            for (int i = 0; i < num; i++) {
                sb.append(data[i]);
            }
        }
        return sb.toString();
    }
}
