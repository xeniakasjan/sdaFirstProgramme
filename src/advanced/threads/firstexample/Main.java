package advanced.threads.firstexample;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Bread("one")); //creating a new class object and passing another object into it
        Thread t2 = new Thread(new Bread("two"));
        Thread t3 = new Thread(new Bread("three"));
        Thread t4 = new Thread(new Bread("four"));


        //to start the 'workers' to work we have to call the method
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
