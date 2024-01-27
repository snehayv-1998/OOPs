package MultiThreading;

import java.util.TreeMap;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException{
       Demo d1 = new Demo();
       Demo d2 = new Demo();
     /*
      There are 2 threads that are calling 2 different static methods:
      Since this share same class lock , after 1 thread finishes the work other enters the synchronized block.
      */
       Thread thread1 = new Thread(()->{
           try {
               d1.m3();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       },"thread1");
       Thread thread2 = new Thread(()->{
           try {
               d1.m3();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        },"thread2");

       thread1.start();
       thread2.start();

       /*There are 2 threads that are calling 2 different sync method:
        Since this share different instance lock ,they are not blocking to each other.
        */
        Thread thread3 = new Thread(()->{
            try {
                d1.m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"thread3");
        Thread thread4 = new Thread(()->{
            try {
                d2.m1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
         /*  try {
               d2.m2();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }*/
        },"thread4");
        thread3.start();
        thread4.start();
    }
}
class Demo {
    synchronized void m1() throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("synchronized m1 : "+ name);
        for (int i =0;i<10;i++){
            System.out.println(name+": "+i);
        }
        Thread.sleep(2000);
    }
    synchronized void m2() throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("synchronized m2 : "+ name);
        for (int i =0;i<10;i++){
            System.out.println(name+": "+i);
        }
        Thread.sleep(2000);
    }
    static synchronized void m3() throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("synchronized m3 : "+ name);
        for (int i =0;i<10;i++){
            System.out.println(name+": "+i);
        }
        Thread.sleep(2000);
    }
}
