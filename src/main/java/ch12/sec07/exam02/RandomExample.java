package ch12.sec07.exam02;

import java.util.Random;
import java.util.Arrays;

public class RandomExample {
    public static void main(String[] args){
        int[] selectNumber = new int[6];
        Random random = new Random();
        System.out.print("선택번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }

        int[] winningNumber = new int[6];
        random = new Random();
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);

        if (result) {
            System.out.println("1등");
        } else {
            System.out.println("당첨X");
        }
    }
}
