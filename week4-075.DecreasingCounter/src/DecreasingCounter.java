public class DecreasingCounter {

    private int value;
    private int initial;

    //constructor
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = valueAtStart;
    }

    //print method
    public void printValue() {
        System.out.println("value: " + this.value);
    }

    //decrease method
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    //reset method
    public void reset() {
        this.value = 0;
    }

    //set initial method
    public void setInitial() {
        this.value = this.initial;
    }

}
