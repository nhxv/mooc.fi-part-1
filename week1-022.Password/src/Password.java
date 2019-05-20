
import java.util.Scanner;
public class Password {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Type the password: ");
            String passwordInput = reader.nextLine();
            if (passwordInput.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }


    }
}
