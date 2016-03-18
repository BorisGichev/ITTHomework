import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		System.out.println("Please enter two words.");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word");
		String first = sc.nextLine();
		first = first.trim();
		first = first.toLowerCase();

		System.out.println("Please enter the second word");
		String second = sc.nextLine();
		second = second.trim();
		first = first.toLowerCase();

		boolean noMatch = true;
		boolean noMatchAtAll = true;
		int indexMax = 0;

		for (int i = 0; i < first.length(); i++) {
			for (int j = 0; j < second.length(); j++) {
				if (first.charAt(i) == second.charAt(j) && (j > indexMax)) {
					indexMax = j;
					noMatchAtAll = false;

				}
			}
		}
		
		System.out.println(indexMax);
		
		if (noMatchAtAll == true) {
			System.out.println("Sorry there is now match!");
			sc.close();
			return;
		}

		for (int i = 0; i < first.length(); i++) {

			for (int j = 0; j < second.length(); j++) {
				if (first.charAt(i) == second.charAt(j)) {
					for (int k = 0; k < indexMax - j; k++) {
						System.out.print(" ");
					}
					System.out.println(second);
					noMatch = false;
					noMatchAtAll = false;
					break;
				}
			}
			if (noMatch) {
				for (int j = 0; j < indexMax; j++) {
					System.out.print(" ");
				}
				System.out.println(first.charAt(i));
			}
			noMatch = true;

		}

		if (noMatchAtAll == true) {
			System.out.println("Sorry there is now match");
		}
		sc.close();
	}

}
