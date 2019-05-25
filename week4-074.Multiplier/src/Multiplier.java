public class Multiplier {

    private int number;

    //constructor
    public Multiplier(int number) {
        this.number = number;
    }

    //method
    public int multiply(int otherNumber) {
        int result = otherNumber * (this.number);
        return result;
    }
}
