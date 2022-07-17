import java.util.Scanner;

public class newMain {

// Create a method to count the number of vowels in a string and return that number

public static int numberOfVowels() {
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word = scanner.nextLine();

    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    System.out.println("Number of vowels: " + count);
    return count;
}
}

