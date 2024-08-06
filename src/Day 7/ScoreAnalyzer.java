import java.util.*;

public class ScoreAnalyzer {

    private LinkedList<Integer> runsData;

    ScoreAnalyzer(){
        runsData = new LinkedList<Integer>();
    }

    public void addRunsToList(int runs){
        this.runsData.addLast(runs);
    }

    public double calcRunRate(){
        int totalRuns=0;
        for(int runs:this.runsData)
            totalRuns+=runs;
        
        double runRate= totalRuns/50;
        return runRate;
    }

    public int lowestRunsScored(){
        int lowestScore = Integer.MAX_VALUE;
        for(int runs: this.runsData){
            if(runs<lowestScore)
                lowestScore= runs;
        }

        return lowestScore;
    }

    public int getCountOfPlayers(){
        return runsData.size();
    }

    public void displayRuns(){
        System.out.print("Runs scored: ");
        for(int i=0;i<this.runsData.size();i++)
            System.out.print((i+1)+"-"+runsData.get(i)+ "\t");
    }
    
}
