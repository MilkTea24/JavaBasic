package ch13.sec04;

public class GenericExample {
    public static <T extends Number, K extends Number> boolean compare(T t1, K t2) {
        System.out.println(t1.getClass().getSimpleName() + " " + t2.getClass().getSimpleName());

        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();

        return (value1 == value2);
    }

    public static void main(String[] args){
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(10.4, 10l);
        System.out.println(result2);
    }
}
