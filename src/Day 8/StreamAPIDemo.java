import java.util.*;
public class StreamAPIDemo {
    public static void main(String[] args) {

        List <Integer> numbers = List.of(10,20,30,40,50);
        
        System.out.println(numbers.stream().count());

        numbers.stream().forEach(num -> {
            System.out.println(num);
        });

    }
    
}
