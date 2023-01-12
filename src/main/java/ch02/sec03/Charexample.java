package ch02.sec03;

public class Charexample {
    public static void main(String[] args) {
        char c1 = 'A'; //자바의 char는 2바이트 : 유니코드 저장가능
        char c2 = 65; //A는 65
        char c3 = '가';
        char c4 = 44032; //가는 44032
        char c5 = ' '; //char 변수 초기화 방법

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
