import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int min = 9999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = smallest(array);
        int i = 0;
        while (array[i] != min) {
            i++;
        }
        return i;
    }

    public static int smallestStartingFrom(int[] array, int index) {
        int min = 9999;
        while (index < array.length) {
            if (array[index] < min) {
                min = array[index];
            }
            index++;
        }
        return min;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = smallestStartingFrom(array, index);
        while (array[index] != min) {
            index++;
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int placeholder1;
        int placeholder2;
        placeholder1 = array[index1];
        placeholder2 = array[index2];
        array[index2] = placeholder1;
        array[index1] = placeholder2;
    }

    public static void sort(int[] array) {
        int smallestIndex = 0;
        while (smallestIndex < array.length - 1) {
            System.out.println(Arrays.toString(array));
            int i = indexOfTheSmallestStartingFrom(array, smallestIndex);
            if (i != smallestIndex) {
                swap(array, smallestIndex, i);
            }
            smallestIndex++;
        }
    }
}
