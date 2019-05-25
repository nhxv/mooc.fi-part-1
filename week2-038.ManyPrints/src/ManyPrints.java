import java.util.Scanner;

public class ManyPrints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int num = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (count != num) {
            count++;
            printText();
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
