
public class ki {
	String categorie;
	String title;
	Integer broj;
	
	
	
	@Override
	public String toString() {
		return "ki [categorie=" + categorie + ", title=" + title + ", broj="
				+ broj + "]";
	}



	public ki(String categorie, String title, Integer broj) {
		this.categorie = categorie;
		this.title = title;
		this.broj = broj;
	}
	
	

}
