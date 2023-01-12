package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args){
        byte result1 = 10 + 20; //컴파일 단계에서 연산
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; //실행시 int타입으로 변환 후 연산 result2의 타입이 byte일 때 오류
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5; //타입 크기가 가장 큰 long 타입으로 변환 후 계산됨
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7; //char, byte는 int로 변환 후 연산
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4); //강제 형변환

        int v8 = 10;
        int result5 = v8 / 4; //정수 연산 결과는 정수
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0; //double 타입으로 형변환 후 연산
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7: " + result7);

        int result8 = 10 + 2 + 8;
        System.out.println("result8: " + result8);

        String result9 = 10 + 2 + "8";
        System.out.println("result9: " + result9);

        String result10 = 10 + "2" + 8;
        System.out.println("result10: " + result10);

        String result11 = "10" + 2 + 8;
        System.out.println("result11: " + result11);

        String result12 = "10" + (2 + 8);
        System.out.println("result12: " + result12);
    }
}
