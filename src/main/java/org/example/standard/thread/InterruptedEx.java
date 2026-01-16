package org.example.standard.thread;

public class InterruptedEx {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("인터럽트 감지");
            }
        });

        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
