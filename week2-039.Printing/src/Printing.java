public class Printing {
    public static void printStars(int amount) {
        int count = 0;
        while (count != amount) {
            System.out.print("*");
            count++;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        int sideCount = 0;
        while (sideCount != sideSize) {
            printStars(sideSize);
            sideCount++;
        }
    }

    public static void printRectangle(int width, int height) {
        int heightCount = 0;
        while (heightCount != height) {
            printStars(width);
            heightCount++;
        }
    }

    public static void printTriangle(int size) {
        int heightCount = 0;
        int area = 1;
        while (heightCount != size) {
            printStars(area);
            area++;
            heightCount++;
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);
    }


}
