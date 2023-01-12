package ch02.sec13;

import java.util.Scanner; //scanner는 java.util패키지 내에 존재

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //스캐너 객체를 생성 후 변수에 담음

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine(); //사용자가 입력한 숫자를 문자로 받음
        int x = Integer.parseInt(strX); //문자를 숫자로 변환

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
