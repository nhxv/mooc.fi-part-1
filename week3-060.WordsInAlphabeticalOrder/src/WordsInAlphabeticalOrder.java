import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String userInput = reader.nextLine();

            if (userInput.isEmpty()) {
                Collections.sort(words);
                System.out.println("You typed the following words: ");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            } else {
                words.add(userInput);
            }
        }
    }
}

