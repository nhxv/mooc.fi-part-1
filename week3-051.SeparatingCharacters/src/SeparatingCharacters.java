import java.util.Scanner;

public class SeparatingCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int wordIndex = 0;
        int wordPosition = 1;
        while (wordIndex < name.length()) {
            System.out.println(wordPosition + ". character: " + name.charAt(wordIndex));
            wordIndex++;
            wordPosition++;
        }

    }

}
