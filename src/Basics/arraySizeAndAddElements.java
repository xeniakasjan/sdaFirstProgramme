package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class arraySizeAndAddElements {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array size: ");
        int arraySize = scanner.nextInt();

        //Declare empty array in given size
        int storageArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one: ");
        for (int i = 0; i <arraySize; i++) {
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];
        }

        System.out.println(Arrays.toString(storageArray));
        System.out.println("Sum of all the elements: " + sum);
    }
}
