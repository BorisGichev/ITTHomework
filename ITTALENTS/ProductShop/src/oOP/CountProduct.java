package oOP;

public class CountProduct extends Product {
	

	private int productCount;
	
	
	public CountProduct(String name, double price,int productCount) {
		super(name, price);
		this.setProductCount(productCount);
		
	}

	

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		if (productCount<0) {
			return;
		}
		this.productCount = productCount;
	}
	@Override
	public String toString() {
		return "CountProduct [productCount=" + productCount + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}
	

}
