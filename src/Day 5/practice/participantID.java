import java.util.*;

public class participantID {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Total Number of Students:");
        n= sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        System.out.println("Enter the IDs:");
        for(int i=0;i<n;i++){
            int studid=sc.nextInt();
            arr1.add(studid);
        }
        System.out.println("Enter ID to search: ");
        int val=sc.nextInt();
        while(val!=0){
            boolean ans = arr1.contains(val);

            if (ans)
                System.out.println("Participant with ID "+val+" exist");
            else
                System.out.println("Participant with ID "+val+" does not exist");
            System.out.println("Enter ID to search:");
            val=sc.nextInt();

            sc.close();

        }
    }
}
 