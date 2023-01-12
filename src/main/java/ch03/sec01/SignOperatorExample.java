package ch03.sec01;

import java.util.*;

public class SignOperatorExample {
    public static void main(String[] args){
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte k = 100;
        int y = -k;
        System.out.println("y: " + y);

        Scanner scanner = new Scanner(System.in);
        System.out.print("z: ");
        String strZ = scanner.nextLine();
        int z = Integer.parseInt(strZ);
        z = -z;
        System.out.println("-z: " + z);

        int a = 10;
        int b = 10;
        int c;

        a++;
        ++a;

        System.out.println("=================================");

        System.out.println("a= " + a);

        b--;
        --b;

        System.out.println("b= " + b);

        c = a++;
        System.out.println("c= " + c);
        System.out.println("a= " + a);

        c = ++a;
        System.out.println("c= " + c);
        System.out.println("a= " + a);

        c = ++a + b++;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}
