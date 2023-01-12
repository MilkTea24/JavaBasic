package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args){
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1.equals(strVar2));

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar3 == strVar4);
        System.out.println(strVar3.equals(strVar4));

        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1', '3' -> System.out.println("남자");
            case '2', '4' -> System.out.println("여자");
        }

        int length = ssn.length();
        if (length == 13) {
            System.out.println("13자리 수가 맞습니다.");
        }

        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);

        String ssn2 = "880815-1234567";
        String firstNum = ssn2.substring(0,6);
        String secondNum = ssn2.substring(7);

        System.out.println(firstNum);
        System.out.println(secondNum);

        String subject = "자바 프로그래밍";
        int location = subject.indexOf("자바");

        if (location != -1) {
            System.out.println("위치는 " + location);
        }
        else {
            System.out.println("존재하지 않음");
        }

        boolean isExist = subject.contains("자바");
        System.out.println(isExist);

        String numbers = "1,2,3,4,5,6";
        String[] numberArray = numbers.split(",");

        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }
    }
}
