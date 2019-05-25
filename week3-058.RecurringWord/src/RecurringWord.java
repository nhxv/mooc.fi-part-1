import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> recurringWord = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String userInput = reader.nextLine();
            if (recurringWord.contains(userInput)) {
                System.out.println("You gave the word " + userInput + " twice" );
                break;
            } else {
                recurringWord.add(userInput);
            }
        }


    }
}
