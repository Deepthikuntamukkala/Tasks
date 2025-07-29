
public abstract class Product {
	String id;
	String name;
	double price;
	
	public Product(String id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public abstract void displayDetails();
		public double getPrice() {
			return price;
		}
		
			
	
}


