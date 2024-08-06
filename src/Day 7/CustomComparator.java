import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        
        Customer cust2 = new Customer(1,"abcdef","del","@@@");
        Customer cust3 = new Customer(2,"aafff","chen","@2");
        Customer cust4 = new Customer(3,"hhhh","goa","@@@3");
        Customer cust5 = new Customer(4,"bcdnmcd","del","@23");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cust2);
        customerList.add(cust3);
        customerList.add(cust4);
        customerList.add(cust5);

        System.out.println("Before sorting: ");

        for(Customer cust: customerList)
            System.out.println(cust.getName());

        Collections.sort(customerList);

        
        System.out.println("After sorting: ");

        for(Customer cust: customerList)    
            System.out.println(cust.getName());
    


    }
    
}
