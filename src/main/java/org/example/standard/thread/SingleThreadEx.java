package org.example.standard.thread;

import javax.swing.JOptionPane;

// 단일 스레드
public class SingleThreadEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무거나 입력");
        System.out.println("입력값 : " + input);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
