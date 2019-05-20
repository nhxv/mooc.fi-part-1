import java.util.Scanner;
public class SumOfTheAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String firstUsername = reader.nextLine();
        System.out.println("Type  your age: ");
        int firstUserAge = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String secondUsername = reader.nextLine();
        System.out.println("Type your age: ");
        int secondUserAge = Integer.parseInt(reader.nextLine());
        int totalAge = firstUserAge + secondUserAge;
        System.out.println(firstUsername + " and " + secondUsername + " are "
        + totalAge + " years old in total.");

    }
}
