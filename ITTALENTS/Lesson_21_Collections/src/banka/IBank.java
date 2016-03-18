package banka;

public interface IBank {
	Deposit takeDeposit(double ammount,String type,Client client);
	void payInterest();
	public void printAll();
	Credit giveCredit(double ammount,double period,String type,Client client) throws BankException;

}
