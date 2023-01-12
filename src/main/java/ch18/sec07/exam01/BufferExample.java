package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\만재\\휴학학기\\JAVA\\도지코인.png");
        FileOutputStream fos = new FileOutputStream("D:\\만재\\휴학학기\\JAVA\\도지코인버퍼없음.png");

        long nonBufferTime = copy(fis, fos);
        System.out.println(nonBufferTime + "ns - 버퍼 없음");

        fis.close();
        fos.close();

        fis = new FileInputStream("D:\\만재\\휴학학기\\JAVA\\도지코인.png");
        fos = new FileOutputStream("D:\\만재\\휴학학기\\JAVA\\도지코인버퍼있음.png");

        BufferedInputStream bfis = new BufferedInputStream(fis);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        long bufferTime = copy(bfis, bfos);
        System.out.println(bufferTime + "ns - 버퍼 있음");
    }

    public static long copy(InputStream fis, OutputStream fos) throws Exception {
        long startTime = System.nanoTime();

        fis.transferTo(fos);

        long endTime = System.nanoTime();

        return endTime - startTime;
    }
}
