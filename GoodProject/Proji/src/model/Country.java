package model;

public class Country {
	private String name;

	public Country(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name!=null&&name.length()>0) {
			this.name = name;
		}
	}
	
	

}
