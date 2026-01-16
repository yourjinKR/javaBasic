package org.example.standard.thread;

public class Starvation {
    public static void main(String[] args) {
        Runnable lowPriorityTask = () -> {
            while (true) {
                System.out.println("Low priority thread running...");
            }
        };

        Runnable highPriorityTask = () -> {
            while (true) {
                System.out.println("High priority thread running...");
            }
        };

        Thread low = new Thread(lowPriorityTask);
        Thread high = new Thread(highPriorityTask);

        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        high.start();
    }
}
