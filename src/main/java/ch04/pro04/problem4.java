package ch04.pro04;

public class problem4 {
    public static void main(String[] args){
        int count = 1;
        while (true) {
            System.out.println(count + "번째 시도");
            int result1 = (int)(Math.random() * 6) + 1;
            int result2 = (int)(Math.random() * 6) + 1;
            System.out.println(result1 + " " + result2);
            if (result1 + result2 == 5) {
                System.out.println("종료");
                break;
            }
            count++;
        }
    }
}
