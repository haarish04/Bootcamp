public class Product {
	private String productCode;
	private String productName;
	private double price;
	private char categoryCode;
	
	private static int prodCounter=100;
	
	Product(String productName, char categoryCode, double price){
		this.productName= productName;
		this.categoryCode= categoryCode;
		this.price= price;
		this.productCode= generateProductCode();
		
	}
	
	Product(String productName, double price){
		this.categoryCode= 'E';
		this.productCode= generateProductCode();
		this.productName= productName;
		this.price= price;
		
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(char categoryCode) {
		if(categoryCode == 'E' || categoryCode == 'A' || categoryCode == 'T')
			this.categoryCode = categoryCode;
		else
			categoryCode= 0;
	}

	public static int getProdCounter() {
		return prodCounter;
	}

	
	private String generateProductCode() {
		int count= Product.prodCounter++;
		return this.categoryCode + Integer.toString(count);
		
	}
	
	public String getProductDetails() {
		return "Product : Code - "+this.productCode + ", Name -" + this.productName + ", price - "+ this.price + ", category -" + this.categoryCode;
		
		
		
		
	}

}
