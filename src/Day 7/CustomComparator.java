import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        
        NewCustomer cust2 = new NewCustomer(1,"abcdef","del","@@@");
        NewCustomer cust3 = new NewCustomer(2,"aafff","chen","@2");
        NewCustomer cust4 = new NewCustomer(3,"hhhh","goa","@@@3");
        NewCustomer cust5 = new NewCustomer(4,"bcdnmcd","del","@23");

        List<NewCustomer> NewCustomerList = new ArrayList<>();
        NewCustomerList.add(cust2);
        NewCustomerList.add(cust3);
        NewCustomerList.add(cust4);
        NewCustomerList.add(cust5);

        System.out.println("Before sorting: ");

        for(NewCustomer cust: NewCustomerList)
            System.out.println(cust.getName());

        Collections.sort(NewCustomerList);

        
        System.out.println("After sorting: ");

        for(NewCustomer cust: NewCustomerList)    
            System.out.println(cust.getName());
    


    }
    
}
