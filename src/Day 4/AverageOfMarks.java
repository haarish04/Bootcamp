import java.util.Scanner;

class AverageOfMarks{
    public static void main(String args[]){
        System.out.println("Enter the number of participants: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the 3 marks: ");
            int m1= sc.nextInt();
            int m2= sc.nextInt();
            int m3= sc.nextInt();

            int avg= (m1+m2+m3)/3;
            if(avg>=70)
                System.out.println("Qualified");
            
            else
                System.out.println("Not wualified");
        }
        sc.close();

    }
}