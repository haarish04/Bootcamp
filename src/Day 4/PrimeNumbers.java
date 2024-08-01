import java.util.Scanner;

class PrimeNumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        if(isPrime(n))
            System.out.println(n+" is a prime number");
        else
            System.out.println("Not prime");
        
        sc.close();
    }

    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n==2)
            return true;
        for(int i=3;i*i<=n;i++){
            if(n%i==0)
                return false;
        }

        return true;

    }
}