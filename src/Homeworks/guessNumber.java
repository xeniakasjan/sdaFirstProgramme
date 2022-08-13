package Homeworks;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        int rand, guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a random range: ");
        int max = scanner.nextInt(); //0-10

        rand = (int) (Math.random() * (max + 1));
        System.out.println("Generated random value is: " + rand);

        do {
            System.out.println("Guess the value: ");
            guess = scanner.nextInt();

            if(guess < rand){
                System.out.println("Try bigger");
            } else if(guess > rand){
                System.out.println("Try smaller");

            }

        }
        while (guess != rand);
        System.out.println("Congrats! You won");

        //if guess is < rand, then print out "try higher number". If guess is > rand, print out "try lower number"

    }
}
