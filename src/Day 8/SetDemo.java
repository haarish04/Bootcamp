
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Customer> customers = new HashSet<>();
		Customer customer1 = new Customer(111, "Mohan", "Bangalore", "mohan@sohan.com");
		Customer customer2 = new Customer(201, "Sohan", "Hyderabad", "sohan@mohan.com");
		Customer customer3 = new Customer(125, "Rohani", "Bangalore", "rohani@gmail.com");
		Customer customer4 = new Customer(120, "Abhijay", "Lucknow", "abhi@yahoo.com");
		Customer customer5 = new Customer(111, "Mohan", "Bangalore", "mohan@sohan.com");

		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		System.out.println(customer1.equals(customer5));
		System.out.println(customer1.hashCode() + "\t" + customer5.hashCode());
		System.out.println(customers.size());

		for(Customer customer : customers) {
			System.out.println(customer);
		}
		
		
		//Exception in thread "main" java.lang.ClassCastException: class com.entity.Customer cannot be cast to class java.lang.Comparable 

		/*Set<String> departments = new HashSet<>();
		departments.add("IT");
		departments.add("Finance");
		departments.add("Marketing");
		departments.add("Sales");
		
		System.out.println(departments);
		System.out.println("=============Using TreeSet===============");
		Set<String> departmentTreeSet = new TreeSet<>();
		departmentTreeSet.add("IT");
		departmentTreeSet.add("Finance");
		departmentTreeSet.add("Marketing");
		departmentTreeSet.add("Sales");
		
		System.out.println(departmentTreeSet);*/
		
	}

}
