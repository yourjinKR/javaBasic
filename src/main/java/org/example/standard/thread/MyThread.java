package org.example.standard.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
