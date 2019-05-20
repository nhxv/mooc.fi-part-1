import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //top ten
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        //top 25
        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        //player
        System.out.println("Stats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        //PHI
        System.out.println("Stats for PHI");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        //ANA
        System.out.println("Stats for ANA");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}
