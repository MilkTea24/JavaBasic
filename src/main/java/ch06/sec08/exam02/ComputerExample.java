package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args){
        Computer myCom = new Computer();

        int result1 = myCom.sum(2, 3);
        System.out.println(result1);

        int result2 = myCom.sum(2, 3, 4, 5, 6);
        System.out.println(result2);

        int result3 = myCom.sum(new int[] {2, 3, 4, 5, 6});
        System.out.println(result3);
    }
}
