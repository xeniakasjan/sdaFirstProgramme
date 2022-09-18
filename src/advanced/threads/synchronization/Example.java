package advanced.threads.synchronization;

public class Example {
    public static void main(String[] args) {

    }

    public static void example() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                }
                //not finished - get the code later (!)
            }
        });
    }
}