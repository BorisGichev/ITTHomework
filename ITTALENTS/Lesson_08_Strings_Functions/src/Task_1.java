import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		System.out
				.println("Please enter two strings delimited by space. Max length of one string is 40 symbols");
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
			System.out.println("Only one word.");
			sc.close();
			return;

		}

		str = str.replaceAll("[ ]+", " ");
		String[] words = str.split(" ");

		if (words[0].length() > 40 || words[1].length() > 40) {
			System.out.println("More than 40 symbols in one of the strings.");
			sc.close();
			return;

		}

		System.out.println(words[0].toUpperCase() + " "
				+ words[0].toLowerCase() + " " + words[1].toUpperCase() + " "
				+ words[1].toLowerCase());

		sc.close();

	}

}
