import java.util.ArrayList;

public class Variance {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

    public static double variance(ArrayList<Integer> list) {
        double variance;
        double numerator = 0;
        double average = average(list);

        for (int number : list) {
            numerator += Math.pow((number - average), 2);
        }
        variance = numerator/(list.size() - 1);
        return variance;

    }

    public static double average(ArrayList<Integer> list) {
        double average = (1.0) * sum(list)/(list.size());
        return average;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
