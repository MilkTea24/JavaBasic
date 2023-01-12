package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args){
        int operandNumbers = 2;
        if (args.length != operandNumbers) {
            System.out.println(operandNumbers + "개의 수만 입력해야 합니다");
            System.exit(0);
        }

        int[] intArr = new int[operandNumbers];
        int sum = 0;
        try {
            for (int i = 0; i < operandNumbers; i++){
                intArr[i] = Integer.parseInt(args[i]);
                sum += intArr[i];
            }
        }
        catch (NumberFormatException ex){
            System.out.println("숫자만 입력해 주세요");
            System.exit(0);
        }

        System.out.println(operandNumbers + "개 수의 합은 " + sum);
    }
}
