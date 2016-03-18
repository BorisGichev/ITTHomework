package storeHouse;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Runnable {
	private static final int SLEEP_TIME = 1000;
	private static final int TAKING_NUMBER_OF_PRODUCTS = 7;
	private Thread storeThread;
	private Store store;
	private static List<String> productList;

	public Customer(Store store,Thread storeThread) {
		this.setStore(store);
		this.setStoreThread(storeThread);
	}

	public void setStore(Store store) {
		if (store != null) {
			this.store = store;
		}

	}
	public void setStoreThread(Thread storeThread) {
		if (storeThread != null) {
			this.storeThread = storeThread;
		}

	}

	{
		Customer.productList = new ArrayList<String>();
		productList.add("banana");
		productList.add("orange");
		productList.add("apple");

		productList.add("potato");
		productList.add("egg plant");
		productList.add("cucumber");

		productList.add("pork");
		productList.add("chicken");
		productList.add("beef");

	}

	@Override
	public void run() {

		while (storeThread.isAlive()) {

			while (storeThread.isInterrupted()) {
				synchronized (storeThread) {
					try {
						System.out.println(Thread.currentThread().getName()
								+ ": waiting store");

						storeThread.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (store) {
				Integer randIndex = (int) (Math.random() * Customer.productList
						.size());
				Integer randCount = (int) ((Math.random() * TAKING_NUMBER_OF_PRODUCTS) + 1);

				String product = Customer.productList.get(randIndex);

				System.out.println(Thread.currentThread().getName()+ ": taking " + randCount + " " + product);
				store.removeProduct(product, randCount);
				if (store.isSuplierNeeded()) {
					System.out.println(Thread.currentThread().getName()+ ": calling store");
					store.notify();
				}

			}

		}

	}

}
