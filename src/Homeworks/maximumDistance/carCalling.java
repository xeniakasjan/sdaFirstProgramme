package Homeworks.maximumDistance;

import java.util.Scanner;

public class carCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fuel amount in your vehicle: ");
        float fuel = scanner.nextFloat();

        System.out.print("Vehicle's fuel usage per 100km: ");
        float fuelUsage = scanner.nextFloat();

        System.out.print("Number of passengers in the car: ");
        int passengers = scanner.nextInt();

        System.out.println("Will you turn air conditioner? y/n");
        char input = scanner.next().charAt(0);
        boolean airConditioner = false;

        if (input =='y'){
            airConditioner = true;
        }

        //System.out.printf("Your vehicle can drive maximum of %2f kilometers", carCalling.maxDistance());


    }
}
