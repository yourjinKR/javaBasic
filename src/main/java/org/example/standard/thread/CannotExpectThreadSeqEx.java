package org.example.standard.thread;

public class CannotExpectThreadSeqEx {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("스레드 실행");
        });

        t.start();
        System.out.println("메인 종료");
    }
}
