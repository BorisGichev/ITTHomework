package store;

public class DemoMS {

	public static void main(String[] args) {
		MusicStore temp=new MusicStore("Rock", 5000);
		IMusicStore rock = temp;
		Thread rockT=new Thread(temp);
		
		Sup sup = new Sup();
		Thread supT=new Thread(sup);
		
		
		rock.setSup(sup);
		sup.SetMusicStore(temp);
		
		supT.start();
		rockT.start();
		
		
//		rock.printAllByType();
//		System.out.println(rock.getMoney());
//		rock.printAllByName();
//		rock.printAllByPriceAsc();
//		rock.printAllByPriceDesc();
//		rock.printInventory();
//		System.out.println(rock.getMoney());

		
//	rock.sellInstrument("guitar", 7);
	
	
//		rock.sellInstrument("arpha", 5);
//		rock.sellInstrument("drum", 1);
//		rock.sellInstrument("guitar", 5);
//		rock.sellInstrument("electrik violin", 1);
//		rock.sellInstrument("sintezator", 1);
//		rock.sellInstrument("bass guitar",4);
//		rock.sellInstrument("akordeon", 1);
//		rock.printInventory();
		
//		rock.prinatAllSales();		
//		rock.printGeneratedIncome();		
//		rock.showMostSoldInstrument();
//		rock.showLeastSoldInstrument();
//		rock.mostWantedType();
//		rock.mostLucrativeType();
		
//		supplierThread.start();
//		rockThread.start();
		

	}

}
