public class SomethingElse {
	private String string1;
	private String string2;
	private double double1;
	private double double2;
	private int int1;
	private int int2;
	private Person owner;

	public boolean noOwner() {
		if (this.owner == null) {
			return true;
		}
		return false;
	}

}
