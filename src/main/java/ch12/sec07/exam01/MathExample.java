package ch12.sec07.exam01;

public class MathExample {
    public static void main(String[] args){
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.floor(5.3));

        System.out.println(Math.max(3,7));
        System.out.println(Math.min(3,7));

        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v5 = temp2 / 100.0;
        System.out.println(v5);

    }
}
