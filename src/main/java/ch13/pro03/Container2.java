package ch13.pro03;

public class Container2<T,K> {
    T content1;
    K content2;

    void set(T obj1, K obj2) {
        content1 = obj1;
        content2 = obj2;
    }

    T getKey() {
        return content1;
    }

    K getValue() {
        return content2;
    }
}
