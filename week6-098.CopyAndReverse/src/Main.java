import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] original) {
        int[] reverseCopy = new int[original.length];
        for (int i = 0; i < reverseCopy.length; i++) {
            reverseCopy[i] = original[original.length - 1 - i];
        }
        return reverseCopy;
    }
}
