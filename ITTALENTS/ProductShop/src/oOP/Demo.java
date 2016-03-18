package oOP;

public class Demo {

	public static void main(String[] args) {
		Shop bakaliq=new Shop("Bakaliq", "hubavka8", 1200.30,6);
		
		CountProduct beer=new CountProduct("Beer", 2, 20);
		CountProduct book=new CountProduct("Book", 15, 10);
		CountProduct chair=new CountProduct("Chair", 35, 16);
		
		KiloProduct meat = new KiloProduct("Meat", 5.60, 12);
		KiloProduct chease = new KiloProduct("Chease", 12.6, 6);
		KiloProduct fish = new KiloProduct("Fish", 11.30, 11);
		
		bakaliq.addProductInInventory(beer);
		bakaliq.addProductInInventory(book);
		bakaliq.addProductInInventory(chair);
		bakaliq.addProductInInventory(meat);
		bakaliq.addProductInInventory(chease);
		bakaliq.addProductInInventory(fish);
		
		bakaliq.showInventory();
		
		Buyer pesho=new Buyer(bakaliq, 99, 2);
		
		pesho.addKiloProductInInventory("Meat", 2.3);
		
		pesho.showInventory();
		System.out.println(pesho.getMoneyToGive());
		
		

	}

}
