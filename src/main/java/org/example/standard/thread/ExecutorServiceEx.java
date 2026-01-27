package org.example.standard.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Future<?> submit(Runnable task);
        executorService.submit(() -> {
            System.out.println("작업 실행");
        });

        // 미실행시 JVM 종료 불가
        executorService.shutdown();


        // Runnable vs Callable

        Runnable r = () -> {};

        Callable<Integer> c = () -> 1;

        Future<Integer> future = executorService.submit(() -> 10);

        Integer i = future.get(); // throws ExecutionException, InterruptedException


        // ThreadPool

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        ExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        // ThreadPoolExecutor

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                4, 8,
                60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100)
        );


    }
}
