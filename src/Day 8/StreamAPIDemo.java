import java.util.*;
import java.util.stream.Collectors;
public class StreamAPIDemo {
    public static void main(String[] args) {

        List <Integer> numbers = List.of(10,20,30,40,50);
        
        System.out.println(numbers.stream().count());

        //forEach performs some action (consumer) specified by our lambda function and applies it to every element in th estream
        //Consumer is a functional interface
        numbers.stream().forEach(num -> {
            System.out.println(num);
        });

        //Use optional to accept null value as well
        Optional<Integer> res =numbers.stream().reduce((num1, num2) ->(num1 +num2));

        //Use orElse to accept null and modify it to some other value of our choice
        int res2 =numbers.stream().reduce( (num1, num2) ->(num1 +num2)).orElse(0);

        //Paasing 100 initial value to the sum
        int res3 =numbers.stream().reduce(100, (num1, num2) ->(num1 +num2));

        //Filter elements and print only those that are greter than 10
        numbers.stream().filter(num -> num>20).forEach(num -> System.out.println(num));

        //Filter elements such that 30 < num < 60
        numbers.stream().filter(num -> num>30 && num< 60).forEach(num -> System.out.println(num));

        //Count of the numbers from above question
        long numCount=numbers.stream().filter(num -> num>30 && num< 60).count();


        System.out.println(res.get());
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(numCount);

        System.out.println(numbers.stream().filter(num -> num>30 && num< 60).toList());
        Object[] numList = numbers.stream().filter(num -> num>30 && num< 60).toArray();
        System.out.println(Arrays.toString(numList));
        
        //Use collect for the same thing
        List<Integer> numList2 =numbers.stream().filter(num -> num > 30 && num < 60).collect(Collectors.toList());
        System.out.println(numList2);

        //Map every element to twice of its value only if above 20
        numbers.stream().filter(num -> num> 20).map(num -> num *2).forEach(num -> System.out.println(num));
        

    }
    
}
