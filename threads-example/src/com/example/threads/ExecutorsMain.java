package com.example.threads;

import java.util.concurrent.TimeUnit;

public class ExecutorsMain {

    public static void main(String s[]) {

        System.out.println("Starting my application " + Thread.currentThread().getName());

        ExecutorsExample executorsExample = new ExecutorsExample();
        executorsExample.runThreadsUsingSingleThreadPool(createRunnable());
        executorsExample.runThreadsUsingSingleThreadPool(createRunnable());
        executorsExample.runThreadsUsingSingleThreadPool(createRunnable());
        executorsExample.runThreadsUsingSingleThreadPool(createRunnable());
        executorsExample.runThreadsUsingSingleThreadPool(createRunnable());

        executorsExample.stopExecutors();
        System.out.println("Ending my application " + Thread.currentThread().getName());
    }


    private static Runnable createRunnable() {

        //How to create a logic that runs on a separate thread
        Runnable task = () -> {
            System.out.println("New thread starts .. name is === " + Thread.currentThread().getName());
            MainThread.sleep(2);
            System.out.println("New thread ends.. name is === " + Thread.currentThread().getName());
        };

        return task;
    }
}

