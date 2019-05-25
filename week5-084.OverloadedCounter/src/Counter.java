public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter (int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
        if (this.check) {
            this.check = true;
        }
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        if (this.value >= 1 || !(this.check)) {
            this.decrease(1);
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if(decreaseAmount > 0) {
            if (this.check) {
                if (this.value > decreaseAmount) {
                    this.value -= decreaseAmount;
                } else {
                    this.value = 0;
                }
            } else {
                this.value -= decreaseAmount;
            }
        }
    }

    public boolean check() {
        return this.check;
    }

}
