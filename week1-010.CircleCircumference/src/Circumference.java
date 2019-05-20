
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type a radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        double pi = Math.PI;
        double circumference = 2*pi*radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
