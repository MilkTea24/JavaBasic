package ch13.pro04;

public class UtilExample {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        Integer age2 = Util.getValue(pair, "ㅎㅇㅁ");
        System.out.println(age2);

        ChildPair<String, Integer> childPair = new ChildPair<>("ㅁ", 19);
        Integer age3 = Util.getValue(childPair, "ㅁ");
        System.out.println(age3);
    }
}
