package org.example.standard.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    public static void main(String[] args) {

        AsyncWork asyncWork = new AsyncWork();
        ReentrantWork reentrantWork = new ReentrantWork();

        for (int i = 0; i < 100; i++) {
            asyncWork.increment();
        }

        System.out.println(asyncWork.getCount());

        for (int i = 0; i < 100; i++) {
            reentrantWork.increment();
        }

        System.out.println(reentrantWork.getCount());


    }


    static class AsyncWork {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }

    static class ReentrantWork {
        private int count = 0;
        private ReentrantLock lock = new ReentrantLock();

        public void increment() {
            lock.lock();
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }

        public int getCount() {
            return count;
        }
    }
}
