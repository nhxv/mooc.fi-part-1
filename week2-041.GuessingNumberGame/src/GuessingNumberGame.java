import java.util.Scanner;
import java.util.Random;

public class GuessingNumberGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;
        //solution
        while (true) {
            System.out.println("Guess a number: ");
            int guessInput = Integer.parseInt(reader.nextLine());
            count++;
            if (guessInput > numberDrawn) {
                System.out.println("The number is lesser, guess made: " + count);
            } else if (guessInput < numberDrawn) {
                System.out.println("The number is greater, guess made: " + count);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
