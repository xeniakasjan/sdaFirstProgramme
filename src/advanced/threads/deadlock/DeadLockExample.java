package advanced.threads.deadlock;

public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {

        String r1 = "r1";
        String r2 = "r2";

        //1st Thread
        Thread t1 = new Thread(){
            @Override
            public void run() {

                 synchronized (r1){
                     System.out.println("This is thread #1 Locked String r1");
                     try {
                         Thread.sleep(100);
                     } catch (Exception e) {

                     }
                     synchronized (r2) {
                         System.out.println("Thread #1 locked String r2");
                     }
                 }


            }
        };

        //2nd Thread
Thread t2 = new Thread(){
    @Override
    public void run() {
        synchronized (r2){
            System.out.println("Thread #2 locked String 2");

            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
            synchronized (r1){
                System.out.println("Thread #2 locked String 1");
            }
        }

    }
};

t1.start();
t2.start();

t1.join();
t2.join();

        System.out.println("The end");




    }
}
