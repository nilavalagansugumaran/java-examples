package com.example.threads;

import java.util.concurrent.TimeUnit;

public class MainThread {

    public static void main(String s[]) {

        System.out.println("Starting my application");

        System.out.println("Current thread name is === " + Thread.currentThread().getName());

        sleep(20);
        System.out.println("Ending my application");
    }

    // to pause the current thread
    private static void sleep(int seconds) {

        try{

            System.out.println("Current thread " + Thread.currentThread().getName() + " is going to pause for " + seconds + " seconds");
           // TimeUnit.SECONDS.sleep(seconds);
            Thread.sleep(seconds * 1000); // if you want to use threads class
        } catch(InterruptedException e) {

        }
    }
}
