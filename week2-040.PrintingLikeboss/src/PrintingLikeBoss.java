public class PrintingLikeBoss {

    public static void printStars(int starAmount) {
        int starCount = 0;
        while (starCount != starAmount) {
            System.out.print("*");
            starCount++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int whiteSpaceAmount) {
        int whiteSpaceCount = 0;
        while (whiteSpaceCount != whiteSpaceAmount) {
            System.out.print(" ");
            whiteSpaceCount++;
        }
    }

    public static void printTriangle(int size) {
        int triangleHeightCount = 0;
        int triangleStarArea = 1;
        int triangleWhiteArea = size - 1;
        while(triangleHeightCount != size) {
            printWhitespaces(triangleWhiteArea);
            printStars(triangleStarArea);
            triangleStarArea++;
            triangleWhiteArea--;
            triangleHeightCount++;
        }
    }

    public static void xmasTree(int height) {
        int heightCount = 0;
        int treeStarArea = 1;
        int treeWhiteArea = height - 1;
        while (heightCount != height) {
            printWhitespaces(treeWhiteArea);
            printStars(treeStarArea);
            treeStarArea += 2;
            treeWhiteArea--;
            heightCount++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(4);
        xmasTree(4);

    }
}
