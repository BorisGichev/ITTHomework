package store;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MusicStore implements Runnable, IMusicStore {
	static final int INITIAL_COUNT = 5;
	private static final int ONE_MONTH = 5000;
	private String name;
	private double money;
	private Sup sup;


	private Map<String, Map<String, Integer>> storage;

	Map<String, String> instrumentList;
	private Map<String, Double> priceList;
	private Map<String, Integer> countSoldInstrumentsList;

	public MusicStore(String name, double money) {
		this.setName(name);
		this.setMoney(money);
		this.storage = new HashMap<String, Map<String, Integer>>();
		this.instrumentList = new TreeMap<String, String>();
		this.priceList = new HashMap<String, Double>();
		this.countSoldInstrumentsList = new TreeMap<String, Integer>();

		this.fillInstrumentList();
		this.fillInstrumentPrices();
		this.fillInstumentsWhenTheStoreIsCreated();
		this.fillCountSoldInstrumentsList();
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && name.trim().length() != 0) {
			this.name = name;
		}

	}

	@Override
	public double getMoney() {
		return money;
	}

	private void setMoney(double money) {
		if (money > 0) {

			this.money = money;
		}
	}

	@Override
	public void sellInstrument(String name, int count) {
		if (!isInputValid(name, count)) {
			return;
		}

		synchronized (this) {
			name = name.toLowerCase();
			String type = this.instrumentList.get(name);

			if (this.storage.containsKey(type)
					&& this.storage.get(type).containsKey(name)
					&& this.storage.get(type).get(name) >= count) {

				storage.get(type)
						.put(name, storage.get(type).get(name) - count);
				this.setMoney(this.getMoney() + count
						* this.priceList.get(name));
				this.countSoldInstrumentsList.put(name,
						this.countSoldInstrumentsList.get(name) + count);

			} else {
				if (this.storage.containsKey(type)
						&& this.storage.get(type).containsKey(name)) {
					sup.setCountNeeded(count - storage.get(type).get(name));
					sup.setInstrumentNeeded(name);
					this.notifyAll();

				} else {
					sup.setCountNeeded(count);
					sup.setInstrumentNeeded(name);
					this.notifyAll();

				}

			}
		}

	}

	@Override
	public void buyInstrument(String name, int count) {
		if (!isInputValid(name, count)) {
			return;
		}

		if (this.getMoney() < (count * this.priceList.get(name))) {
			try {
				throw new MSException("The store has no money to buy ");
			} catch (MSException e) {
				System.err.println(e.getMessage());
			}
			return;
		}

		String typeOfProduct = this.instrumentList.get(name.toLowerCase());

		synchronized (storage) {
			if (!(storage.keySet().contains(typeOfProduct))) {
				storage.put(typeOfProduct, new HashMap<String, Integer>());
				storage.get(typeOfProduct).put(name, count);
				this.setMoney(this.getMoney() - count
						* this.priceList.get(name));
				return;

			}

			if ((storage.keySet().contains(typeOfProduct) && storage
					.get(typeOfProduct).keySet().contains(name))) {
				storage.get(typeOfProduct).put(name,
						storage.get(typeOfProduct).get(name) + count);
				this.setMoney(this.getMoney() - count
						* this.priceList.get(name));
				return;
			}
			storage.get(typeOfProduct).put(name, count);
			this.setMoney(this.getMoney() - count * this.priceList.get(name));

		}

	}

	@Override
	public void printAllByType() {
		Map<String, Set<String>> byType = new TreeMap<String, Set<String>>();

		for (Entry<String, String> entry : this.instrumentList.entrySet()) {
			if (!(byType.keySet().contains(entry.getValue()))) {
				byType.put(entry.getValue(), new TreeSet<String>());
				byType.get(entry.getValue()).add(entry.getKey());
			}

			else {
				byType.get(entry.getValue()).add(entry.getKey());
			}
		}

		System.out.println("Music Store " + this.getName()
				+ " catalog by instruments types!!!");

		for (String type : byType.keySet()) {
			System.out.println(type + ":");
			for (String name : byType.get(type)) {
				this.printSingleInstrument(name);
			}

		}
		// return byType;
	}

	@Override
	public void printAllByName() {

		System.out.println("Music Store " + this.getName()
				+ " catalog by instruments names!!!");

		for (String name : this.instrumentList.keySet()) {
			this.printSingleInstrument(name);
		}

	}

	@Override
	public void printAllByPriceAsc() {
		this.printAllByPrice("");

	}

	@Override
	public void printAllByPriceDesc() {
		this.printAllByPrice("desc");

	}

	@Override
	public void printAllByPrice(String order) {

		SortedSet<Map.Entry<String, Double>> sortedset = new TreeSet<Map.Entry<String, Double>>(
				new Comparator<Map.Entry<String, Double>>() {
					@Override
					public int compare(Map.Entry<String, Double> e1,
							Map.Entry<String, Double> e2) {
						if (order.equals("desc")) {
							return e2.getValue().compareTo(e1.getValue());

						}
						return e1.getValue().compareTo(e2.getValue());
					}
				});

		sortedset.addAll(this.priceList.entrySet());

		System.out.println("Music Store " + this.getName()
				+ " catalog by instruments price!!!");

		for (Map.Entry<String, Double> name : sortedset) {
			this.printSingleInstrument(name.getKey());

		}

	}

	@Override
	public void printInventory() {
		System.out.println("Music Store " + this.getName()
				+ " inventory  at the moment by instruments types!!!");
		for (String instrumentType : this.storage.keySet()) {
			System.out.println(instrumentType + ":");
			for (String instrumentName : this.storage.get(instrumentType)
					.keySet()) {
				this.printSingleInstrument(instrumentName);

			}

		}

	}

	@Override
	public void prinatAllSales() {

		SortedSet<Map.Entry<String, Integer>> sortedset = new TreeSet<Map.Entry<String, Integer>>(
				(e1, e2) -> {
					if ((e2.getValue().compareTo(e1.getValue()) == 0)) {
						return e2.getKey().compareTo(e1.getKey());
					}
					return e2.getValue().compareTo(e1.getValue());
				});

		sortedset.addAll(this.countSoldInstrumentsList.entrySet());

		System.out.println("Music Store " + this.getName() + " all sales !!!");

		for (Map.Entry<String, Integer> name : sortedset) {
			System.out
					.println(name.getValue() + " " + name.getKey() + "s sold");

		}

	}

	@Override
	public void printGeneratedIncome() {
		Double income = 0d;
		for (String name : this.instrumentList.keySet()) {
			income += this.countSoldInstrumentsList.get(name)
					* this.priceList.get(name);
		}
		System.out.println("Income is " + income);
	}

	@Override
	public void showMostSoldInstrument() {
		String mostWanted = "";
		int mostTimesSold = 0;
		for (String name : this.countSoldInstrumentsList.keySet()) {
			if (this.countSoldInstrumentsList.get(name) > mostTimesSold) {
				mostWanted = name;
				mostTimesSold = this.countSoldInstrumentsList.get(name);
			}
		}
		System.out.println("At the momenet the most wanted instrument is \""
				+ mostWanted + "\", it has been sold " + mostTimesSold
				+ " times");
	}

	@Override
	public void showLeastSoldInstrument() {
		String leastWanted = "";
		int leastTimesSold = Integer.MAX_VALUE;
		for (String name : this.countSoldInstrumentsList.keySet()) {
			if (this.countSoldInstrumentsList.get(name) < leastTimesSold
					&& this.countSoldInstrumentsList.get(name) != 0) {
				leastWanted = name;
				leastTimesSold = this.countSoldInstrumentsList.get(name);
			}
		}
		if (leastTimesSold == Integer.MAX_VALUE) {
			System.out.println("Nothing is sold yet");
			return;
		}
		System.out.println("At the momenet the least wanted instrument is \""
				+ leastWanted + "\", it has been sold " + leastTimesSold
				+ " times");
	}

	@Override
	public void mostWantedType() {
		String mostWantedType = "";
		int mostTimesSold = 0;
		int mostTimesTemp = 0;

		for (String type : storage.keySet()) {
			for (String name : storage.get(type).keySet()) {
				mostTimesTemp += this.countSoldInstrumentsList.get(name);
			}
			if (mostTimesTemp > mostTimesSold) {
				mostTimesSold = mostTimesTemp;
				mostWantedType = type;
			}
			mostTimesTemp = 0;
		}

		System.out
				.println("At the momenet the most wanted TYPE of instrument is \""
						+ mostWantedType
						+ "\", instruments sold "
						+ mostTimesSold + " times");

	}

	@Override
	public void mostLucrativeType() {

		String mostMoneyType = "";
		int mostMoneySold = 0;
		int mostMoneyTemp = 0;

		for (String type : storage.keySet()) {
			for (String name : storage.get(type).keySet()) {
				mostMoneyTemp += this.countSoldInstrumentsList.get(name)
						* this.priceList.get(name);
			}
			if (mostMoneyTemp > mostMoneySold) {
				mostMoneySold = mostMoneyTemp;
				mostMoneyType = type;
			}
			mostMoneyTemp = 0;
		}

		System.out
				.println("At the moment the most lucrative TYPE of instrument is \""
						+ mostMoneyType
						+ "\", it has generated "
						+ mostMoneySold + " income");

	}

	@Override
	public void printSingleInstrument(String name) {

		String instrumentType = this.instrumentList.get(name);

		int countInStore;
		if ((this.storage.keySet().contains(instrumentType) && this.storage
				.get(instrumentType).keySet().contains(name))) {
			countInStore = this.storage.get(instrumentType).get(name);
		} else {
			countInStore = 0;
		}
		System.out.println(countInStore + " " + name + "s - "
				+ this.priceList.get(name) + " dollars each");

	}

	private void fillInstrumentList() {
		this.instrumentList.put("violin", "String instruments");
		this.instrumentList.put("viola", "String instruments");
		this.instrumentList.put("contrabass", "String instruments");
		this.instrumentList.put("arpha", "String instruments");
		this.instrumentList.put("guitar", "String instruments");
		this.instrumentList.put("drum", "Bang Instruments");
		this.instrumentList.put("tarambuka", "Bang Instruments");
		this.instrumentList.put("big drumm", "Bang Instruments");
		this.instrumentList.put("trumpet", "Blow Instruments");
		this.instrumentList.put("trombon", "Blow Instruments");
		this.instrumentList.put("tube", "Blow Instruments");
		this.instrumentList.put("flute", "Blow Instruments");
		this.instrumentList.put("organ", "Keys Instruments");
		this.instrumentList.put("piano", "Keys Instruments");
		this.instrumentList.put("akordeon", "Keys Instruments");
		this.instrumentList.put("bass guitar", "Electronic Instruments");
		this.instrumentList.put("sintezator", "Electronic Instruments");
		this.instrumentList.put("electrik violin", "Electronic Instruments");

	}

	private void fillInstrumentPrices() {
		Double price = 10d;

		for (String name : this.instrumentList.keySet()) {
			this.priceList.put(name, price);
			price += 2;
		}

	}

	private void fillInstumentsWhenTheStoreIsCreated() {

		for (String product : this.instrumentList.keySet()) {
			double rand = Math.random();
			if (rand > 0.5) {
				this.buyInstrument(product, INITIAL_COUNT);
			}

		}

	}

	private void fillCountSoldInstrumentsList() {

		for (String name : this.instrumentList.keySet()) {
			this.countSoldInstrumentsList.put(name, 0);
		}

	}

	private boolean isInputValid(String name, int count) {
		if (name == null || name.trim().length() == 0 || count < 0) {
			try {
				throw new MSException("Invalid request you dumbass");
			} catch (MSException e) {
				System.err.println(e.getMessage());
			}
			return false;
		}
		name = name.toLowerCase();
		if (!this.instrumentList.keySet().contains(name)) {
			try {
				throw new MSException(
						"Sorry at the moment we do not have this instrument or you don`t know how to spell");
			} catch (MSException e) {
				System.err.println(e.getMessage());
			}
			return false;
		}
		return true;
	}

	@Override
	public void run() {
		int i = 1;
		while (i < 5) {
			System.out.println("Music Store runs");
			try {
				System.out.println("Music Store waits");
				Thread.sleep(ONE_MONTH);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean flag=false;
			for (Entry<String, String> entry : this.instrumentList.entrySet()) {
				if ((this.storage.keySet().contains(entry.getValue()))&&
						(this.storage.get(entry.getValue()).keySet().contains(entry.getKey()))&&
						(this.storage.get(entry.getValue()).get(entry.getKey())==0)) {					
						System.out.println("Music Store byes");
						this.buyInstrument(entry.getKey(), INITIAL_COUNT);
						flag=true;
				}
				if ((!this.storage.keySet().contains(entry.getValue()))||
						(!this.storage.get(entry.getValue()).keySet().contains(entry.getKey()))) {					
						System.out.println("Music Store byes");
						this.buyInstrument(entry.getKey(), INITIAL_COUNT);
						flag=true;
				}
			}
			if (flag) {
				this.printInventory();
			}
			i++;
		}

	}

	public void setSup(Sup sup) {
		if (sup != null) {
			this.sup = sup;
		}

	}

}
