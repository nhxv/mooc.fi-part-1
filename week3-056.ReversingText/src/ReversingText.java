import java.util.Scanner;

public class ReversingText {
    public static String reverse(String text) {
        String help = "";
        int charCount = text.length() - 1;
        while (charCount >= 0) {
            help += text.charAt(charCount);
            charCount--;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
