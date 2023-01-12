package ch16.pro08;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static double avg(Function<Student> function) {
        double totalScore = 0;
        for (int i = 0; i < students.length; i++) {
            totalScore += function.apply(students[i]);
        }
        return totalScore / students.length;
    }

    public static void main(String[] args){
        double englishAvg = avg( Student :: getEnglishScore);
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student :: getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
