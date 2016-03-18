package war;

public class Card {
	private String number;
	private String Suit;
	private short secretPower;
	
	
	Card (){
		this.setNumber("temp");
		this.setSuit("temp");
		this.setSecretPower((short) -1);
	}
	Card (String suit,String number,short secretPower){
		this.setNumber(number);
		this.setSuit(suit);
		this.setSecretPower(secretPower);
	}
	
	public void showCard(){
		
		System.out.println(getNumber()+" of "+ this.getSuit()+" ");
	}


	public String getNumber() {
		return number;
	}


	private void setNumber(String number) {
		this.number = number;
	}


	public String getSuit() {
		return Suit;
	}


	private void setSuit(String suit) {
		Suit = suit;
	}


	public short getSecretPower() {
		return secretPower;
	}


	private void setSecretPower(short secretPower) {
		this.secretPower = secretPower;
	}
	

}
