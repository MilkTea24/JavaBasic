package ch08.pro06;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args){
    printSound(new Cat());
    printSound(new Dog());
    Cat cat = new Cat();
    cat.breath();
    Dog dog = new Dog();
    dog.breath();
    }
}

