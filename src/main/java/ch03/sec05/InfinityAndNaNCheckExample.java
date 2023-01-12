package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args){
        int x = 5;
        double y = 0.0;
        double z = x / y;

        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("숫자가 아님");
        }
        else System.out.println(z + 2);
    }
}
