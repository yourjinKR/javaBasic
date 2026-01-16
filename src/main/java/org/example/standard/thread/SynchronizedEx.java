package org.example.standard.thread;

public class SynchronizedEx {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public void incrementByBlock() {
        synchronized (this) {
            count++;
        }
    }

    public static void main(String[] args) {

    }
}