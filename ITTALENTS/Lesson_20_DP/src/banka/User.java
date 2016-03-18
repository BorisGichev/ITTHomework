package banka;

public class User implements IObserver{
	private String name;
	private double money;

	public User(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return "User [name=" + name +" ,money=" + money +  "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void takeMoney(double money) {
		this.money+=money;
		
	}


}
