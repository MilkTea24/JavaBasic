package ch05.pro08;

public class Calculator {
    private static Calculator calculator = new Calculator();

    private Calculator() {
    }

    static Calculator getInstance() {
        return calculator;
    }

    private double sumValue;
    private double averageValue;
    private int count;
    double[] calculateSumAndAverage(int[][] arrays) {
        sumValue = 0.0;
        count = 0;
        for (int[] array : arrays){
            for (int value : array) {
                sumValue += value;
                count++;
            }
        }
        averageValue = sumValue / count;

        return new double[]{sumValue, averageValue};
    }
}
