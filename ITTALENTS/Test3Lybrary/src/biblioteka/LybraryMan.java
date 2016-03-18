package biblioteka;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LybraryMan extends Thread {

	private static final int TIME_SLEEPING = 1000;
	private Map<ReadingMaterial, Double> wachtList;

	public LybraryMan() {
		this.setDaemon(true);
		wachtList = new HashMap<ReadingMaterial, Double>();
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(TIME_SLEEPING);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (ReadingMaterial rm : wachtList.keySet()) {
				int seconds = (rm.getTime() / 1000);
				Duration timeelapsed = Duration.between(rm.getLastTakenTime(),
						LocalDateTime.now());
				if (timeelapsed.getSeconds() > seconds) {
					synchronized (wachtList) {
						wachtList.put(rm,
								(wachtList.get(rm) + rm.getPrice() * 0.01));

					}

				}
			}
		}
	}
	
	public int getNumberOfTakenMaterials() {
		return wachtList.size();
	}
	
	public SortedSet<ReadingMaterial> getMaterialsByDateTaken() {
		TreeSet<ReadingMaterial> set = 
				new TreeSet<ReadingMaterial>(
						(r1, r2) -> r1.getLastTakenTime().compareTo(r2.getLastTakenTime()));
		set.addAll(wachtList.keySet());
		return set;
	}
	
	public SortedSet<ReadingMaterial> getMaterialsOverdue() {
		TreeSet<ReadingMaterial> set = 
				new TreeSet<ReadingMaterial>(
						(r1, r2) -> wachtList.get(r1).compareTo(wachtList.get(r2)));
		set.addAll(wachtList.keySet());
		return set;
	}
	
	public void addMaterialToWatch(ReadingMaterial readingMaterial) {
		
			synchronized (wachtList) {
				wachtList.put(readingMaterial, readingMaterial.getPrice());	
			}
			
		
	}

	public void removeMaterialToWatch(ReadingMaterial readingMaterial) {
		if (readingMaterial != null && wachtList.containsKey(readingMaterial)) {
			synchronized (wachtList) {
				wachtList.remove(readingMaterial);
			}
		}
	}
	
	public Double getHowMuchIHaveToPayForThis(ReadingMaterial rm) {
		return wachtList.get(rm);
	}

}
