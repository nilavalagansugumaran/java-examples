package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    private ExecutorService singleThreadPool;
    private ExecutorService fixedThreadPool;


    public ExecutorsExample() {
        this.singleThreadPool = Executors.newSingleThreadExecutor();
        this.fixedThreadPool = Executors.newFixedThreadPool(8);
    }

    public void runThreadsUsingSingleThreadPool(Runnable task){
        singleThreadPool.submit(task);
    }

    public void runThreadsUsingFixedThreadPool(Runnable task){
        fixedThreadPool.submit(task);
    }


    public void stopExecutors() {
        stopExec(singleThreadPool);
        stopExec(fixedThreadPool);
    }

    // You need this to shutdown the threads to exit your application
    private void stopExec(ExecutorService service) {

        try{
            System.out.println("Shutting down services");
            service.shutdown();
            service.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException ie) {

        } finally{

            if(!service.isTerminated()) {
                System.out.println("Not terminated yet");
            }
            service.shutdownNow();
            System.out.println("Shutdown complete");
        }

    }
}
