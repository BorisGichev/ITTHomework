package storeHouse;

public class Suplier implements Runnable {
	private StoreHouse storeHouse;

	public Suplier() {

	}
	
	public void setStorehouse(StoreHouse storehouse){
		if (storehouse!=null) {
			this.storeHouse=storehouse;
		}
	}


	@Override
	public void run() {
		for (int i = 0; i < 3 && !Thread.currentThread().isInterrupted();) {
			System.out.println("Suplier: runs");
			while (!storeHouse.isSuplierNeeded()) {
				try {
					synchronized (storeHouse) {
						System.out.println("Suplier: waits");

						storeHouse.wait();
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			for (String productType : this.storeHouse.storage.keySet()) {

				for (String productName : this.storeHouse.storage.get(
						productType).keySet()) {
					if (this.storeHouse.storage.get(productType).get(productName) < storeHouse.getTrigerCount()) {
						storeHouse.addProduct(productName,storeHouse.getDeliveryCount());
						System.out.println("Suplier: suplies");
						i++;
					}

				}

			}
			synchronized (storeHouse) {
				if (!storeHouse.isSuplierNeeded()) {
					System.out.println("Supplier: calls store");
					storeHouse.notifyAll();
				}
			}

		}

	}

}
