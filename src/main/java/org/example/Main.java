package org.example;


//public class Main -> 클래스 선언(파일 이름과 같아야함)
public class Main {
    //public static void main -> 메소드 선언(함수랑 비슷한 개념인듯)
    public static void main(String[] args) {
        String s = ";;;;;;;;;;;;;;;;;;;;;;;;;";
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i));
        }
        }
    }