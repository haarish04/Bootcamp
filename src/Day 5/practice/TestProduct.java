public class TestProduct {
	public static void main(String[] args) {
		Product prod1= new Product("Laptop", 'E', 1000);
		System.out.println(prod1.getProductDetails());
		
		Product prod2 = new Product("Mouse", 200);
		System.out.println(prod2.getProductDetails());

	}

}
