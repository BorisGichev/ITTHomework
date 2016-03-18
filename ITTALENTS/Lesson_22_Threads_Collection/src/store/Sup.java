package store;

import java.util.HashMap;
import java.util.Map;

public class Sup implements Runnable {
	private MusicStore musicStore;
	private Map<String, Integer> deliveryTimes;
	private String instrumentNeeded;
	private int countNeeded=0;

	public Sup() {
		deliveryTimes = new HashMap<String, Integer>();

	}

	private void fillInstrumentDeliveryTimeList() {
		Integer time = 500;

		for (String name : musicStore.instrumentList.keySet()) {
			this.deliveryTimes.put(name, time);
			time += 50;
		}

	}

	public void SetMusicStore(MusicStore musicStore) {
		if (musicStore != null) {
			this.musicStore = musicStore;
			this.fillInstrumentDeliveryTimeList();
		}
	}

	@Override
	public void run() {
		int i =1;
		while(i <5){
			System.out.println("Suplieer runs");
			if (countNeeded==0) {
				synchronized (musicStore) {
					try {
						System.out.println("Suplieer waits");
						musicStore.wait();
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			System.err.println("The supplier will need "+deliveryTimes.get(instrumentNeeded)*countNeeded+" seconds to deliver "+countNeeded+" "+instrumentNeeded);
			this.countNeeded=0;
			i++;
		}
		
		

	}


	public int getCountNeeded() {
		return countNeeded;
	}

	public void setCountNeeded(int countNeeded) {
		this.countNeeded = countNeeded;
	}

	public String getInstrumentNeeded() {
		return instrumentNeeded;
	}

	public void setInstrumentNeeded(String instrumentNeeded) {
		this.instrumentNeeded = instrumentNeeded;
	}
}
