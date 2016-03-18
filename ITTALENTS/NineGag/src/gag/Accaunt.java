package gag;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Accaunt {

	private String userName;
	private String eMail;
	private String passWord;
	private String yourName;
	private boolean isFemale;
	private int year;
	private int month;
	private int day;
	private String countryOfTheAccount;
	private StringBuilder tellPeopleWhoYouAre;
	private final static String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	private static ArrayList<Country> countries = new ArrayList<Country>(205);

	{
		Accaunt.countries.add(new Country("Afghanistan"));
		Accaunt.countries.add(new Country("Albania"));
		Accaunt.countries.add(new Country("Algeria"));
		Accaunt.countries.add(new Country("Andorra"));
		Accaunt.countries.add(new Country("Angola"));
		Accaunt.countries.add(new Country("Antigua and Barbuda"));
		Accaunt.countries.add(new Country("Argentina"));
		Accaunt.countries.add(new Country("Armenia"));
		Accaunt.countries.add(new Country("Aruba"));
		Accaunt.countries.add(new Country("Australia"));
		Accaunt.countries.add(new Country("Austria"));
		Accaunt.countries.add(new Country("Azerbaijan"));
		Accaunt.countries.add(new Country("Bahamas, The"));
		Accaunt.countries.add(new Country("Bahrain"));
		Accaunt.countries.add(new Country("Bangladesh"));
		Accaunt.countries.add(new Country("Barbados"));
		Accaunt.countries.add(new Country("Belarus"));
		Accaunt.countries.add(new Country("Belgium"));
		Accaunt.countries.add(new Country("Belize"));
		Accaunt.countries.add(new Country("Benin"));
		Accaunt.countries.add(new Country("Bhutan"));
		Accaunt.countries.add(new Country("Bolivia"));
		Accaunt.countries.add(new Country("Bosnia and Herzegovina"));
		Accaunt.countries.add(new Country("Botswana"));
		Accaunt.countries.add(new Country("Brazil"));
		Accaunt.countries.add(new Country("Brunei "));
		Accaunt.countries.add(new Country("Bulgaria"));
		Accaunt.countries.add(new Country("Burkina Faso"));
		Accaunt.countries.add(new Country("Burma"));
		Accaunt.countries.add(new Country("Burundi"));
		Accaunt.countries.add(new Country("Cambodia"));
		Accaunt.countries.add(new Country("Cameroon"));
		Accaunt.countries.add(new Country("Canada"));
		Accaunt.countries.add(new Country("Cape Verde"));
		Accaunt.countries.add(new Country("Central African Republic"));
		Accaunt.countries.add(new Country("Chad"));
		Accaunt.countries.add(new Country("Chile"));
		Accaunt.countries.add(new Country("China"));
		Accaunt.countries.add(new Country("Colombia"));
		Accaunt.countries.add(new Country("Comoros"));
		Accaunt.countries.add(new Country("Congo, Democratic Republic of the"));
		Accaunt.countries.add(new Country("Congo, Republic of the"));
		Accaunt.countries.add(new Country("Costa Rica"));
		Accaunt.countries.add(new Country("Cote d'Ivoire"));
		Accaunt.countries.add(new Country("Croatia"));
		Accaunt.countries.add(new Country("Cuba"));
		Accaunt.countries.add(new Country("Curacao"));
		Accaunt.countries.add(new Country("Cyprus"));
		Accaunt.countries.add(new Country("Czech Republic"));
		Accaunt.countries.add(new Country("Denmark"));
		Accaunt.countries.add(new Country("Djibouti"));
		Accaunt.countries.add(new Country("Dominica"));
		Accaunt.countries.add(new Country("Dominican Republic"));
		Accaunt.countries.add(new Country("East Timor (see Timor-Leste)"));
		Accaunt.countries.add(new Country("Ecuador"));
		Accaunt.countries.add(new Country("Egypt"));
		Accaunt.countries.add(new Country("El Salvador"));
		Accaunt.countries.add(new Country("Equatorial Guinea"));
		Accaunt.countries.add(new Country("Eritrea"));
		Accaunt.countries.add(new Country("Estonia"));
		Accaunt.countries.add(new Country("Ethiopia"));
		Accaunt.countries.add(new Country("Fiji"));
		Accaunt.countries.add(new Country("Finland"));
		Accaunt.countries.add(new Country("France"));
		Accaunt.countries.add(new Country("Gabon"));
		Accaunt.countries.add(new Country("Gambia, The"));
		Accaunt.countries.add(new Country("Georgia"));
		Accaunt.countries.add(new Country("Germany"));
		Accaunt.countries.add(new Country("Ghana"));
		Accaunt.countries.add(new Country("Greece"));
		Accaunt.countries.add(new Country("Grenada"));
		Accaunt.countries.add(new Country("Guatemala"));
		Accaunt.countries.add(new Country("Guinea"));
		Accaunt.countries.add(new Country("Guinea-Bissau"));
		Accaunt.countries.add(new Country("Guyana"));
		Accaunt.countries.add(new Country("Haiti"));
		Accaunt.countries.add(new Country("Holy See"));
		Accaunt.countries.add(new Country("Honduras"));
		Accaunt.countries.add(new Country("Hong Kong"));
		Accaunt.countries.add(new Country("Hungary"));
		Accaunt.countries.add(new Country("Iceland"));
		Accaunt.countries.add(new Country("India"));
		Accaunt.countries.add(new Country("Indonesia"));
		Accaunt.countries.add(new Country("Iran"));
		Accaunt.countries.add(new Country("Iraq"));
		Accaunt.countries.add(new Country("Ireland"));
		Accaunt.countries.add(new Country("Israel"));
		Accaunt.countries.add(new Country("Italy"));
		Accaunt.countries.add(new Country("Jamaica"));
		Accaunt.countries.add(new Country("Japan"));
		Accaunt.countries.add(new Country("Jordan"));
		Accaunt.countries.add(new Country("Kazakhstan"));
		Accaunt.countries.add(new Country("Kenya"));
		Accaunt.countries.add(new Country("Kiribati"));
		Accaunt.countries.add(new Country("Korea, North"));
		Accaunt.countries.add(new Country("Korea, South"));
		Accaunt.countries.add(new Country("Kosovo"));
		Accaunt.countries.add(new Country("Kuwait"));
		Accaunt.countries.add(new Country("Kyrgyzstan"));
		Accaunt.countries.add(new Country("Laos"));
		Accaunt.countries.add(new Country("Latvia"));
		Accaunt.countries.add(new Country("Lebanon"));
		Accaunt.countries.add(new Country("Lesotho"));
		Accaunt.countries.add(new Country("Liberia"));
		Accaunt.countries.add(new Country("Libya"));
		Accaunt.countries.add(new Country("Liechtenstein"));
		Accaunt.countries.add(new Country("Lithuania"));
		Accaunt.countries.add(new Country("Luxembourg"));
		Accaunt.countries.add(new Country("Macau"));
		Accaunt.countries.add(new Country("Macedonia"));
		Accaunt.countries.add(new Country("Madagascar"));
		Accaunt.countries.add(new Country("Malawi"));
		Accaunt.countries.add(new Country("Malaysia"));
		Accaunt.countries.add(new Country("Maldives"));
		Accaunt.countries.add(new Country("Mali"));
		Accaunt.countries.add(new Country("Malta"));
		Accaunt.countries.add(new Country("Marshall Islands"));
		Accaunt.countries.add(new Country("Mauritania"));
		Accaunt.countries.add(new Country("Mauritius"));
		Accaunt.countries.add(new Country("Mexico"));
		Accaunt.countries.add(new Country("Micronesia"));
		Accaunt.countries.add(new Country("Moldova"));
		Accaunt.countries.add(new Country("Monaco"));
		Accaunt.countries.add(new Country("Mongolia"));
		Accaunt.countries.add(new Country("Montenegro"));
		Accaunt.countries.add(new Country("Morocco"));
		Accaunt.countries.add(new Country("Mozambique"));
		Accaunt.countries.add(new Country("Namibia"));
		Accaunt.countries.add(new Country("Nauru"));
		Accaunt.countries.add(new Country("Nepal"));
		Accaunt.countries.add(new Country("Netherlands"));
		Accaunt.countries.add(new Country("Netherlands Antilles"));
		Accaunt.countries.add(new Country("New Zealand"));
		Accaunt.countries.add(new Country("Nicaragua"));
		Accaunt.countries.add(new Country("Niger"));
		Accaunt.countries.add(new Country("Nigeria"));
		Accaunt.countries.add(new Country("North Korea"));
		Accaunt.countries.add(new Country("Norway"));
		Accaunt.countries.add(new Country("Oman"));
		Accaunt.countries.add(new Country("Pakistan"));
		Accaunt.countries.add(new Country("Palau"));
		Accaunt.countries.add(new Country("Palestinian Territories"));
		Accaunt.countries.add(new Country("Panama"));
		Accaunt.countries.add(new Country("Papua New Guinea"));
		Accaunt.countries.add(new Country("Paraguay"));
		Accaunt.countries.add(new Country("Peru"));
		Accaunt.countries.add(new Country("Philippines"));
		Accaunt.countries.add(new Country("Poland"));
		Accaunt.countries.add(new Country("Portugal"));
		Accaunt.countries.add(new Country("Qatar"));
		Accaunt.countries.add(new Country("Romania"));
		Accaunt.countries.add(new Country("Russia"));
		Accaunt.countries.add(new Country("Rwanda"));
		Accaunt.countries.add(new Country("Saint Kitts and Nevis"));
		Accaunt.countries.add(new Country("Saint Lucia"));
		Accaunt.countries.add(new Country("Saint Vincent and the Grenadines"));
		Accaunt.countries.add(new Country("Samoa "));
		Accaunt.countries.add(new Country("San Marino"));
		Accaunt.countries.add(new Country("Sao Tome and Principe"));
		Accaunt.countries.add(new Country("Saudi Arabia"));
		Accaunt.countries.add(new Country("Senegal"));
		Accaunt.countries.add(new Country("Serbia"));
		Accaunt.countries.add(new Country("Seychelles"));
		Accaunt.countries.add(new Country("Sierra Leone"));
		Accaunt.countries.add(new Country("Singapore"));
		Accaunt.countries.add(new Country("Sint Maarten"));
		Accaunt.countries.add(new Country("Slovakia"));
		Accaunt.countries.add(new Country("Slovenia"));
		Accaunt.countries.add(new Country("Solomon Islands"));
		Accaunt.countries.add(new Country("Somalia"));
		Accaunt.countries.add(new Country("South Africa"));
		Accaunt.countries.add(new Country("South Korea"));
		Accaunt.countries.add(new Country("South Sudan"));
		Accaunt.countries.add(new Country("Spain "));
		Accaunt.countries.add(new Country("Sri Lanka"));
		Accaunt.countries.add(new Country("Sudan"));
		Accaunt.countries.add(new Country("Suriname"));
		Accaunt.countries.add(new Country("Swaziland "));
		Accaunt.countries.add(new Country("Sweden"));
		Accaunt.countries.add(new Country("Switzerland"));
		Accaunt.countries.add(new Country("Syria"));
		Accaunt.countries.add(new Country("Taiwan"));
		Accaunt.countries.add(new Country("Tajikistan"));
		Accaunt.countries.add(new Country("Tanzania"));
		Accaunt.countries.add(new Country("Thailand "));
		Accaunt.countries.add(new Country("Timor-Leste"));
		Accaunt.countries.add(new Country("Togo"));
		Accaunt.countries.add(new Country("Tonga"));
		Accaunt.countries.add(new Country("Trinidad and Tobago"));
		Accaunt.countries.add(new Country("Tunisia"));
		Accaunt.countries.add(new Country("Turkey"));
		Accaunt.countries.add(new Country("Turkmenistan"));
		Accaunt.countries.add(new Country("Tuvalu"));
		Accaunt.countries.add(new Country("Uganda"));
		Accaunt.countries.add(new Country("Ukraine"));
		Accaunt.countries.add(new Country("United Arab Emirates"));
		Accaunt.countries.add(new Country("United Kingdom"));
		Accaunt.countries.add(new Country("Uruguay"));
		Accaunt.countries.add(new Country("Uzbekistan"));
		Accaunt.countries.add(new Country("Vanuatu"));
		Accaunt.countries.add(new Country("Venezuela"));
		Accaunt.countries.add(new Country("Vietnam"));
		Accaunt.countries.add(new Country("Yemen"));
		Accaunt.countries.add(new Country("Zambia"));
		Accaunt.countries.add(new Country("Zimbabwe"));

	}

	private Accaunt(String userName, String eMail, String passWord) {
		this.setUserName(userName);
		this.setMail(eMail);
		this.setPassWord(passWord);
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		if (yourName!=null&&yourName.length()>0) {
			this.yourName = yourName;
		}
		
	}

	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	public StringBuilder getTellPeopleWhoYouAre() {
		return tellPeopleWhoYouAre;
	}

	public void setTellPeopleWhoYouAre(String tellPeopleWhoYouAre) {
		this.tellPeopleWhoYouAre.append(tellPeopleWhoYouAre);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;

	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		if (Accaunt.isPaswordStrong(passWord)) {
			this.passWord = passWord;
			return;
		}
		System.out.println("Waek pass");
	}

	public String getEMail() {
		return eMail;
	}

	public void setMail(String eMail) {
		this.eMail = eMail;

	}

	public static boolean isEMailValid(String address) {

		Boolean b = address.matches(EMAIL_REGEX);
		if (b) {
			return true;
		}

		System.out.println("Invalid mail");
		return false;
	}

	public static boolean isPaswordStrong(String pass) {
		if (pass.length() < 6) {
			System.out.println("Too short");
			return false;
		}
		boolean upper = false;
		boolean lower = false;
		boolean number = false;

		for (int i = 0; i < pass.length(); i++) {
			if (upper == false && pass.charAt(i) >= 'A'
					&& pass.charAt(i) <= 'Z') {
				upper = true;
			}
			if (lower == false && pass.charAt(i) >= 'a'
					&& pass.charAt(i) <= 'z') {
				lower = true;
			}
			if (number == false && pass.charAt(i) >= '0'
					&& pass.charAt(i) <= '9') {
				number = true;
			}

			if (number && upper && lower) {
				return true;
			}
		}
		System.out.println("Weak password");
		return false;
	}

	public static boolean isUserNameValid(String userName) {
		if (userName != null && userName.length() >= 0) {
			return true;
		}
		return false;

	}

	static Accaunt createAccount(String userName, String eMail, String passWord) {
		if (isPaswordStrong(passWord) && isEMailValid(eMail)
				&& isUserNameValid(userName)) {
			Accaunt temp = new Accaunt(userName, eMail, passWord);
			return temp;

		}
		System.out.println("Nothing is created");
		return null;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", eMail=" + eMail
				+ ", passWord=" + passWord + ", yourName=" + yourName
				+ ", isFemale=" + isFemale + ", year=" + year + ", month="
				+ month + ", day=" + day + ", countryOfTheAccount="
				+ countryOfTheAccount + ", tellPeopleWhoYouAre="
				+ tellPeopleWhoYouAre + "]";
	}

}
