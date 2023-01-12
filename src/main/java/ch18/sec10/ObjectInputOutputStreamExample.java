package ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\만재\\휴학학기\\JAVA\\object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Product m1 = new Product("노트북", 1500000);
        Product m2 = new Product("시계", 400000);
        int[] arr = {1, 2, 3};

        oos.writeObject(m1);
        oos.writeObject(m2);
        oos.writeObject(arr);

        oos.flush();    oos.close();    fos.close();

        FileInputStream fis = new FileInputStream("D:\\만재\\휴학학기\\JAVA\\object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Product m3 = (Product) ois.readObject();
        Product m4 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();    fis.close();
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(Arrays.toString(arr2));
    }
}
