package ch11.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args){
        try {
            Class.forName("java.lang.String");
            System.out.println("이 클래스가 존재합니다.");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("ads");
            System.out.println("이 클래스가 존재합니다.");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
