package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args){
        int[] scores;

        scores = new int[] {90, 95, 100};
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++){
            sum1 += scores[i];
        }
        System.out.println(sum1);

        printItem(new int[]{60, 24, 13, 84});

        //=============================================

        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++){
            System.out.println(i + " : " + arr1[i]);
            arr1[i] = 10 * (i + 1);
        }

        for (int i = 0; i < arr1.length; i++){
            System.out.println(i + " : " + arr1[i]);
        }
    }

    public static void printItem(int[] scores){
        for (int i = 0; i < scores.length; i++){
            System.out.println(i + " : " + scores[i]);
        }
    }
}
