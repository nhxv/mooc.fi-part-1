import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String userInput = reader.nextLine();
            if (userInput.isEmpty()) {
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
