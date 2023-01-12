package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args){
        int[] scores = {80, 52, 74, 78, 85};
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        System.out.println("총합 : " + sum);
    }
}
