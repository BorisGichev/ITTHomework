package banka;

public class Demo {

	public static void main(String[] args) {
		Bank selska = Bank.createBanka();
		Smetka.setBank(selska);
		Smetka smetka1 = Smetka.createSmetka("deb", 100);
		Smetka smetka2 = Smetka.createSmetka("deb", 200);
		Smetka smetka3 = Smetka.createSmetka("spes", 300);
		Smetka smetka4 = Smetka.createSmetka("spes", 400);

		User penko = new User("Penko");
		User menko = new User("Menko");
		User korkoo = new User("korko");
		User conko = new User("conko");

		smetka1.setUser(penko);
		smetka2.setUser(menko);
		smetka3.setUser(korkoo);
		smetka4.setUser(conko);
		
		selska.addSmetkaAndItsUser(smetka1);
		selska.addSmetkaAndItsUser(smetka2);
		selska.addSmetkaAndItsUser(smetka3);
		selska.addSmetkaAndItsUser(smetka4);

		selska.toString();
		
		selska.ulihvi();
	}

}
