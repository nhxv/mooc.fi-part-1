import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        int maxNum = Math.max(firstNum, secondNum);
        System.out.println("The bigger number of the two numbers given was: " + maxNum);
    }
}
