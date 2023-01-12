package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");

        //자바 13부터 지원
        String str1 = """
                {
                    "이스케이프 문자를 쓰지 않아도
                    마음대로 문자열을 작성 가능."
                }
                """;

        //자바 14부터 지원
        String str2 = """
                {
                    텍스트 블록에서 출력에 줄바꿈을 하고 싶지 않을때는 \
                    를 붙여주면 된다
                }
                """;
        System.out.println(str1);
        System.out.println(str2);
    }
}
