package banka;

import java.util.HashSet;
import java.util.Set;

public class Bank extends NameAndAddress implements IBank {
	private static final double BALANCE_RATIO = 0.9;
	private static final double RESERVE_RATIO = 0.1;
	private Set<ProductOfBank> products;
	private double reserve;
	private double balance;

	public Bank(String name, String address,double money) {
		super(name, address);
		this.products = new HashSet<ProductOfBank>(10);
		this.reserve = RESERVE_RATIO*money;
		this.balance = BALANCE_RATIO*money;
	}

	@Override
	public Deposit takeDeposit(double ammount, String type, Client client) {
		if (ammount > 0) {
			if (type.equalsIgnoreCase("short")) {
				Deposit temp = new DepositShort(ammount, client);
				products.add(temp);
				this.reserve = this.reserve + (ammount * (RESERVE_RATIO));
				this.balance = this.balance + (ammount * BALANCE_RATIO);
				// Uslovieto leko si protiworeichi i e nelogichno za tova go
				// prawq taka kakto na men mi e logichno
				return temp;
			}
			if (type.equalsIgnoreCase("long")) {
				Deposit temp = new DepositLong(ammount, client);
				this.reserve += ammount * RESERVE_RATIO;
				this.balance += ammount * (BALANCE_RATIO);
				products.add(temp);
				return temp;
			}
		}
		return null;
	}

	@Override
	public void payInterest() {
		for (ProductOfBank p : products) {
			if (p instanceof Deposit) {
				Deposit temp = (Deposit) (p);
				temp.addInterest();
				// V uslovieto ne e upomenato ot kyde da wzimam dobawenata lihwa
				// w smetkite!!!
			}
		}

	}

	@Override
	public Credit giveCredit(double ammount, double period, String type,
			Client client) throws BankException {
		if (ammount <= this.balance) {
			if (type.equalsIgnoreCase("home")) {
				Credit temp = new CreditHome(period, ammount, client);
				if (checkIfUserWillBeAbleToPay(
						client,
						Credit.calculateMonthlyPayment(ammount,
								temp.getPercent(), period))) {
					this.products.add(temp);
					this.balance -= ammount;
					return temp;

				}

			}
			if (type.equalsIgnoreCase("consume")) {
				Credit temp = new CreditConsumer(period, ammount, client);
				if (checkIfUserWillBeAbleToPay(
						client,
						Credit.calculateMonthlyPayment(ammount,
								temp.getPercent(), period))) {
					this.products.add(temp);
					this.balance -= ammount;
					return temp;
				}
			}
		}
		else {
			throw new BankException("Not enough money in the bank");
		}
		return null;
	}

	public boolean checkIfUserWillBeAbleToPay(Client client,
			double newMonthlyPayment) throws BankException {

		double totalPayment = 0;
		for (ProductOfBank p : products) {
			if (p instanceof Credit && p.getClient() == client) {
				Credit temp = (Credit) (p);
				totalPayment += temp.getPerMonth();

			}
		}
		if ((totalPayment + newMonthlyPayment) > (client.getIncome() / 2)) {
			throw new BankException("You will not be able to pay");
		}

		return true;

	}

	public void printAll() {
		for (ProductOfBank p : products) {
			System.out.println(p);
		}
		System.out.println("Ballance=" + this.balance + ", Resereve="
				+ this.reserve + ", Name=" + this.getName() + ", Address="
				+ this.getAddress());
		System.out.println();
	}

	public double getReserve() {
		return reserve;
	}

}
