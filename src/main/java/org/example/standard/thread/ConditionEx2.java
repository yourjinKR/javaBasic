package org.example.standard.thread;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionEx2 {

    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5);

        Runnable producer = () -> {
            try {
                for (int i = 0; i < 50; i++) {
                    int v = (int)(Math.random() * 1000);
                    buffer.put(v);
                    System.out.println(Thread.currentThread().getName() + " P -> " + v + " (size=" + buffer.size() + ")");
                    Thread.sleep(20);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 0; i < 50; i++) {
                    int v = buffer.take();
                    System.out.println(Thread.currentThread().getName() + " C <- " + v + " (size=" + buffer.size() + ")");
                    Thread.sleep(35);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(producer, "producer-1").start();
        new Thread(producer, "producer-2").start();
        new Thread(consumer, "consumer-1").start();
        new Thread(consumer, "consumer-2").start();
    }

    // 다중 슬롯
    static class BoundedBuffer<T> {

        private final Lock lock = new ReentrantLock();
        private final Condition notEmpty = lock.newCondition();
        private final Condition notFull = lock.newCondition();

        private final Deque<T> q = new ArrayDeque<>();
        private final int capacity;


        BoundedBuffer(int capacity) {
            this.capacity = capacity;
        }

        public void put(T item) throws InterruptedException {
            lock.lock();
            try {
                while (q.size() == capacity) {
                    notFull.await();
                }
                q.addLast(item);
                notEmpty.signal();
            } finally {
                lock.unlock();
            }
        }

        public T take() throws InterruptedException {
            lock.lock();
            try {
                while (q.isEmpty()) {
                    notEmpty.await();
                }
                T item = q.removeFirst();
                notFull.signal(); // 생산자 1명 깨우기
                return item;
            } finally {
                lock.unlock();
            }
        }

        public int size() {
            lock.lock();
            try {
                return q.size();
            } finally {
                lock.unlock();
            }
        }
    }
}
