import java.util.Scanner;
public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        double division = 1.0*firstNum/secondNum;
        System.out.println("Division: " + firstNum + " / " + secondNum + " = " + division);
    }
}

