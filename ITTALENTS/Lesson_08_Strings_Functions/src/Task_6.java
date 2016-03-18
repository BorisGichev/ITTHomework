import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		System.out.println("Please enter a sentence.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		boolean capital = false;
		
		
		for (int i = 0; i < str.length(); i++) {

			if (i == 0) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
				continue;

			}
			if (str.charAt(i) == ' ') {
				capital = true;

			}

			if (capital == true
					&& ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str
							.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
				capital = false;
				continue;

			} else {
				System.out.print(str.charAt(i));
			}
			sc.close();
		}

	}

}
