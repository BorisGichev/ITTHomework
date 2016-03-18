package model;


public class Account {
	
	
	private int id;
	private boolean showNSFW;
	private boolean hideUprated;
	private boolean isFemale;
	private int year;
	private int month;
	private int day;
	private int country_id;
	private String birthday;
	private String country;
	private StringBuilder tellPeopleWhoYouAre;

	
	
	public Account (boolean isFemale,boolean showNSFW, boolean hideUprated,String birthday){
		this.isFemale=isFemale;
		this.showNSFW=showNSFW;
		this.hideUprated=hideUprated;
		this.birthday=birthday;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setCountry(int country) {
		this.country_id = country;
	}

	public String getBirthday(){
		return birthday;
	}


	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	public String getTellPeopleWhoYouAre() {
		return tellPeopleWhoYouAre.toString();
	}

	public void setTellPeopleWhoYouAre(String tellPeopleWhoYouAre) {
		this.tellPeopleWhoYouAre.append(tellPeopleWhoYouAre);
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public boolean isShowNSFW() {
		return showNSFW;
	}

	public void setShowNSFW(boolean showNSFW) {
		this.showNSFW = showNSFW;
	}

	public boolean isHideUprated() {
		return hideUprated;
	}

	public void setHideUprated(boolean hideUprated) {
		this.hideUprated = hideUprated;
	}

	@Override
	public String toString() {
		return "Account:"+ ", isFemale=" + isFemale + ", year=" + year + ", month="
				+ month + ", day=" + day + ", countryOfTheAccount=" + country_id
				+ ", tellPeopleWhoYouAre=" + tellPeopleWhoYouAre + "]";
	}

	public Integer getCountryID() {
		return country_id;
	}

	public void setCountryID(Integer country) {
		this.country_id = country;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

}
