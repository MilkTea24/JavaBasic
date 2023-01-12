package ch05.sec07;

import java.util.*;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args){
        int[][] scores = {
                {90, 84, 60},
                {70, 95}
        };

        double[] classAverage = new double[scores.length];
        double totalClassSum = 0.0;
        int totalClassStudent = 0;
        for (int i = 0; i < scores.length; i++){
            double classSum = 0.0;
            for (int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j] + " ");
                classSum += scores[i][j];
            }
            classAverage[i] = classSum / scores[i].length;
            System.out.println();

            totalClassSum += classSum;
            totalClassStudent += scores[i].length;
        }

        for (int i = 0; i < classAverage.length; i++){
            System.out.println((i + 1) + "반의 평균은 " + classAverage[i]);
        }

        double totalClassAverage = totalClassSum / totalClassStudent;
        System.out.println("전체 인원은 " + totalClassStudent + "\n전체 평균은 " + totalClassAverage);

        //============================================================
        int[][] scores2 = new int[2][];
        scores2[0] = new int[2];
        scores2[1] = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("1반 학생 2명, 2반 학생 2명 성적 입력 : ");
        String[] str = scanner.nextLine().split(" ");

        int ind = 0;
        try {
            for (int i = 0; i < scores2.length; i++) {
                for (int j = 0; j < scores2[i].length; j++) {
                    scores[i][j] = Integer.parseInt(str[ind++]);
                    System.out.println(scores[i][j]);
                }
            }
        }
        catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }
}
