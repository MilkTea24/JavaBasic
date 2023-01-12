package ch04.pro07;

import java.util.*;

public class problem7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int money = 0;

        while(true){
            System.out.print("선택>");
            String inputValue = scanner.nextLine();
            if (inputValue.equals("1")) {
                System.out.print("예금액>");
                inputValue = scanner.nextLine();
                try {
                    money += Integer.parseInt(inputValue);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
            else if (inputValue.equals("2")) {
                System.out.print("출금액>");
                inputValue = scanner.nextLine();
                try {
                    money -= Integer.parseInt(inputValue);
                }
                catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
            else if (inputValue.equals("3")) {
                System.out.println("잔고> " + money);
            }

            else {
                System.out.println("프로그램 종료");
            }
        }
    }
}
