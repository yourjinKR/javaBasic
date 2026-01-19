package org.example.standard.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassEx {
    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger(0);
        int value = count.incrementAndGet();
        System.out.println(value);
    }
}
