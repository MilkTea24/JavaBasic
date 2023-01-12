package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; //2진수
        int var2 = 0206; //8진수
        int var3 = 365; //10진수
        int var4 = 0xB3; //16진수

        long var5 = 10000000000L; //long 타입 값임을 컴파일러에게 알리기기
        byte var6 = 120; //byte범위를 초과하면 int를 byte로 변환할 수 없다고 에러가 뜸

       System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
        System.out.println("var6: " + var6);
    }
}
