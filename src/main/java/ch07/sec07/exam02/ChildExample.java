package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();

        child = (Child) parent;
        child.method1();
        child.method2();
        child.method3();
    }

}
