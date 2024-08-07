@FunctionalInterface
interface math{
    void area(int length);
}

public class LambdaDemo {
    public static void main(String[] args) {
        math m1 = (int num) -> {System.out.println(num*num);};
        math m2 = (num) -> {System.out.println(num*num);};
        math m3 = (num) -> System.out.println(num*num);
        math m4 = num -> System.out.println(num*num);

        m1.area(5);
        m2.area(10);
        m3.area(7);
        m4.area(9);
    }
    
}
