package storeHouse;

import java.util.HashMap;
import java.util.Map;

public abstract class CommonStore {
	private static final Integer INITIAL_COUNT = 25;
	private static final Integer MIN_COUNT_TRIGGER_DELIVERY = 15;
	private static final int COUN_TO_SUPPLY_WHEN_LOW = 15;


	protected Map<String, Map<String, Integer>> storage;
	private Map<String, String> productList;

	public CommonStore() {
		this.storage = new HashMap<String, Map<String, Integer>>();
		this.productList = new HashMap<String, String>();	
		this.fillProductList();
		this.fillProductsInitialcount();
	}

	private void fillProductList() {
		this.productList.put("banana", "Fruit");
		this.productList.put("orange", "Fruit");
		this.productList.put("apple", "Fruit");
	
		this.productList.put("potato", "Vegetable");
		this.productList.put("egg plant", "Vegetable");
		this.productList.put("cucumber", "Vegetable");
	
		this.productList.put("pork", "Meat");
		this.productList.put("chicken", "Meat");
		this.productList.put("beef", "Meat");
	
	}

	private void fillProductsInitialcount() {
		for (String product : this.productList.keySet()) {
			this.addProduct(product, INITIAL_COUNT);
	
		}
	
	}


	public void addProduct(String name, int count) {
		if (name == null || name.trim().length() == 0 || count < 0) {
			return;
		}

		String typeOfProduct = this.productList.get(name.toLowerCase());
		if (typeOfProduct == null) {
			System.out
					.println("The Store house does not work with with kind of thing");
			return;
		}
		synchronized (storage) {
			if (!(storage.keySet().contains(typeOfProduct))) {
				storage.put(typeOfProduct, new HashMap<String, Integer>());
				storage.get(typeOfProduct).put(name, count);
				return;

			}

			if ((storage.keySet().contains(typeOfProduct) && storage
					.get(typeOfProduct).keySet().contains(name))) {
				storage.get(typeOfProduct).put(name,
						storage.get(typeOfProduct).get(name) + count);
				return;
			}
			storage.get(typeOfProduct).put(name, count);
		}

	}

	public void removeProduct(String name, int count) {
		if (name == null || name.trim().length() == 0 || count < 0) {
			return;
		}

		synchronized (storage) {
			for (String productType : this.storage.keySet()) {
				for (String productName : this.storage.get(productType)
						.keySet()) {
					if (productName.contains(name)
							&& this.storage.get(productType).get(productName) >= count) {
						storage.get(productType).put(name,
								storage.get(productType).get(name) - count);

						return;
					}

				}

			}
		}

	}

	public void printStorage() {
		System.out.println("Storehouse "
				+ " has this in stock for you!!!");
		for (String productType : this.storage.keySet()) {
			System.out.println(productType + "s:");
			for (String productName : this.storage.get(productType).keySet()) {
				System.out.print(productName + "-");

				System.out.println(this.storage.get(productType).get(
						productName));
			}

		}

	}

	public Integer getTrigerCount() {
		return CommonStore.MIN_COUNT_TRIGGER_DELIVERY;
	}

	public Integer getDeliveryCount() {
		return CommonStore.COUN_TO_SUPPLY_WHEN_LOW;
	}


	public boolean isSuplierNeeded() {
		for (String productType : this.storage.keySet()) {

			for (String productName : this.storage.get(productType).keySet()) {
				if (this.storage.get(productType).get(productName) < MIN_COUNT_TRIGGER_DELIVERY) {
					return true;

				}

			}

		}
		return false;
	}


	
}