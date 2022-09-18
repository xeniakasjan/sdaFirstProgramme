package advanced.threads.firstexample;

import java.util.Random;
import java.util.concurrent.ExecutionException;

//interface is a template of creating a class
public class Bread implements Runnable {

    private String name;
    private int time;
    Random r = new Random();

    public Bread(String name) {
        this.name = name;
        time = r.nextInt(3000); //should randomly generate something from 0 to 3000
    }


    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
            }
                catch (Exception e) {
            e.printStackTrace(); //catches if we have any errors while the code runs
        }

    }
}