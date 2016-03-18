package oOP;

public abstract class Product {

	

	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			return;
		}
		this.price = price;
	}
	
	@Override
	public abstract String toString();

}
