package ch16.pro08;

@FunctionalInterface
public interface Function<T> {
    public double apply(T t);
}
