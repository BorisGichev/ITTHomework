package banka;

public abstract class NameAndAddress {

	private String name;
	private String address;
	
	

	public NameAndAddress(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().length() == 0) {
			return;
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.trim().length() == 0) {
			return;
		}
		this.address = address;
	}

}
