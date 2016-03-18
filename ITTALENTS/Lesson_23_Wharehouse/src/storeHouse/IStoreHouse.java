package storeHouse;

public interface IStoreHouse {
	
	public void printStorage();
	public void removeProduct(String name, int count);
	public void addProduct(String name, int count);
	public boolean isSuplierNeeded();

}