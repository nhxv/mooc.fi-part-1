import java.util.ArrayList;

public class Team {

    private String teamName;
    private int teamMaxSize = 16;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (playerList.size() < teamMaxSize) {
            playerList.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        //set max amount of player a team can have
        this.teamMaxSize = maxSize;
    }

    public int size() {
        return playerList.size();
    }

    public int goals() {
        int totalGoal = 0;
        for (Player player : playerList) {
            totalGoal += player.goals();
        }
        return totalGoal;
    }


}
