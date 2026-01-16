package org.example.standard.thread;

public class DeadLock2 {

    // Thread-unsafe
    private volatile boolean running = true;

    void start() {
        new Thread(() -> {
            while (running) {}
            System.out.println("Stopped!");
        }).start();
    }

    // Change may not be visible to other thread
    void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        DeadLock2 t = new DeadLock2();
        t.start();

        // Short pause before stopping
        Thread.sleep(100);

        // Thread may not see this without volatile
        t.stop();
    }
}

