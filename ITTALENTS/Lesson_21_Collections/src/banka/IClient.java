package banka;

public interface IClient {
	void openRandomDeposit(String type) throws ClientException;
	void wantCredit(String type) throws BankException;
	void payCredits() throws ClientException;
	void setBank(IBank bank);
	public void getPaid();
	

}
