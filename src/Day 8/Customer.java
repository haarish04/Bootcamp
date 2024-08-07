import java.util.Objects;

public  class Customer implements Comparable<Customer> {
	private static int count;
	private int customerId;
	private String name;
	private String location;
	private String email;
	
	@Override
	public int compareTo(Customer customer) {
		//return this.name.compareTo(customer.getName());
		return  customer.getCustomerId() - this.customerId;
	}
	
	
	public static int getCount() {
		return count;
	}

	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}
	
	public int getCustomerId() {
		return this.customerId;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(){
		this.customerId = 101;
		this.name = "Ram";
		this.location = "Bengaluru";
		this.email = "ram@gmail.com";
		count++;
	}
	public Customer(int customerId,String name,String location,String email){
		this.customerId = customerId;
		this.name = name;
		this.location = location;
		this.email = email;
		count++;

	}

	public Customer(String name, String location, String email) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		count++;

	}

	@Override
	public String toString() {
		return name +"\t" + location + "\t" + email + "\t" + customerId ;
		 
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(customerId, email, location, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(email, other.email)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}

}
