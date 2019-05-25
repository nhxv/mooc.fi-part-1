import java.util.ArrayList;
import java.util.Scanner;

public class Scan {

    private Scanner reader;
    private int points;
    private ArrayList<Integer> pointsList = new ArrayList<Integer>();

    public Scan(Scanner reader) {
        this.reader = reader;
    }

    public void setPointsList(int points) {
        pointsList.add(points);
    }

    public ArrayList<Integer> getPointsList() {
        return pointsList;
    }

    public void scanPoints() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            points = Integer.parseInt(this.reader.nextLine());
            if (points != -1) {
                setPointsList(points);
            } else {
                break;
            }
        }
    }
}
