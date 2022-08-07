import java.util.Scanner;

public class LoopsRecap {
    public static void main(String[] args) {
        //1. Print "Hello World" 10 times

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        //2. Print anything from a given number down to 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        int input = scanner.nextInt();
        for (int i = input; i >= 0; i--) {
            System.out.print(i);
        }

        //3. Write a program that accepts positive OR negative number and counts it till 0
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give a number: ");
//        int input = scanner.nextInt();
//
//        if(input >= 0) {
//            for(int i = input; i >= 0; i--) {
//                System.out.print(i + " ");
//            }
//
//        } else {
//            for (int i = input; i <= 0; i++) {
//                System.out.print(i + " ");
//            }
//        }

    }
    }


