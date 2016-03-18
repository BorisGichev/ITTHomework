package banka;

public abstract class ProductOfBank {
	private static final int MAX_PERIOD = 60;
	private static final int MIN_PERIOD = 1;
	private String name;
	private double percent;
	private double period;
	private double initialAmmount;
	private double balance;
	private double perMonth;
	private Client client;

	public ProductOfBank(double period, double ammount, double percent,String name,Client client) {
		this.setPeriod(period);
		this.setPercent(percent);
		this.setInitialAmmount(ammount);
		this.setClient(client);
		this.setName(name+"for "+period+" months"+", "+percent+" % of interest");


	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		if (client!=null) {
			this.client = client;
		}
		
	}


	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		if (period >= MIN_PERIOD && period <= MAX_PERIOD) {
			this.period = period;
		}
	}

	public double getInitialAmmount() {
		return initialAmmount;
	}

	public void setInitialAmmount(double ammount) {
		if (ammount>0) {
			this.initialAmmount = ammount;
		}
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		if (percent > 0) {
			this.percent = percent;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name!=null&&name.trim().length()!=0) {
			this.name = name;
		}
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getPerMonth() {
		return perMonth;
	}


	public void setPerMonth(double perMonth) {
		this.perMonth = perMonth;
	}

}
