package ch18.pro10;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원본 파일 경로: ");
        String originalFilePath = scanner.nextLine();
        System.out.println("복사 파일 경로: ");
        String copyFilePath = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(copyFilePath, "\\");
        int totalDirs = st.countTokens();
        int count = 1;
        String copyFileDirPath = "";
        while (st.hasMoreTokens()) {
            copyFileDirPath += st.nextToken();
            if (++count == totalDirs) break;
            copyFileDirPath += "\\";
        }
        File originalFile = new File(originalFilePath);
        if (!originalFile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            System.exit(0);
        }

        File copyFileDir = new File(copyFileDirPath);
        if (!copyFileDir.exists()) {
            copyFileDir.mkdirs();
        }
        File copyFile = new File(copyFilePath);
        if (!copyFile.exists()) {
            copyFile.createNewFile();
        }
        FileInputStream fis = new FileInputStream(originalFilePath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(copyFilePath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bis.transferTo(bos);
        System.out.println("복사가 잘 되었습니다.");
    }
}
