import java.util.*;

public class MethodReferenceDemo {

    
    static class Bicycle {
        private String brand;
    
        public Bicycle(String brand) {
            this.brand = brand;
        }
    
        public String getBrand() {
            return this.brand;
        }
    
        public void setBrand(String name) {
            this.brand = name;
        }

        @Override
        public String toString(){
            return "Bicycle name: " + this.brand +"\t";
        }
    }


    public static void main(String[] args) {

        // Method reference for a static method
        List<String> fruits = Arrays.asList("apple", "banana", "grape");
        fruits.forEach(System.out :: println);

        //Method refernece to an specific object (instance)'s methods'
        List<Bicycle> bicycles = Arrays.asList(
            new Bicycle("Abcd"),
            new Bicycle("Cfnej"),
            new Bicycle("AAscr"));


        bicycles.sort(Comparator.comparing(Bicycle::getBrand));

        for (Bicycle bicycle : bicycles)
            System.out.println(bicycle.getBrand());
        
        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        numbers.stream().sorted(Integer::compareTo);
        System.out.println(numbers);


        //Reference to a constructor
        List<String> bikeBrands = Arrays.asList("abcd", "dnjwkn", "cdnj");

        Bicycle[] bicyclesList =bikeBrands.stream().map(Bicycle::new).toArray(Bicycle[]::new);
        System.out.println(Arrays.toString(bicyclesList));

    }
    
}
