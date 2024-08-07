@FunctionalInterface
interface AreaCalc{
    void area(int length);
}

@FunctionalInterface
interface SumCalc{
    int sum(int num);
}

public class LambdaDemo {
    public static void main(String[] args) {
        AreaCalc m = (int num) -> {System.out.println(num*num);};
        //math m2 = (num) -> {System.out.println(num*num);};
        //math m3 = (num) -> System.out.println(num*num);
        //AreaCalc m4 = num -> System.out.println(num*num);
        //All 4 ways are correct

        m.area(5);

        SumCalc s = num -> {return (num+num);};
        System.out.println(s.sum(6));
        
    }
    
}
