package ch12.sec04.exam01;

public class ErrExample {
    public static void main(String[] args){
        try {
            int value = Integer.parseInt("asf");
        } catch (NumberFormatException e) {
            System.err.print("에러 : ");
            System.err.println(e.getMessage());
        }
    }
}
