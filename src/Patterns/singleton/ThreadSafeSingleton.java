package Patterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }
    //can be implemented to the method or synchronized block; tells the thread to wait and checks if they are being used by somebody else (?)

    /*creating a method*/
    public static synchronized ThreadSafeSingleton getInstance(){
     if (instance == null){
         instance = new ThreadSafeSingleton();
     }
     return instance;
    }
    //Double-checked locking principle
    public static ThreadSafeSingleton getInstance2(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class){
            if (instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
    }
}
