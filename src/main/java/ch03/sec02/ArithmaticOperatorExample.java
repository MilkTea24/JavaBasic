package ch03.sec02;

public class ArithmaticOperatorExample {
    public static void main(String[] args){
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; //byte 변수는 연산시 int로 자동 변환
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4; //long 피연산자가 존재할 시 나머지 피연산자도 모두 long타입으로 변경
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2; //double 피연산자가 존재할 시  연산결과는 double
        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
}
