import java.util.Scanner;

public class LowerLimitAndUpperLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());

        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }
}
