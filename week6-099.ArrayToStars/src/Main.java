public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                if (j != array[i] - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("*\n");
                }

            }
        }
    }
}
