import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		System.out
				.println("Please enter two strings delimited by space. From 10 to 20 chars.");
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

		if ((first.length() < 10) || (first.length() > 20)
				|| (second.length() < 10) || (second.length() > 20)) {
			System.out.println("one of the words is not 10-20 symbols long");
			sc.close();
			return;

		}

		if (first.length() > second.length()) {
			printMixed(first, second);
		}

		if (first.length() < second.length()) {
			printMixed(second, first);

		}

		if (first.length() == second.length()) {
			System.out.println("The two words have equal length!");
			printMixed(second, first);

		}

		sc.close();

	}

	static void printMixed(String first, String second) {
		System.out.print(first.length() + " ");
		for (int i = 0; i < first.length(); i++) {

			if (i < second.length()) {
				System.out.print(second.charAt(i));
			} else {
				System.out.print(first.charAt(i));
			}
		}
	}

}
