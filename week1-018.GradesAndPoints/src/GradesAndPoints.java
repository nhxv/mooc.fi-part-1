import java.util.Scanner;
public class GradesAndPoints {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        if (grade > 49) {
            System.out.println("Grade: 5");
        } else if (grade > 44) {
            System.out.println("Grade: 4");
        } else if (grade > 39) {
            System.out.println("Grade: 3");
        } else if (grade > 34) {
            System.out.println("Grade: 2");
        } else if (grade > 29) {
            System.out.println("Grade: 1");
        } else {
            System.out.println("Grade: failed");
        }
    }
}
