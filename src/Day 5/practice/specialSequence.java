import java.util.Scanner;
public class specialSequence {
    public static void main(String[] args) {
        int num1= 2;
        int num2= 1;
        int num3= 3;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();

        System.out.print(num1 + " " + num2 + " " + num3);
        int nextNum = num1 + num2 + num3;
        while (nextNum <= n) {
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = num3;
            num3 = nextNum;
            nextNum = num1 + num2 + num3;
        }
        sc.close();
    }

    
}
