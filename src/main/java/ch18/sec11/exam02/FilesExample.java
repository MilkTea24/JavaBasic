package ch18.sec11.exam02;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.Charset;

public class FilesExample {
    public static void main(String[] args){
        try {
            String data = "" +
                    "id: winter\n" +
                    "email: winter@mycompany.com\n" +
                    "tel: 010-123-1234";

            Path path = Paths.get("D:\\만재\\휴학학기\\JAVA\\user.txt");

            Files.writeString(Paths.get("D:\\만재\\휴학학기\\JAVA\\user.txt"), data,
                Charset.forName("UTF-8"));

            System.out.println("파일 유형: " + Files.probeContentType(path));
            System.out.println("파일 크기: " + Files.size(path) + " bytes");

            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
