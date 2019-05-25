import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private ArrayList<Integer> numberList;

    public NumberStatistics() {
        numberList = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        numberList.add(number);
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        double average = 0;
        if (numberList.size() != 0) {
            average = (1.0) * sum() / (numberList.size());
            return average;
        }
        return average;
    }
}
