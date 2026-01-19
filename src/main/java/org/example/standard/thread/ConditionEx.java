package org.example.standard.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionEx {
    public static void main(String[] args) {
        OneSlotBuffer buffer = new OneSlotBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i <= 20; i++) {
                    buffer.put(i);
                    System.out.println("P -> " + i);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    int v = buffer.take();
                    System.out.println("C <- " + v);
                    Thread.sleep(80);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }

    // 단일 버퍼 슬롯
    static class OneSlotBuffer {

        private final Lock lock = new ReentrantLock();
        private final Condition notEmpty = lock.newCondition();
        private final Condition notFull = lock.newCondition();

        private Integer slot = null;

        public void put(int value) throws InterruptedException {
            lock.lock();

            try {
                while (slot != null) { // 이미 차 있으면 대기
                    notFull.await();
                }
                slot = value;
                notEmpty.signal(); // 소비자 깨우기
            } finally {
                lock.unlock();
            }
        }

        public int take() throws InterruptedException {
            lock.lock();

            try {
                while (slot == null) { // 비어있으면 대기
                    notEmpty.await();
                }
                int value = slot;
                slot = null;
                notFull.signal(); // 생산자 깨우기
                return value;
            } finally {
                lock.unlock();
            }
        }


    }
}
