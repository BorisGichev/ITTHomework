package oOP;

public class Shop {
	private int freeInventoryPlaces;
	private String name;
	private String address;
	private double moneyInSafe;
	private Product[] inventory;
	private int placeForAdding;

	public Shop(String name, String address, double moneyInSafe,
			int inventoryPlaces) {
		this.name = name;
		this.address = address;
		this.moneyInSafe = moneyInSafe;
		this.freeInventoryPlaces = inventoryPlaces;
		this.inventory = new Product[freeInventoryPlaces];
		this.placeForAdding = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() == 0) {
			return;
		}

		this.address = address;
	}

	public double getMoneyInSafe() {
		return moneyInSafe;
	}

	public void addMoneyInSafe(double moneyInSafe) {
		if (moneyInSafe < 0) {
			return;
		}
		this.moneyInSafe += moneyInSafe;
	}

	public void takeMoneyInSafe(double moneyInSafe) {
		if (moneyInSafe > this.moneyInSafe) {
			System.out.println("Not enough money in the safe");
			return;
		}
		this.moneyInSafe -= moneyInSafe;
	}

	public void addProductInInventory(Product product) {
		if (this.freeInventoryPlaces <= 0 || product == null) {
			return;
		}
		this.inventory[this.placeForAdding]=product;
		this.placeForAdding++;
		this.freeInventoryPlaces--;

	}
	public void removeProductInInventory(int place) {
		
		this.inventory[place]=null;

	}
	
	public void showInventory(){
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i]!=null) {
				System.out.println(inventory[i].toString());
			}
		}
	}
	
	public Product getProduct(int place){
		return inventory[place];
	}
	public int checkKiloProduct(String name, double kilo){
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i].getName().equals(name)&&((KiloProduct)inventory[i]).getKilo()>=kilo) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return-1;
	}

}
