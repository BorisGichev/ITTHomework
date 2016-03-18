package task_1;

public class Page {
	private String title;
	private StringBuilder text;

	public Page() {
		this.title = new String("Unnamed page");
		this.text = new StringBuilder("");
	}

	public void addText(String text) {
		if (text != null && text.length() > 0) {
			this.text.append(text);
		}
	}

	public void deleteText() {
		this.text.delete(0, text.length());
	}

	public void printPage() {
		System.out.println(this.title + "\n" + this.text);
	}

	public boolean searchWord(String word) {
		String stringed = this.text.toString().toLowerCase();
		if (word != null && word.length() > 0) {
			if (stringed.indexOf(word.toLowerCase()) != -1) {
				return true;
			}
		}
		return false;
	}

	public boolean checkForNumbers() {
		String stinged = text.toString();
		for (int i = 0; i < stinged.length(); i++) {
			if (stinged.charAt(i) >= '0' || stinged.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
}
