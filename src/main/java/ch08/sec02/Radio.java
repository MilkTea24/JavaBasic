package ch08.sec02;

public class Radio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("라디오를 켭니다.");
    }
}
