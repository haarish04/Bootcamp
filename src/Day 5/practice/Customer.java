public class Customer {
	int customerId;
	private String name;
	String location;
	String email;
	
	Customer(){
		this.customerId= 0;
		this.name= "abc";
		this.location= "blr";
		this.email= "@";
	}
	
	Customer(int id, String name, String location, String email){
		this.customerId= id;
		this.name= name;
		this.location= location;
		this.email= email;
		
	}
	
	public String getName() {
		return name;
	}

	

}
