package ch05.pro09;

import java.util.*;

public class ScoreAnalysisProgram {
    private static ScoreAnalysisProgram scoreAnalysisProgram = new ScoreAnalysisProgram();

    private ScoreAnalysisProgram(){};

    static ScoreAnalysisProgram getInstance(){
        return scoreAnalysisProgram;
    }

    private int studentsNumber;
    private int[] scores;
    private boolean programRunning;
    private static Scanner scanner = new Scanner(System.in);
    private final static String infoString = """
            -------------------------------------------------
            1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
            -------------------------------------------------
            """;

    public void programMain(){
        startProgram();
        while (programRunning){
            System.out.println(infoString);
            int Mode = inputModes();
            switch (Mode) {
                case 1 -> inputStudentsNumber();
                case 2 -> inputStudentsScores();
                case 3 -> showStudentsScores();
                case 4 -> analysisStudentsScores();
                default -> programRunning = false;
            }
        }

        System.out.println("프로그램 종료");
        System.exit(1);
    }

    private void startProgram(){
        programRunning = true;
    }

    private int inputModes(){
        System.out.print("선택> ");
        String strMode = scanner.nextLine();
        try {
            int mode = Integer.parseInt(strMode);
            return mode;
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            return 0;
        }
    }

    private void inputStudentsNumber(){
        System.out.print("학생수> ");
        String strStudentsNumber = scanner.nextLine();
        try {
            studentsNumber = Integer.parseInt(strStudentsNumber);
            scores = new int[studentsNumber];
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            programRunning = false;
        }
    }

    private void inputStudentsScores(){
        for (int i = 0; i < studentsNumber; i++) {
            System.out.print("scores[" + i + "] : ");
            String strScore = scanner.nextLine();
            try {
                scores[i] = Integer.parseInt(strScore);
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                programRunning = false;
                break;
            }
        }
    }

    private void showStudentsScores(){
        int count = 0;
        for (int score : scores){
            System.out.println("scores[" + count++ + "] : " + score);
        }
    }

    private void analysisStudentsScores(){
        int maxValue = 0;
        int sum = 0;
        int count = 0;
        for (int score : scores) {
            count++;
            sum += score;
            if (maxValue < score) maxValue = score;
        }
        double average = (double) sum / count;
        System.out.println("최고 점수: " + maxValue);
        System.out.println("평균 점수: " + average);
    }
}
