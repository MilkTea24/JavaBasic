package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args){
        int randomValue = (int) (Math.random() * 3) + 1;
        switch(randomValue) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("error");
        }

        char grade = 'A';
        switch(grade) {
            case 'A', 'a' -> System.out.println("우수");
            case 'B', 'b' -> System.out.println("보통");
            case 'C' , 'c' -> System.out.println("미흡");
        }

        int score = 85;
        int plusScore = switch(grade) {
            case 'A', 'a' -> {
                int finalscore = score + 5;
                yield finalscore;
            }
            case 'B', 'b' -> {
                int finalscore = score + 2;
                yield finalscore;
            }
            default -> score;
        };
        System.out.println("totalScore is " + plusScore);
    }
}
