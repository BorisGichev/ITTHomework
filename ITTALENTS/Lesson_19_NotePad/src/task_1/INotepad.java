package task_1;

public interface INotepad extends IElectronicDevice{
	
	
	void addTextToPage(int pageNum,String text);
	void replaceTextInPage(int pageNum,String newText);
	void deleteTextInPage(int pageNum);
	void printAllPages();
	int searchWord(String word);
	void printAllPagesWithdigits();
	
	static final int DEFAULT_NUMBER_OF_PAGES = 10;



}
