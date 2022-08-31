package Homeworks.carpet;

import java.util.Scanner;

public class callingCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the floor size");
        System.out.print("Enter the floor length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter floor width: ");
        double width = scanner.nextDouble();

        //Create Floor class object
        Floor floor = new Floor (width,length);

        System.out.print("Enter carpet price per m^2: ");
        double cost = scanner.nextDouble();

        //Create Carpet class object
        Carpet carpet = new Carpet(cost);

        /*Create calculator object and pass floor and
         pass Floor and Carpet objects as input parameters*/
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Carpet will cost: " + calculator.getTotalCost() + "EUR");
    }
}
