@FunctionalInterface
interface AreaCalc{
    void area(int length);
}

@FunctionalInterface
interface SumCalc{
    int sum(int num);
}

@FunctionalInterface
interface RectangleCalc{
    void area(int length, int breadth);
}

@FunctionalInterface
interface Series{
    void printSeries(int start, int end);
}

public class LambdaDemo {
    public static void main(String[] args) {
        AreaCalc m = (int num) -> {System.out.println(num*num);};
        //math m2 = (num) -> {System.out.println(num*num);};
        //math m3 = (num) -> System.out.println(num*num);
        //AreaCalc m4 = num -> System.out.println(num*num);
        //All 4 ways are correct

        m.area(5);

        SumCalc sumC = num -> {return (num+num);};
        System.out.println(sumC.sum(6));

        RectangleCalc r = (int l, int b) -> {System.out.println(l*b);};
        r.area(10,20);

        Series s =(int start, int end) -> {
            for(int i=start;i<end;i++)
                System.out.println(i);
        };

        s.printSeries(2, 7);
        
    }
    
}
