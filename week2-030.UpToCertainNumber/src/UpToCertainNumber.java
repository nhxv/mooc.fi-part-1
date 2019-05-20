import java.util.Scanner;

public class UpToCertainNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int upLimit = Integer.parseInt(reader.nextLine());
        int number = 0;
        while (number < upLimit) {
            number += 1;
            System.out.println(number);
        }
    }
}
