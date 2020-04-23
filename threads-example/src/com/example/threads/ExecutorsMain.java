package com.example.threads;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ExecutorsMain {

    public static void main(String s[]) {

        System.out.println("Starting my application " + Thread.currentThread().getName());

        ExecutorsExample executorsExample = new ExecutorsExample();
        //Example 1
//        for(int i=0; i<2; i++) {
//            executorsExample.runThreadsUsingSingleThreadPool(createRunnable());
//        }

        //Example 2
//        for(int i=0; i< 12; i++) {
//            executorsExample.runThreadsUsingFixedThreadPool(createRunnable());
//        }

        //Example 3
//        for(int i=0; i< 12; i++) {
//           System.out.println( "Date from threads " + executorsExample.runThreadsUsingFixedThreadPoolForCallables(createCallable()));
//        }

        List<Callable<Date>> callables = Arrays.asList(createCallable(),createCallable(),createCallable(),
                createCallable(),createCallable(),createCallable());

        List<Date> dates = executorsExample.runThreadsUsingFixedThreadPoolForCallablesBatchProcessing(callables);

        System.out.println( "Dates from threads " + dates );

                executorsExample.stopExecutors();
        System.out.println("Ending my application " + Thread.currentThread().getName());
    }

    // Create runnable threads if you dont expect anything from the thread
    private static Runnable createRunnable() {

        //How to create a logic that runs on a separate thread
        Runnable task = () -> {
            System.out.println("Runnable..  New thread starts .. name is === " + Thread.currentThread().getName());
            MainThread.sleep(2);
            System.out.println("Runnable.. New thread ends.. name is === " + Thread.currentThread().getName());
        };

        return task;
    }

    // Create Callable threads if you expect return values from the thread
    private static Callable<Date> createCallable() {

        //How to create a logic that runs on a separate thread
        Callable<Date> task = () -> {
            System.out.println("Callable.. thread starts .. name is === " + Thread.currentThread().getName());
            MainThread.sleep(1);
            System.out.println("Callable.. thread ends.. name is === " + Thread.currentThread().getName());
            return new Date();
        };

        return task;
    }

    public static String threadName(){
        return Thread.currentThread().getName();
    }
}

