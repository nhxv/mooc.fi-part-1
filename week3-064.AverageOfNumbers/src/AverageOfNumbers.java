import java.util.ArrayList;

public class AverageOfNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = (1.0) * sum(list)/(list.size());
        return average;
    }
}
