import java.util.Scanner;
public class GreaterNumber {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your first number here: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Type your second number here: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        if (firstNum > secondNum) {
            System.out.println("Greater number: " + firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("Greater number: " + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
