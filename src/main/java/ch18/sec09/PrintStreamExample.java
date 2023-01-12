package ch18.sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\만재\\휴학학기\\JAVA\\printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("""
                마치 프린터가 출력하는 것처럼
                데이터를 출력합니다.
                """);

        ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
    }
}
