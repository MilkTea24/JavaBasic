package ch13.sec05.exam02;

public abstract class Units {
}

class Human extends Units {
    @Override
    public String toString() {
        return "Human";
    }
}

class Fairy extends Units {
    @Override
    public String toString() {
        return "Fairy";
    }
}

class Oak extends Units {
    @Override
    public String toString() {
        return "Oak";
    }
}
