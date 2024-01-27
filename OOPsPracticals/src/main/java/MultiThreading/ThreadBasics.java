package MultiThreading;

import java.util.concurrent.*;

public class ThreadBasics {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Extending the Thread class:
        ThreadsViaRunnable threadsViaRunnable = new ThreadsViaRunnable();
        Thread thread1 = new Thread(threadsViaRunnable,"thread1");
        thread1.start();

        //implementing runnable interface
        ThreadsViaThreadClass threadsViaThreadClass = new ThreadsViaThreadClass();
        threadsViaThreadClass.setName("thread2");
        threadsViaThreadClass.start();

        //anonymous class
        Thread thread3 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        },"thread3");
        thread3.start();

        // lambda expressions
        Thread thread4 = new Thread(()->
                System.out.println(Thread.currentThread().getName()) //run() method
        ,"thread4");
        thread4.start();

        //ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });

        //callable
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> future = es.submit(new CallableDemo());
        System.out.println("Callable Future : "+future.get());

        ExecutorService e = Executors.newFixedThreadPool(1);
        System.out.println("Callable future lambda : "+e.submit(()->{Thread.currentThread().getName() ;//call method
                                                                    }));
        System.out.println("Callable anonymous call : "+e.submit(new Callable<String>() {
            @Override
            public String call(){
                return Thread.currentThread().getName();
            }
        }));

        //CompletableFuture for void
        CompletableFuture.runAsync(()->{
            System.out.println("CompletableFuture.runAsync : "+Thread.currentThread().getName());
        });

        //CompletableFuture for returning value
        CompletableFuture<String> s = CompletableFuture.supplyAsync(()->
             Thread.currentThread().getName()
        );
        System.out.println("CompletableFuture.supplyAsync : "+s.get());
    }
}


class ThreadsViaRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadsViaThreadClass extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
class CallableDemo implements Callable<String>{

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }
}