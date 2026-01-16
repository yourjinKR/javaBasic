package org.example.standard.thread;

public class JoinEx {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("스레드 실행");
        });

        System.out.println(1);
        t.start();
        t.join();
        System.out.println(2);

        t.interrupt();
    }
}
