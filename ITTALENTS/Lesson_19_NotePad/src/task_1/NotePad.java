package task_1;

public abstract class NotePad implements INotepad {
	private Page[] pages;

	public NotePad(int pages) {
		if (pages < 0) {
			pages = DEFAULT_NUMBER_OF_PAGES;
		}
		this.pages = new Page[pages];
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page();
		}
	}

	@Override
	public void addTextToPage(int pageNum, String text) {
		if (isInputOK(pageNum, text)) {
			this.pages[pageNum - 1].addText(text);
		}

	}

	@Override
	public void replaceTextInPage(int pageNum, String text) {
		if (isInputOK(pageNum, text)) {
			this.pages[pageNum - 1].deleteText();
			addTextToPage(pageNum, text);
		}

	}

	@Override
	public void deleteTextInPage(int pageNum) {
		if (isInputPageOK(pageNum)) {
			this.pages[pageNum - 1].deleteText();
		}

	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			this.pages[i].printPage();
		}

	}

	public int searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				return i+1;

			}
		}
		return -1;
	}
	
	public void printAllPagesWithdigits(){
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].checkForNumbers()) {
				this.pages[i].printPage();
			}
		}
	}

	private boolean isInputPageOK(int pageNum) {
		if (pageNum > this.pages.length || pageNum < 1) {
			return false;
		}
		return true;
	}

	private boolean isInputOK(int pageNum, String text) {
		if (pageNum > this.pages.length || pageNum < 1 || text == null
				|| text.length() == 0) {
			return false;
		}
		return true;
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return false;
	}

}
