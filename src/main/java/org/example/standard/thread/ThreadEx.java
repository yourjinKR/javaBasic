package org.example.standard.thread;

public class ThreadEx {
    public static void main(String[] args) {

        Thread thread = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();


        Thread thread2 = new MyThread();
        thread2.start();
        thread2.start(); // IllegalThreadStateException
    }
}
