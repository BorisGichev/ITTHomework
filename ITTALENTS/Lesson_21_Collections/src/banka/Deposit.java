package banka;

public abstract class Deposit extends ProductOfBank {

	public Deposit(double period, double ammount, double percent,String name,Client client) {
		super(period, ammount, percent,name,client);
		this.setBalance(ammount);
		
	}
	
	@Override
	public String toString() {
		return "Deposit [ Name = " + getName() + ", Initial Amount = " + getInitialAmmount()
				 + ", Balance=" + getBalance()+ "]";
	}

	public void addInterest(){
		this.setBalance(this.getBalance()+this.getBalance()*(this.getPercent()/100));
	}
	
	
	

	

}
