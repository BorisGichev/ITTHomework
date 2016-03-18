package storeHouse;

import java.util.ArrayList;
import java.util.List;


public class StoreHouse extends CommonStore implements Runnable, IStoreHouse {

	private List<Store> stores;
	private Suplier suppliear;
	private Thread suplierThread;

	public StoreHouse(Suplier supplier, Thread supplierThread) {
		super();
		this.suppliear = supplier;
		this.suplierThread = supplierThread;
		this.stores = new ArrayList<Store>();

	}

	public void addStore(Store store) {
		if (store != null) {
			stores.add(store);
		}

	}

	@Override
	public void run() {

		while (suplierThread.isAlive()){
			
			System.out.println("StoreHouse: runs");
			boolean needSuplier = false;

			for (int j = 0; j < stores.size(); j++) {
				if (stores.get(j).isSuplierNeeded()) {
					needSuplier = true;
					break;
				}
			}

			while (!needSuplier) {
				try {
					synchronized (stores) {
						System.out.println("StoreHouse: waits");

						stores.wait();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			for (Store store : stores) {
				for (String productType : store.storage.keySet()) {

					for (String productName : store.storage.get(productType)
							.keySet()) {
						if (store.storage.get(productType).get(productName) < store
								.getTrigerCount()) {
							store.addProduct(productName,this.getDeliveryCount());
							System.out.println("StoreHouse: suplies");
						}

					}

				}

			}

			synchronized (suppliear) {

				if (this.isSuplierNeeded()) {
					System.out.println("StoreHouse: calls stores");
					suppliear.notifyAll();
				}
			}

		}

	}

}
