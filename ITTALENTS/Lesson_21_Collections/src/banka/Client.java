package banka;

import java.util.HashSet;
import java.util.Set;

public class Client extends NameAndAddress implements IClient {
	private static final int MIN_PERIOD_FOR_CREDIT = 1;
	private static final int MAX_PERIOD_FOR_CREDIT = 60;
	private static final int MAX_PERCEN_OF_RANDOM_DEPOSIT = 100;
	private static final int MIN_PERCENT_OF_RANDOM_DEPOSIT = 80;
	private static final int INITIAL_PLACES_FOR_CREDTS = 5;
	private static final int INITIAL_PLACES_FOR_DEPOSITS = 5;
	private static final double INITIAL_MONEY_COEF = 1.6;
	private double money;
	private double income;
	private Set<Deposit> deposits;
	private Set<Credit> credits;
	private IBank bank;

	public Client(String name, String address, double income) {
		super(name, address);
		this.setIncome(income);
		this.setMoney(income * INITIAL_MONEY_COEF);

		this.deposits = new HashSet<Deposit>(INITIAL_PLACES_FOR_DEPOSITS);
		this.credits = new HashSet<Credit>(INITIAL_PLACES_FOR_CREDTS);

	}

	public void getPaid() {
		this.money += income;
	}

	@Override
	public void openRandomDeposit(String type) throws ClientException {
		if (this.money > 0) {
			double ammount = ((((Math.random() * (MAX_PERCEN_OF_RANDOM_DEPOSIT - MIN_PERCENT_OF_RANDOM_DEPOSIT)) + MIN_PERCENT_OF_RANDOM_DEPOSIT) * this.money) / 100);
			Deposit temp = this.bank.takeDeposit(ammount, type, this);
			if (temp != null) {
				this.deposits.add(temp);
				this.setMoney(this.getMoney() - ammount);

			}

		} else {
			throw new ClientException("I do not have moeny to deposit");
		}

	}

	@Override
	public void wantCredit(String type) throws BankException {
		double ammount = (((Math.random()) + 1) * this.getIncome());
		double period = (int) ((Math.random() * (MAX_PERIOD_FOR_CREDIT-MIN_PERIOD_FOR_CREDIT)) + MIN_PERIOD_FOR_CREDIT);
		Credit temp = this.bank.giveCredit(ammount, period, type, this);
		if (temp != null) {
			this.credits.add(temp);
			this.setMoney(this.getMoney() + ammount);

		}

	}

	@Override
	public void payCredits() throws ClientException {

		double totalPayment = 0;
		for (Credit credit : credits) {

			totalPayment += credit.getPerMonth();

		}
		if ((totalPayment) > this.getMoney()) {
			throw new ClientException("No money to pay credits");
		} else {
			this.setMoney(this.getMoney() - totalPayment);
			for (Credit credit : credits) {

				credit.payForMonth();

			}
		}

	}

	public IBank getBank() {
		return bank;
	}

	public void setBank(IBank bank) {
		if (bank != null) {
			this.bank = bank;

		}
	}

	public double getMoney() {
		return money;
	}

	private void setMoney(double money) {
		this.money = money;
	}

	public double getIncome() {
		return income;
	}

	private void setIncome(double income) {
		if (income > 0) {
			this.income = income;
		}

	}

	@Override
	public String toString() {
		return "Client [Name=" + this.getName() + ", address="
				+ this.getAddress() + ", money=" + money + ", income=" + income
				+ ", deposits=" + deposits + ", credits=" + credits + "]";
	}

}
