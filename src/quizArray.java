import java.util.Scanner;

public class quizArray {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    String[][] quiz = new String[4][4];
    int[] answer = {3,1,2,2};

        quiz[0][0] = "Capital city of Australia?";
        quiz[0][1] = "Sydney";
        quiz[0][2] = "Melbourne";
        quiz[0][3] = "Canberra";

        quiz[1][0] = "Capital city of USA?";
        quiz[1][1] = "Washington";
        quiz[1][2] = "New York";
        quiz[1][3] = "Dallas";

        quiz[2][0] = "Capital city of Brazil?";
        quiz[2][1] = "Rio de Janeiro";
        quiz[2][2] = "Brasilia";
        quiz[2][3] = "San paulo";

        quiz[3][0] = "Capital city of  Canada?";
        quiz[3][1] = "Montreal";
        quiz[3][2] = "Ottawa";
        quiz[3][3] = "Calgary";

        //i = row
        //j = column
        for(int i = 0; i < quiz.length; i++){

            //Printing questions
            System.out.println(quiz[i][0]);

            //Printing answers
            for (int j = 1; j < quiz[i].length; j++){
                System.out.println("\t" + j + ")" + quiz[i][j]);
            }
            System.out.println("Answer: ");
            int answerInput = scanner.nextInt();

            if(answerInput == answer[i]){
                System.out.println("Correct");
                System.out.println("--------");

            } else {
                System.out.println("Not correct");
                System.out.println("--------");

            }


        }



    }
}
