import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:  ");
        int lowerNum = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperNum = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (lowerNum <= upperNum) {
            sum += lowerNum;
            lowerNum++;

        }
        System.out.println("The sum is " + sum);
    }
}
