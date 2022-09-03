package basics;

import java.util.LinkedList;

public class LinkedList1to100 {
    public static void main(String[] args) {

        // Create a new LinkedList object
        // Populate the list with numbers from 1 to 50
        // Print all the elements in the LinkedList

        LinkedList<Integer> number = new LinkedList<>();
        for (int i = 1; i <= 50; i++){
            number.add(i); //increase number to 50
        }
        System.out.println(number);


    }
}
