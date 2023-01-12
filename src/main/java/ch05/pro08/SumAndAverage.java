package ch05.pro08;

public class SumAndAverage {
    public static void main(String[] args){
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        Calculator myCal = Calculator.getInstance();
        double[] results = myCal.calculateSumAndAverage(array);
        System.out.println(results[0] + " " + results[1]);
    }
}
