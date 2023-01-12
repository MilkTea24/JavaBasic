package ch04.sec05;

import java.util.*;

public class KeyControlExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int speed = 0;
        boolean flag = true;

        while (flag) {
            String str = scanner.nextLine();
            if (str.equals("1")) {
                speed++;
                System.out.println("속도는 " + speed);
            }
            else if (str.equals("2")) {
                speed--;
                System.out.println("속도는 " + speed);
            }
            else {
                flag = false;
                System.out.println("중지");
            }
        }
    }
}
