import java.util.Scanner;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int ksquared= k*k;
        boolean flag=false;

        int digitCount=0;

        while(ksquared!=0){
            ksquared=ksquared/10;
            digitCount++;
        }

        ksquared= k*k;

        for(int i=1;i<digitCount;i++){
        } 
       
        if(flag)
            System.out.println("Karpekar number");
        else
            System.out.println("not ");        

        sc.close();
    }
    
}
