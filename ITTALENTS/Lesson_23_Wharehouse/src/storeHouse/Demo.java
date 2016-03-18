package storeHouse;

public class Demo {

	public static void main(String[] args) {
	Suplier supplier = new Suplier();
	Thread supplierThread = new Thread(supplier,"Supplier");

	StoreHouse storeHouse = new StoreHouse(supplier,supplierThread);
	Thread storeHouseThread=new Thread(storeHouse,"StoreHouse");

	supplier.setStorehouse(storeHouse);

				
				
	Store store1=new Store(storeHouse, storeHouseThread);
	storeHouse.addStore(store1);
	
		Thread store1Thread = new Thread(store1,"Store1");
//		Thread store2 = new Thread(new Store("Tmarket", hale, jenskiPazar),"Store2");
//		Thread store3 = new Thread(new Store("Slance", hale, jenskiPazar),"Store3");

		
		Thread customer1=new Thread(new Customer(store1,storeHouseThread),"Customer 1");
		
		store1.addCustomer(customer1);
		
		
		supplierThread.start();
		storeHouseThread.start();
		
		store1Thread.start();
//		store2.start();
//		store3.start();
		
		customer1.start();

		
		
		
		
//		hale.deliverProductLowOnCount();
//		hale.removeProduct("beef", 25);
//		hale.printStorage();
//		hale.printStorage();
	}

}
