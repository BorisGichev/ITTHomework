package storeHouse;

import java.util.ArrayList;
import java.util.List;

public class Store extends CommonStore implements Runnable {
	private StoreHouse storeHouse;
	private Thread storeHouseThread;
	
	private List<Thread> customers;

	public Store(StoreHouse storeHouse,Thread storeHouseThread) {
		super();
		this.setStoreHouse(storeHouse);
		this.setStoreHouseThread(storeHouseThread);
		this.customers=new ArrayList<Thread>();
	}

	private void setStoreHouse(StoreHouse storeHouse) {
		if (storeHouse != null) {
			this.storeHouse = storeHouse;
		}

	}
	
	private void setStoreHouseThread(Thread storeHouseThread) {
		if (storeHouseThread != null) {
			this.storeHouseThread = new Thread(storeHouseThread);
		}

	}

	public void addCustomer(Thread customer){
		if (customer!=null) {
			this.customers.add(customer);
		}
	}
	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			System.out.println(Thread.currentThread().getName()+": runs");

			while (!this.isSuplierNeeded()) {
				synchronized (this) {
					try {
						System.out.println(Thread.currentThread().getName()+": waits");

						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
			
			for (String productType : this.storage.keySet()) {

				for (String productName : this.storage.get(productType).keySet()) {
					if (this.storage.get(productType).get(productName) < storeHouse.getTrigerCount()) {
						this.storeHouse.removeProduct(productName, storeHouse.getDeliveryCount());
						this.addProduct(productName,storeHouse.getDeliveryCount());
						System.out.println(Thread.currentThread().getName()+": takes from StoreHouse");
					}

				}

			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (storeHouse) {
				if (storeHouse.isSuplierNeeded()) {
					System.out.println(Thread.currentThread().getName()+": calling storeHouse");
					storeHouse.notify();
				}

			}

			

		}

	}

}
