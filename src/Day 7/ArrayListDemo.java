import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Mango");
        fruits.add("banana");
        fruits.add("grape");
        fruits.add("apple");

        System.out.println(fruits);

        for(String fruit: fruits){
            System.out.println(fruit.toUpperCase().substring(0,3));
        }


    }
    
}   
