package banka;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws BankException {
		IBank bulgarianBnak = new Bank("BG Bank", "drujba 3",2500);
		List<IClient> clients = new ArrayList<IClient>();

		IClient marko = new Client("Marko", "mladost1", 920);
		IClient gosho = new Client("Gosho", "mladost2", 1000);
		IClient zoro = new Client("Zoro", "mladost3", 820);
		IClient mara = new Client("Mara", "mladost4", 2000);
		IClient zara = new Client("Zara", "mladost5", 320);
		IClient penka = new Client("Penka", "mladost6", 2920);
		IClient kirka = new Client("Kirka", "mladost7", 1920);
		IClient uzin = new Client("Uzun", "mladost8", 1923);
		IClient irka = new Client("Irka", "mladost9", 1980);
		IClient kina = new Client("Kina", "mladost10", 1320);

		clients.add(marko);
		clients.add(gosho);
		clients.add(zoro);
		clients.add(mara);
		clients.add(zara);
		clients.add(penka);
		clients.add(kirka);
		clients.add(uzin);
		clients.add(irka);
		clients.add(kina);

		// Set bank
		for (IClient client : clients) {
			client.setBank(bulgarianBnak);
			System.out.println(client);
		}
		System.out.println();
		
		//Deposit money
		for (IClient client : clients) {
			double rand = Math.random();
			if (rand > 0.5) {
				try {
					client.openRandomDeposit("Long");
				} catch (ClientException e) {
					System.out.println(e);
				}
			}
			if (rand <= 0.5) {
				try {
					client.openRandomDeposit("Short");
				} catch (ClientException e) {
					System.out.println(e);
				}
			}
		}

		//take credit
		for (IClient client : clients) {
			double rand = Math.random();
			if (rand > 0.5) {
				try {
					client.wantCredit("home");
				} catch (BankException e) {
					System.out.println(e);
				}
				;
			}
			if (rand <= 0.5) {
				try {
					client.wantCredit("consume");
				} catch (BankException e) {
					System.out.println(e);
				}
				;
			}
		}
		
		//Take sallary and pay credits
		for (IClient client : clients) {
			client.getPaid();
			try {
				client.payCredits();
			} catch (ClientException e) {
				System.out.println(e);
			}
		}

		bulgarianBnak.payInterest();
		bulgarianBnak.printAll();

		for (int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i).toString());
		}

	}
}
