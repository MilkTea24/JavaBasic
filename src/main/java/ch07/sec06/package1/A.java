package ch07.sec06.package1;

public class A {
    protected String field;

    protected A() {};

    protected void method() {};
}

class B {
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
}
