package ch07.sec03;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("자식 생성자 실행");
    }
}
