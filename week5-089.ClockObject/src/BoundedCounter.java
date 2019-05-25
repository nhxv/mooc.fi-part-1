public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value < this.upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public void setValue(int input) {
        if (input >= 0 && input <= this.upperLimit) {
            this.value = input;
        }
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }

    }
}
