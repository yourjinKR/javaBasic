package org.example.standard.thread;

public class VolatileEx {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();

        t1.start();
        t2.start();

        Thread.sleep(1);
        StopFlag.stop = true;
    }

    static class CustomThread extends Thread {
        @Override
        public void run() {
            int count = 0;

            while (!StopFlag.stop) {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
                count++;
                System.out.println(count + "바퀴");
            }
            System.out.println("종료");


        }
    }

    static class StopFlag {
        static volatile boolean stop = false;
    }
}
