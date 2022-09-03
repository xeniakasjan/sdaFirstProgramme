package Homeworks.maximumDistance;

import java.util.Scanner;

public class vehicleCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fuel amount in your vehicle: ");
        float fuel = scanner.nextFloat();

        System.out.print("Vehicle's fuel usage per 100km: ");
        float fuelUsage = scanner.nextFloat();

        System.out.print("Number of passengers in the car: ");
        int passengers = scanner.nextInt();
        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.printf("Your vehicle can drive maximum of %2f kilometers", vehicle.maxDistance());

        System.out.println();
        //other option to call this method

        System.out.println(vehicle.maxDistance(100,10,4));
    }
}
