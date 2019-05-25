public class Player {

    private String playerName;
    private int goalAmount;

    public Player(String playerName, int goalAmount) {
        this.playerName = playerName;
        this.goalAmount = goalAmount;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.playerName;
    }

    public int goals() {
        return this.goalAmount;
    }

    public String toString() {
        return this.playerName + ", goals " + Integer.toString(this.goalAmount);
    }
}
