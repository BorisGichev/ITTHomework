package leters;

public class InvalidStringExceptio extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidStringExceptio() {
		// TODO Auto-generated constructor stub
	}

	public InvalidStringExceptio(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidStringExceptio(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidStringExceptio(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InvalidStringExceptio(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return super.getMessage();
}
 
}
