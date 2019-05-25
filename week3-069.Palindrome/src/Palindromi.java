import java.util.Scanner;

public class Palindromi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String text) {
        String reverseText = "";
        int indexCount = text.length() - 1;
        while (indexCount >= 0) {
            reverseText += text.charAt(indexCount);
            indexCount--;
        }
        return reverseText;
    }
}
