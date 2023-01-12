package ch12.sec04.exam02;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while (true) {
           if (keyCode == 51) {
                    break;
           }
           if (keyCode != 0) System.out.println(keyCode);
           keyCode = System.in.read();
        }

    }
}
