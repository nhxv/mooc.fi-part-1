import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sumAll = new NumberStatistics();
        NumberStatistics sumEven = new NumberStatistics();
        NumberStatistics sumOdd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input != -1) {
                sumAll.addNumber(input);
                if (input % 2 == 0) {
                    sumEven.addNumber(input);
                } else {
                    sumOdd.addNumber(input);
                }
            } else {
                break;
            }
        }

//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);

//        System.out.println("Amount: " + sum.amountOfNumbers());
        System.out.println("sum: " + sumAll.sum());
        System.out.println("sum of even: " + sumEven.sum());
        System.out.println("sum of odd: " + sumOdd.sum());
//        System.out.println("average: " + stats.average());
    }
}
