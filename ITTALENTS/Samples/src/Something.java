public class Something implements ISomething {

	private String name;
	private String address;
	private int freePlacesInArray;
	private int currentUnassignedSomethingElse;
	private int indexForAdding;
	private SomethingElse[] array;

	public Something(String name, String address, int freePlacesInArray) {

		this.setName(name);
		this.setAddress(address);
		this.freePlacesInArray = freePlacesInArray;
		this.array = new SomethingElse[freePlacesInArray];
		this.setCurrentUnasignedSomethingElse();
		this.indexForAdding = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() == 0) {
			return;
		}
		this.address = address;
	}

	public int getFreePlacesInArray() {
		return freePlacesInArray;
	}

	public void incrementFreePlacesInArray() {
		this.freePlacesInArray++;
	}

	public void decrementFreePlacesInArray() {
		this.freePlacesInArray--;
	}

	public int getCurrentUnassignedTaskIndex() {
		return currentUnassignedSomethingElse;
	}

	public int getIndexForAdding() {
		return indexForAdding;
	}

	public SomethingElse getThingfromArray(int index) {
		if (index < 0 || index > this.array.length - 1) {
			System.out.println("Out of bounds");
			return null;
		}
		if (this.array[index] == null) {
			System.out.println("empty place");
			return null;
		}
		return array[index];
	}

	public void setArray(SomethingElse[] array) {
		this.array = array;
	}

	private void addSomethingElse(SomethingElse somethingElse) {
		if (somethingElse == null) {
			return;
		}
		this.array[indexForAdding] = somethingElse;
		this.decrementFreePlacesInArray();
		indexForAdding = (indexForAdding + 1) % this.array.length;
		this.setCurrentUnasignedSomethingElse();

	}

	public void setCurrentUnasignedSomethingElse() {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] != null && this.array[i].noOwner()) {
				this.currentUnassignedSomethingElse = i;
				return;
			}
		}
		this.currentUnassignedSomethingElse = -1;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

}
