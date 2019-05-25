public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String elegantPrint = String.valueOf(array[i]);
            String comma = ", ";
            if (i != array.length - 1) {
                elegantPrint += comma;
            }

            System.out.print(elegantPrint);
        }
    }
}
