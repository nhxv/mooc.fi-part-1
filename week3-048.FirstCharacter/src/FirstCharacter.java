import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char firstChar = firstCharacter(name);
        System.out.println("First character: " + firstChar);
    }

    public static char firstCharacter(String text) {
        char firstChar = text.charAt(0);
        return firstChar;
    }
}
