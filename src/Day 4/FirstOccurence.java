import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        
        System.out.println("Enter the element: ");
        int n= sc.nextInt();

        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                pos=i+1;
                break;
            }
        }

        System.out.println(pos);
        sc.close();

    }
    
}