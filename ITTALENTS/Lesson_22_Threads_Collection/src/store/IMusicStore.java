package store;


public interface IMusicStore {


	public abstract double getMoney();

	public abstract void sellInstrument(String name, int count);

	public abstract void buyInstrument(String name, int count);

	public abstract void printAllByType();

	public abstract void printAllByName();

	public abstract void printAllByPriceAsc();

	public abstract void printAllByPriceDesc();

	public abstract void printAllByPrice(String order);

	public abstract void printInventory();

	public abstract void prinatAllSales();

	public abstract void printGeneratedIncome();

	public abstract void showMostSoldInstrument();

	public abstract void showLeastSoldInstrument();

	public abstract void mostWantedType();

	public abstract void mostLucrativeType();

	public abstract void printSingleInstrument(String name);
	
	public void setSup(Sup sup);
	


}