package banka;

public final class CreditConsumer extends Credit{

	public CreditConsumer(double period, double ammount,Client client) {
		super(period, ammount, 10,"Consumer Credit ",client);
	}

}
