public class Fibonacci {
    public static void main(String[] args) {
        int n=1000;
        for(int i=0;i<n;i++){
            if(fib(i)>=1000)
                break;
            System.out.println(fib(i)+"\t");
        }
    }

    public static int fib(int i){
        if(i<=1)
            return i;
        else
            return fib(i-1) + fib(i-2);
    }

}
