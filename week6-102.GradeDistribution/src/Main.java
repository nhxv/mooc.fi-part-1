import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scan scan = new Scan(reader);
        scan.scanPoints();
        Distribution distribution = new Distribution(scan.getPointsList());
        distribution.printResult();
    }
}
