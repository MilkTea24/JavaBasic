package ch13.pro02;

public class Container<T> {
    T content;

    void set(T obj) {
        content = obj;
    }

    T get() {
        return content;
    }
}
