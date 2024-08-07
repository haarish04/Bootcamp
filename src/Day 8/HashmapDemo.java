import java.util.*;
public class HashmapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("abc",50);
        marks.put("akof",90);
        marks.put("cdhbsjcb",20);
        marks.put("abc",60); //Since key value is same the previous key wont be stored. Make key unique

        System.out.println(marks);// Print all key value pairs

        System.out.println(marks.values());//Print only values

        System.out.println(marks.keySet());// Print only keys

        System.out.println(marks.entrySet());// Print key-values

        for(String key : marks.keySet()){
            System.out.println(key +" -> "+ marks.get(key));
        }

        for(Map.Entry<String, Integer> mark: marks.entrySet()){
            System.out.println(mark.getKey() + "->"+ mark.getValue());
        }
    }
            
}
