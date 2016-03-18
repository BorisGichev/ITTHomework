package task_1;

public class ElectronicSecuredNotepad extends SecuredNotePad implements
		IElectronicDevice {
	private boolean isOn;
	protected static String INIT_MESSAGE = "Please enter a password for the Electronic Secured NotePad";

	private ElectronicSecuredNotepad(int pages, String password) {
		super(true, pages);
		this.passWord = password;
		this.isOn = false;
	}
	
	public static ElectronicSecuredNotepad createElectronicSecuredNotePad(int pages) {

		System.err.println(INIT_MESSAGE);
		String pass = SecuredNotePad.sc.next();

		if (pass != null && pass.length() > 0&&SecuredNotePad.isPaswordStrong(pass)) {
			ElectronicSecuredNotepad eSNP = new ElectronicSecuredNotepad(pages, pass) {

			};
			return eSNP;
			
		}
		System.exit(0);
		return null;

	}

	@Override
	public void start() {
		this.isOn = true;

	}

	@Override
	public void stop() {
		this.isOn = false;

	}

	@Override
	public boolean isStarted() {
		if (this.isOn) {
			return true;
		}
		return false;
	}
	@Override
	public void addTextToPage(int pageNum, String text) {
		if (isOn) {
			super.addTextToPage(pageNum, text);
		}
	}
	@Override
	public void replaceTextInPage(int pageNum, String text) {
		if (isOn) {
			super.replaceTextInPage(pageNum, text);
		}

	}

	@Override
	public void deleteTextInPage(int pageNum) {
		if (isOn) {
			super.deleteTextInPage(pageNum);
		}

	}

	@Override
	public void printAllPages() {
		if (isOn) {
			super.printAllPages();
		}

	}

	@Override
	public int searchWord(String word) {
		if (isOn) {
			return super.searchWord(word);
		}
		return -1;

	}

	@Override
	public void printAllPagesWithdigits() {
		if (isOn) {
			super.printAllPagesWithdigits();
			;
		}

	}
}
