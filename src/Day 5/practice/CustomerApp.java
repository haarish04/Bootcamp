public class CustomerApp {
public static void main(String[] args) {
		
		Customer cust= new Customer();
		System.out.println(cust.getName());
		
		Customer cust2= new Customer(1, "xyz", "del", "@@@");
		System.out.println(cust2.getName());

	}

}
