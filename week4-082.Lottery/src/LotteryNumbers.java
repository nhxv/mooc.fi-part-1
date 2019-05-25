import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        random = new Random();
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        numbers.clear();
        int i = 0;
        while (i < 7) {
            int number = random.nextInt(39) + 1;
            if (!containsNumber(number)) {
                this.numbers.add(number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
