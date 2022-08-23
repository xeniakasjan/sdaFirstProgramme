package Homeworks;
import java.util.Objects;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {

        //Get input from the user1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our game!");
        System.out.print("Player #1, Your move! Choose: rock/ paper/ scissors: ");
        String player1choice = scanner.nextLine();

        //Get input from the user2
        System.out.print("Player #2, Your turn now! Choose: rock/ paper/ scissors: ");
        String player2choice = scanner.nextLine();

        /*If answers are the same – it's a TIE*/
        if (player1choice.equals(player2choice)) {
            System.out.println("It's a tie! Let's try again");
        }

        /*If answers are different*/
//        1. Rock breaks Scissors.
        else if (player1choice.equals("rock")) {
            if (player2choice.equals("scissors")){
                System.out.println("Rock breaks Scissors! Player1 won!");
        }
    }

        else if (player1choice.equals("scissors")) {
            if (Objects.equals(player2choice, "rock")){
                System.out.println("Rock breaks Scissors! Player2 won!");
            }
        }
//        2. Scissors cut Paper.
        else if (player1choice.equals("scissors")) {
            if (player2choice.equals("paper")){
                System.out.println("Scissors cut Paper! Player1 won!");
            }
        }
        else if (player1choice.equals("paper")) {
            if (player2choice.equals("scissors")){
                System.out.println("Scissors cut Paper! Player2 won!");
            }
        }
//        3. Paper covers Rock.
        else if (player1choice.equals("paper")) {
            if (player2choice.equals("rock")){
                System.out.println("Paper covers Rock Player1 won!");
            }
        }
        else if (player1choice.equals("rock")) {
            if (player2choice.equals("paper")){
                System.out.println("Paper covers Rock Player2 won!");
            }
        }
    }
}


