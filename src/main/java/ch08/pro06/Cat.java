package ch08.pro06;

public class Cat extends Animal implements Soundable {
    @Override
    public String sound(){
        return "야옹";
    }
}
