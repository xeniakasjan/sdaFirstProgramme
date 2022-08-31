package Basics;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //Declaring Array list
        ArrayList<String> car = new ArrayList<>();

        //Add elements
        car.add("car1");
        car.add("car2");
        car.add("car3");
        car.add("car4");
        car.add("car5");

        //Print out all elements
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(2));

        //Add element at specific index
        car.add(2, "car22");
        System.out.println(car);

        //Change elements values
        car.set(4,"alien car");
        System.out.println(car);

        //Remove element
        car.remove(0);
        System.out.println(car);



    }
}
