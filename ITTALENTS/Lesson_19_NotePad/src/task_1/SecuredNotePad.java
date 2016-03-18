package task_1;

import java.util.Scanner;

public class SecuredNotePad extends NotePad implements INotepad {
	protected static final String CHECK_PASS_MESSAGE = "Enter pass";
	protected static String INIT_MESSAGE = "Please enter a password for the Secured NotePad";
	public static final Scanner sc = new Scanner(System.in);
	protected String passWord;

	SecuredNotePad(boolean skip, int pages) {
		super(pages);

	}

	private SecuredNotePad(int pages, String password) {
		super(pages);
		this.passWord = password;
	}

	private boolean checkPass(String pass) {
		if (this.passWord.equals(pass)) {

			return true;

		}
		System.err.println("Wrong Pass! Bye Bye");

		return false;

	}

	public static SecuredNotePad createSecuredNotePad(int pages) {

		System.err.println(INIT_MESSAGE);
		String pass = SecuredNotePad.sc.next();

		if (pass != null && pass.length() > 0&&SecuredNotePad.isPaswordStrong(pass)) {
			SecuredNotePad sNP = new SecuredNotePad(pages, pass) {

			};
			return sNP;
		}
		System.exit(0);
		return null;

	}

	public void addTextToPage(int pageNum, String text) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			super.addTextToPage(pageNum, text);
		}
	}

	public void replaceTextInPage(int pageNum, String text) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			super.deleteTextInPage(pageNum);
			super.addTextToPage(pageNum, text);
		}

	}

	@Override
	public void deleteTextInPage(int pageNum) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			super.deleteTextInPage(pageNum);
		}

	}

	@Override
	public void printAllPages() {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			super.printAllPages();
		}

	}

	@Override
	public int searchWord(String word) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			int page = super.searchWord(word);
			return page;
		}
		return -1;

	}

	@Override
	public void printAllPagesWithdigits() {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotePad.sc.next();
		if (this.checkPass(pass)) {
			super.printAllPagesWithdigits();

		}

	}
	
	public static boolean isPaswordStrong(String pass){
		boolean upper=false;
		boolean lower=false;
		boolean number=false;
		
		for (int i = 0; i < pass.length(); i++) {
			if (upper==false&&pass.charAt(i)>='A'&&pass.charAt(i)<='Z') {
				upper=true;
			}
			if (lower==false&&pass.charAt(i)>='a'&&pass.charAt(i)<='z') {
				lower=true;
			}
			if (number==false&&pass.charAt(i)>='0'&&pass.charAt(i)<='9') {
				number=true;
			}
			
			if (number&&upper&&lower) {
				return true;
			}
		}
		System.out.println("You pass is week no object is created");
		return false;
	}

}
