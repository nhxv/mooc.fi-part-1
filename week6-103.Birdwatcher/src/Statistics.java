import java.util.ArrayList;

public class Statistics {

    private ArrayList<Bird> birdList;

    public Statistics(ArrayList<Bird> birdList) {
        this.birdList = birdList;
    }

    public void printStatistics() {
        for (Bird bird : birdList) {
            System.out.println(bird.getBirdName() + " (" + bird.getBirdLatin() + "): " + String.valueOf(bird.getObserveCount()) + " observations");
        }
    }

    public void show(String birdInfo) {
        for (Bird bird : birdList) {
            if (bird.getBirdName().equals(birdInfo) || bird.getBirdLatin().equals(birdInfo)) {
                System.out.println(bird.getBirdName() + " (" + bird.getBirdLatin() + "): " + String.valueOf(bird.getObserveCount()) + " observations");
            }
        }
    }
}
