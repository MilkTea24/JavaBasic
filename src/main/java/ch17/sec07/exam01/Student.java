package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student stu) {
        return Integer.compare(score, stu.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}
