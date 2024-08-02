import java.util.Scanner;
public class specialSequence {
    public static void main(String[] args) {
        int num1= 2;
        int num2= 1;
        int num3= 3;

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        for(int i=2;i<n;i++)
            System.out.println(sequence(i));
        sc.close();
    }

    public static int sequence(int i){
        if(i<=3)
            return i;
        return sequence(i-1) + sequence(i-2)+ sequence(i-3);
        
    }
    
}
