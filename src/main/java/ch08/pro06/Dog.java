package ch08.pro06;

public class Dog extends Animal implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}
