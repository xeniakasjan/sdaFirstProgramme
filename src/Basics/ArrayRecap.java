package Basics;

public class ArrayRecap {
    public static void main(String[] args) {

        //Declare array that stores 3 elements of type String
        String[] names = new String[3];

        //Setting element values using each elements's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //Getting values from array
        System.out.println(names[2]);

        //Length
        System.out.println(names.length);

        //2nd way declare and initialize array
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Nissan"};
        /*DRY = Don't Repeat Yourself*/

        //Iterate though all elements in array with for loop
        for (int i = 0; i < dreamCars.length; i++){
            System.out.println(dreamCars[i]);
        }

        //Same thing but using For-each loop
        for (String car: dreamCars){
            System.out.println(car);
        }




    }
}
