import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int wordIndex = name.length() - 1;
        String finalName = "";
        while (wordIndex >= 0) {
            finalName += name.charAt(wordIndex);
            wordIndex--;
        }
        System.out.println("In reverse order: " + finalName);
    }
}
