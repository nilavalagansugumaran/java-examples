package com.example.threads;

public class SimpleThreadsExample {

    public void startAThreadUsingRunnable() {

        //How to create a logic that runs on a separate thread
        Runnable task = () -> {
            System.out.println("New thread starts .. name is === " + Thread.currentThread().getName());
            MainThread.sleep(2);
            System.out.println("New thread ends.. name is === " + Thread.currentThread().getName());
        };
        //How to start a thread
        Thread thread = new Thread(task);
        thread.start();
    }
}
