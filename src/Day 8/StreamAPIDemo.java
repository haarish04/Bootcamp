import java.util.*;
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
        int res2 =numbers.stream().reduce((num1, num2) ->(num1 +num2)).orElse(0);

        System.out.println(res.get());
        System.out.println(res2);
    }
    
}
