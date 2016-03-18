package banka;

public class Bank {
	private static Bank selskaBanka;
	private Smetka[] smetki;
	private IObserver[] users;
	private String name;
	private int indexSmetka=1;
	private int indexUsers=1;
	
	public static Bank createBanka(){
		if (Bank.selskaBanka==null){
			selskaBanka= new Bank("Selskaaa");
			return selskaBanka;
		}
		return selskaBanka;
	}

	private Bank(String name) {
		this.users=new User[10];
		this.smetki=new Smetka[10];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSmetkaAndItsUser(Smetka smetka) {
		if (smetka!=null&&indexSmetka<smetki.length) {
			smetki[indexSmetka]=smetka;
			indexSmetka++;
			if (smetka.getHolder()!=null) {
				users[indexUsers]=smetka.getHolder();
				indexUsers++;
			}
		}
		
	}

	public void ulihvi(){
		for (Smetka smetka : smetki) {
			if (smetka!=null) {
				smetka.Ulihvi();
			}
			
		}
		
		for (Smetka smetka : smetki) {
			if (smetka!=null) {
				smetka.GiveMoney();
			}
			
		}
		this.toString();
	}
	@Override
	public String toString() {
		for (Smetka smetka : smetki) {
			if (smetka!=null) {
				System.out.println(smetka.toString());
			}
		}
		for (IObserver user : users) {
			if (user!=null) {
				System.out.println(user.toString());
			}
		}
		return null;
	}
}
