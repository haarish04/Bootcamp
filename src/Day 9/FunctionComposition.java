import java.util.function.*;
public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x+x;
        Function<Integer, Integer> multiply = x -> x * 2;
        Function<Integer, Integer> addThenMultiply= multiply.compose(add);

        System.out.println(addThenMultiply.apply(10));
    }
    
}
