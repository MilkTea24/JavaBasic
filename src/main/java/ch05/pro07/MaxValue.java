package ch05.pro07;

public class MaxValue {
    public static void main(String[] args){
        int[] array = {1, 5, 3, 8, 2};
        MaxValue obj = new MaxValue();
        int result = obj.returnMaxValue(array);
        int result2 = staticReturnMaxValue(array);

        System.out.println(result + " " + result2);
    }

    public int returnMaxValue(int[] intArray){
        int max = 0;
        for (int i = 0; i < intArray.length; i++){ 
            if (max < intArray[i]) max = intArray[i];
        }
        return max;
    }

    public static int staticReturnMaxValue(int ... intArray){
        int max = 0;
        for (int i = 0; i < intArray.length; i++){
            if (max < intArray[i]) max = intArray[i];
        }
        return max;
    }
}
