import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		System.out.println("Please enter a word.");
		Scanner sc = new Scanner(System.in, "ASCII");
		String str = sc.nextLine();
		str = str.trim();
		
		if (str.length()==0) {
			System.out.println("Invalid input");
			
		}

		char[] newStr = new char[str.length()];

		for (int i = 0; i < newStr.length; i++) {
			newStr[i] = (char) (str.charAt(i) + 5);
			System.out.print(newStr[i]);
		}
		sc.close();
	}

}
