import java.util.ArrayList;

public class Bird {

    private String birdName;
    private String birdLatin;
    private int observeCount = 0;

    public Bird(String birdName, String birdLatin) {
        this.birdName = birdName;
        this.birdLatin = birdLatin;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getBirdLatin() {
        return this.birdLatin;
    }

    public int addObserveCount() {
        observeCount++;
        return observeCount;
    }

    public int getObserveCount() {
        return observeCount;
    }
}
