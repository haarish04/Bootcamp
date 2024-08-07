import java.util.*;;

public class CustomerMap {
    public static void main(String[] args) {

        NewCustomer cust2 = new NewCustomer(1,"abcdef","delhi","@@@");
        NewCustomer cust3 = new NewCustomer(2,"aafff","bangalore","@2");
        NewCustomer cust4 = new NewCustomer(3,"hhhh","bangalore","@@@3");
        NewCustomer cust5 = new NewCustomer(4,"bcdnmcd","goa","@23");
        
        TreeMap<Integer, NewCustomer> customerMap = new TreeMap<>();
        customerMap.put(cust2.getCustomerId(), cust2);
        customerMap.put(cust3.getCustomerId(), cust3);
        customerMap.put(cust4.getCustomerId(), cust4);
        customerMap.put(cust5.getCustomerId(), cust5);

        for(Map.Entry<Integer, NewCustomer> customer : customerMap.entrySet()){
            if(customer.getValue().getLocation().equals("bangalore"))
                System.out.println(customer.getValue().getDetails());


        }

    }
    
}
