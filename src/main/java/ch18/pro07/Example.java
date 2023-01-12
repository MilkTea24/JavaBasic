package ch18.pro07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\만재\\휴학학기\\JAVA\\Projects\\JavaPractice\\src\\main\\java\\ch18\\sec08\\" +
                "DataInputOutputStreamExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(++rowNumber + " " + rowData);
        }
    }
}
