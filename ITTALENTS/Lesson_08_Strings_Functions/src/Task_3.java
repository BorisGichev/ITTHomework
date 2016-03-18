import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {

		System.out.println("Please enter two strings delimited by space.");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.trim();

		int countWords = 1;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				countWords++;
			}
			if ((countWords > 2)) {
				System.out.println("More than two strings.");
				sc.close();
				return;

			}
		}

		if ((countWords == 1)) {
			System.out.println("Only one word");
			sc.close();
			return;

		}

		str = str.replaceAll("[ ]+", " ");
		String[] words = str.split(" ");

		String first = words[0];
		String second = words[1];

		if (first.length() == second.length()) {
			boolean same = true;
			System.out.println("The two words are with the same length");
			for (int i = 0; i < first.length(); i++) {

				if (first.charAt(i) != second.charAt(i)) {
					System.out.print((i + 1) + " " + first.charAt(i) + "-"
							+ second.charAt(i) + "\n");
					same = false;
				}
			}

			if (same == true) {
				System.out.println("The two words are the same!");
			}
		}

		if (first.length() != second.length()) {
			int smaller = first.length() < second.length() ? first.length()
					: second.length();

			System.out.println("The two words are NOT with the same length");

			for (int i = 0; i < smaller; i++) {

				if (first.charAt(i) != second.charAt(i)) {
					System.out.print((i + 1) + " " + first.charAt(i) + "-"
							+ second.charAt(i) + "\n");

				}

			}

		}
		sc.close();

	}

}
