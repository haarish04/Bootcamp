import java.util.*;
public class ImmutableExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        List<Integer> immutableList = Collections.unmodifiableList(numbers);

        //Cannot modify list, will throw exception
        //immutableList.add(3);
        System.out.println(immutableList);
    }
    
}
