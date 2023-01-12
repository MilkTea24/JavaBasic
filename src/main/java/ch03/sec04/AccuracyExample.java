package ch03.sec04;

public class AccuracyExample {
    public static void main(String[] args){
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("잘못된 사과 1개에서 남은 양: " + result);

        double trueresult = 10*apple - number*(10*pieceUnit);
        System.out.println("정확한 사과 1개에서 남은 양: " + trueresult/10);

    }
}
