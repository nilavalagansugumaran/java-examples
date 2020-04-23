package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    private ExecutorService singleThreadPool;

    public ExecutorsExample() {
        this.singleThreadPool = Executors.newSingleThreadExecutor();
    }

    public void runThreadsUsingSingleThreadPool(Runnable task){
        singleThreadPool.submit(task);
    }

    public void stopExecutors() {
        stopExec(singleThreadPool);
    }

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
