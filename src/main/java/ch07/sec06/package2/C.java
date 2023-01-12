package ch07.sec06.package2;

import ch07.sec06.package1.*;

public class C extends A {
    public C() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }
}
