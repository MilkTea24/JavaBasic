package ch06.sec08.exam04;

public class CaculatorExample {
    public static void main(String[] args){
        Calculator myCal = new Calculator();

        double result1 = myCal.areaRectangle(4.0);
        System.out.println(result1);

        double result2 = myCal.areaRectangle(4.0, 5.0);
        System.out.println(result2);
    }
}
