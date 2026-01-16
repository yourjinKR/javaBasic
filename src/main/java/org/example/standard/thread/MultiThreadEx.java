package org.example.standard.thread;

import javax.swing.JOptionPane;

public class MultiThreadEx {
    public static void main(String[] args) {
        Thread thread = new CounterThread();
        thread.start();

        String input = JOptionPane.showInputDialog("아무거나 입력");
        System.out.println("입력값 : " + input);
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
