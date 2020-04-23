package com.example.threads;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.*;

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

    public Date runThreadsUsingFixedThreadPoolForCallables(Callable<Date> task){

        Future<Date> future = fixedThreadPool.submit(task);

        System.out.println(ExecutorsMain.threadName() +" Is done ??? " + future.isDone());
        try{
            return future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException ie) {

            ie.printStackTrace();
        }

        return null;
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
            service.awaitTermination(5, TimeUnit.SECONDS);
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
