package ch13.sec02.exam03;

public class Box<T> {
    public T content;

    public boolean compare(Box<T> target){
        return content.equals(target.content);
    }
}
