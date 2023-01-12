package ch13.pro04;

public class Util {
    public static <T extends Pair, K, V> V getValue(T pair, K key) {
        if (pair.getKey().equals(key)) {
            return (V)pair.getValue();
        } else return null;
    }
}
