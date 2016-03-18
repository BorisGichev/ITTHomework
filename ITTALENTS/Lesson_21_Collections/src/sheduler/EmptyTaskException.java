package sheduler;

public class EmptyTaskException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyTaskException() {
		// TODO Auto-generated constructor stub
	}

	public EmptyTaskException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public EmptyTaskException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public EmptyTaskException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public EmptyTaskException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.getMessage();
	}

}
