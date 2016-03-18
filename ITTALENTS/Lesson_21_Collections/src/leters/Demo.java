package leters;

public class Demo {
	public static void main(String[] args){
		/**Niki znam che vyv klas ni pokaza kak nai dobre da 
		stane, ama tova sam sym si go mislel za towa go ostawih s kointeiner */
		
		
		ICountLetters counter=new CountLetters();
		try {
			counter.count("Couse I`m the real slim shady Please stand up please stand up");
		} catch (InvalidStringExceptio e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
