import java.util.ArrayList;
import java.util.Scanner;

public class Scan {

    private Scanner reader;
    private String command;
    private String birdName;
    private String birdLatin;
    private String observeBird;
    private String birdInfo;
    private ArrayList<Bird> birdList = new ArrayList<Bird>();

    public Scan(Scanner reader) {
        this.reader = reader;
    }

    public void scan() {
        while (true) {
            System.out.println("? ");
            command = this.reader.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name: ");
                birdName = this.reader.nextLine();
                System.out.println("Latin Name: ");
                birdLatin =  this.reader.nextLine();
                Bird bird = new Bird(birdName, birdLatin);
                //add bird profile to birdList
                addToBirdList(bird);

            } else if (command.equals("Observation")) {
                System.out.println("What was observed:? ");
                observeBird = this.reader.nextLine();

                //increment observe count
                for (Bird bird : birdList) {
                    if (bird.getBirdName().equals(observeBird)) {
                        bird.addObserveCount();
                    } else {
                        //if observeBird does not equal to the last bird in the list, throw error
                        if (bird.getBirdName().equals((birdList.get(birdList.size() - 1)).getBirdName())
                         && bird.getBirdLatin().equals((birdList.get(birdList.size() - 1)).getBirdLatin())) {
                            System.out.println("Is not a bird!");
                        }
                    }
                }
            } else if (command.equals("Statistics")) {
                Statistics stats = new Statistics(this.birdList);
                stats.printStatistics();

            } else if (command.equals("Show")) {
                System.out.println("What?");
                birdInfo = this.reader.nextLine();
                Statistics stats = new Statistics(this.birdList);
                stats.show(birdInfo);

            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

    public void addToBirdList(Bird bird) {
        birdList.add(bird);
    }


}
