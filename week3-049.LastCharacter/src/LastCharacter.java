import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char lastChar = lastCharacter(name);
        System.out.println("Last character: " + lastChar);
    }

    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() - 1);
        return lastChar;
    }
}
