package org.example.standard.thread;


import java.io.FilterOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueEx {


    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        queue.put(1);
        Integer take = queue.take();
        System.out.println(take);

        boolean offer = queue.offer(2);
        Integer poll = queue.poll();
        System.out.println(offer);
        System.out.println(poll);

        boolean offer1 = queue.offer(3, 1, TimeUnit.SECONDS);
        Integer poll1 = queue.poll(1, TimeUnit.SECONDS);
        System.out.println(offer1);
        System.out.println(poll1);

    }
}
