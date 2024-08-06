class NewCustomer implements Comparable<NewCustomer>{
	private static int count;
	private int customerId;
	private String name;
	private String location;
	private String email;
	public NewCustomer(int customerId, String name, String location, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.location = location;
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public static int getCount() {
		return count;
	}
	
	@Override
	public int compareTo(NewCustomer customer) {
		return this.name.compareTo(customer.getName());
	}
	
	
}
 