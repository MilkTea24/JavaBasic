package ch14.sec07.exam01;

public class PrintThread extends Thread {
    private boolean stop;
    private long startTime = System.currentTimeMillis();
    private long processTime = 0;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            if (System.currentTimeMillis() - this.startTime > 500) {
                System.out.println("실행 중 : " + (processTime += 500));
                this.startTime = System.currentTimeMillis();
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
