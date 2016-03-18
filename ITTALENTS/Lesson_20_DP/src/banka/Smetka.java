package banka;

public abstract class Smetka {
	static Bank selskata;
	private double balance;
	private double interest;
	private IObserver holder;

	public Smetka(double balance, double interest) {

		this.balance = balance;
		this.interest = interest;

	}
	
	public void Ulihvi() {
		this.balance+=(this.balance/100)*interest;
		
	}
	
	public void GiveMoney() {
		this.getHolder().takeMoney((this.balance/100)*interest);
		
	}
	
	
	public static void setBank(Bank banka) {
		if (banka != null) {
			Smetka.selskata = banka;
		}
	}
	
	public void setUser(User user) {
		if (user != null) {
			this.holder=user;
		}
	}

	@Override
	public String toString() {
		return "Smetka [balance=" + balance + ", interest=" + interest +", holder=" + this.getHolder().toString() + "]";
	}

	static public Smetka createSmetka(String name, double balance) {
		if (name.equalsIgnoreCase("deb")) {
			Debitna temp = new Debitna(balance);
			return temp;
		}
		if (name.equalsIgnoreCase("spes")) {
			Spestovna temp = new Spestovna(balance);
			return temp;
		}
		System.out.println("Notihing is created");
		return null;

	}

	public IObserver getHolder() {
		return holder;
	}


}
