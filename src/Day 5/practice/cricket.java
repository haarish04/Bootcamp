import java.util.Scanner;
public class cricket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("OversBowled: ");
        Double oversBowled=sc.nextDouble();
        System.out.println("CurrentNetRunRate: ");
        Double currentNetRunrate=sc.nextDouble();
        System.out.println("Target: ");
        Double target=sc.nextDouble();

        Double oversleft=50-oversBowled;
        Double currentscore=currentNetRunrate*oversBowled;

        Double scoreleft=target-currentscore;

        Double rrr=scoreleft/oversleft;

        System.out.println("RequiredRunRate:"+rrr);

        sc.close();
    }

    
}
