package banka;

public abstract class Credit extends ProductOfBank {

	

	public Credit(double period, double ammount, double percent,String name,Client client) {
		super(period, ammount, percent,name, client);
		this.setPerMonth(Credit.calculateMonthlyPayment(ammount, percent, period));
		this.setBalance(-(Credit.calculateMonthlyPayment(ammount, percent, period)*period));

	}

	@Override
	public String toString() {
		return "Credit [ Name = " + getName() + ", Initial Amount = " + getInitialAmmount()
				 + ", Balance=" + getBalance()+", Monthly payment=" + getPerMonth()+"]";
	}
	
	static public double calculateMonthlyPayment(double ammount,double percent, double period) {

		double wholeSum = ((ammount / 100) * period * percent) + ammount;
		return (wholeSum / period);


	}
	public boolean payForMonth(){
		if (this.getBalance()!=0) {
			this.setBalance(this.getBalance()+this.getPerMonth());
			return true;
		}
		return false;
	}
}
