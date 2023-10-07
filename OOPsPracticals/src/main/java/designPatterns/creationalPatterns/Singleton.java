package designPatterns.creationalPatterns;

public class Singleton {
    public static void main(String[] args) {
        {
            //Eager
            System.out.println("Eager singletonInstance1 : "+ EagerSingleton.getEagerInstance());
            System.out.println("Eager singletonInstance2 : "+ EagerSingleton.getEagerInstance());
            System.out.println("Eager singletonInstance1.equals(singletonInstance2) : "+ EagerSingleton.getEagerInstance().equals(EagerSingleton.getEagerInstance()));
            //lazy
            System.out.println("\nLazy singletonInstance1 : "+ LazySingleton.getLazySingleton());
            System.out.println("Lazy singletonInstance2 : "+LazySingleton.getLazySingleton());
            System.out.println("Lazy singletonInstance1.equals(singletonInstance2) : "+ LazySingleton.getLazySingleton().equals(LazySingleton.getLazySingleton()));
            //synchronized method
            System.out.println("\nSynchronized Method singletonInstance1 : "+ ThreadSafeSynchronizedMethodSingleton.getThreadSafeSynchronizedMethodSingleton());
            System.out.println("Synchronized Method singletonInstance2 : "+ ThreadSafeSynchronizedMethodSingleton.getThreadSafeSynchronizedMethodSingleton());
            System.out.println("Synchronized Method singletonInstance1.equals(singletonInstance2) : "+ ThreadSafeSynchronizedMethodSingleton.getThreadSafeSynchronizedMethodSingleton().equals(ThreadSafeSynchronizedMethodSingleton.getThreadSafeSynchronizedMethodSingleton()));
            //synchronized block
            System.out.println("\nSynchronized block singletonInstance1 : "+ ThreadSafeSynchronizedBlockSingleton.getThreadSafeSynchronizedBlockSingleton());
            System.out.println("Synchronized block singletonInstance2 : "+ ThreadSafeSynchronizedBlockSingleton.getThreadSafeSynchronizedBlockSingleton());
            System.out.println("Synchronized block singletonInstance1.equals(singletonInstance2) : "+  ThreadSafeSynchronizedBlockSingleton.getThreadSafeSynchronizedBlockSingleton().equals( ThreadSafeSynchronizedBlockSingleton.getThreadSafeSynchronizedBlockSingleton()));
            //bill pugh
            System.out.println("\nBill Pugh singletonInstance1 : "+ BillPughSingleton.getInstance());
            System.out.println("Bill Pugh singletonInstance2 : "+ BillPughSingleton.getInstance());
            System.out.println("Bill Pugh singletonInstance1.equals(singletonInstance2) : "+ BillPughSingleton.getInstance().equals(BillPughSingleton.getInstance()));
            //enum
            System.out.println("\nEnum singletonInstance1 : "+ SingletonInstance.getSingletonInstance());
            System.out.println("Enum singletonInstance2 : "+ SingletonInstance.getSingletonInstance());
            System.out.println("Enum singletonInstance1.equals(singletonInstance2) : "+ SingletonInstance.getSingletonInstance().equals(SingletonInstance.getSingletonInstance()));

            //Initialization on Demand Holder Singleton

        }
    }

}
class EagerSingleton{
    private static final EagerSingleton eagerInstance = new EagerSingleton();
    private EagerSingleton(){
    }
    public static EagerSingleton getEagerInstance(){
        return eagerInstance;
    }

}
class LazySingleton{
    private static LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null)
            lazySingleton= new LazySingleton();
        return lazySingleton;
    }

}
class ThreadSafeSynchronizedMethodSingleton {
    private static ThreadSafeSynchronizedMethodSingleton threadSafeSynchronizedMethodSingleton;
    private ThreadSafeSynchronizedMethodSingleton(){}
    public static synchronized ThreadSafeSynchronizedMethodSingleton getThreadSafeSynchronizedMethodSingleton(){
        if(threadSafeSynchronizedMethodSingleton == null)
            threadSafeSynchronizedMethodSingleton = new ThreadSafeSynchronizedMethodSingleton();
        return threadSafeSynchronizedMethodSingleton;
    }

}
class ThreadSafeSynchronizedBlockSingleton{
    private static ThreadSafeSynchronizedBlockSingleton threadSafeSynchronizedBlockSingleton;
    private ThreadSafeSynchronizedBlockSingleton(){}
    public static ThreadSafeSynchronizedBlockSingleton getThreadSafeSynchronizedBlockSingleton(){
        if(threadSafeSynchronizedBlockSingleton == null){
            synchronized(ThreadSafeSynchronizedBlockSingleton.class){
                threadSafeSynchronizedBlockSingleton = new ThreadSafeSynchronizedBlockSingleton();
            }
        }
        return threadSafeSynchronizedBlockSingleton;
    }

}
class BillPughSingleton{
    private BillPughSingleton(){}
    private static class SingletonHelper{
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.billPughSingleton;
    }
}
enum SingletonInstance{
    SINGLETON_INSTANCE;
    public static SingletonInstance getSingletonInstance(){
        return SINGLETON_INSTANCE;
    }
}
