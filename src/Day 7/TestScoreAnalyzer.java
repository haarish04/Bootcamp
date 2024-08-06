import java.util.*;

public class TestScoreAnalyzer {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        ScoreAnalyzer analyze= new ScoreAnalyzer();

        System.out.println("Enter Runs: ");
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            try {
                int runs = Integer.parseInt(line);
                analyze.addRunsToList(runs);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

        analyze.displayRuns();

        System.out.printf("\nRun rate: "+ analyze.calcRunRate());
        System.out.println("Lowest Runs: "+ analyze.lowestRunsScored());
        System.out.println("Number of players: "+ analyze.getCountOfPlayers());

        sc.close();
    }    
}
