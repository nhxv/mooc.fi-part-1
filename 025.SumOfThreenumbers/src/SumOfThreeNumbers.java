import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.println("Type your first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type your second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type your third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
