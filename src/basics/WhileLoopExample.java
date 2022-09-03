package basics;

import java.util.Scanner;

public class WhileLoopExample {
    //4. While Loop Example
    public static void main(String[] args) {

//        int i = 0;
//        while(i <10) {
//            System.out.println("Hello World!");
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);

        char runAgain = 'y';

        while (runAgain == 'y') {
            System.out.print("Please enter a number: ");

            int input = scanner.nextInt();

            if(input < 0){
                for (int j = 0; j > input; j--){
                    System.out.println(j + " ");
                }

            }else{
                for (int j = 0; j <= input; j++){
                    System.out.println(j + " ");

                }
            }
            System.out.println("\nDo you want to run again? y/n");
            runAgain = scanner.next().charAt(0);

        }

    }
}
