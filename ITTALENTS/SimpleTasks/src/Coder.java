//import java.util.Scanner;

public class Coder {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter a string no spaces and no Z`s please");
		// String input = sc.next();
		String input = "voinaimir";
		

		char[][] key = { { 'I', 'F', 'B', 'X', 'M' },
							{ 'A', 'O', 'J', 'E', 'T' },
							{ 'G', 'L', 'R', 'U', 'Q' },
							{ 'Y', 'N', 'H', 'D', 'V' },
							{ 'C', 'S', 'P', 'W', 'K' } };

		String coded = code(input, key);
		
		String deCoded = deCode(coded, key);

		System.out.println(coded);
		System.out.println(deCoded);


	}

	static int[] findChars(char firstChar, char secondChar, char[][] key) {

		int[] coordinates = new int[4];
		int found = 0;
		for (int row = 0; row < key.length && found < 2; row++) {
			for (int col = 0; col < key.length && found < 2; col++) {
				if (firstChar == key[row][col]) {
					coordinates[0] = row;
					coordinates[1] = col;
					found++;
				}
				if (secondChar == key[row][col]) {
					coordinates[2] = row;
					coordinates[3] = col;
					found++;
				}
			}
		}
		return coordinates;
	}

	static char[] appendA(char[] text) {

		char[] evenText = new char[text.length + 1];

		for (int i = 0; i < text.length; i++) {
			evenText[i] = text[i];
		}
		evenText[evenText.length - 1] = 'A';

		return evenText;

	}

	static String code(String text, char[][] key) {
		
		boolean isOdd = (text.length()%2!=0);

		text = text.toUpperCase();

		char[] charedText = text.toCharArray();

		if (isOdd) {
			charedText = appendA(charedText);
		}


		for (int i = 0; i < charedText.length; i += 2) {
			int[] coordinates = findChars(charedText[i], charedText[i + 1], key);

			if (coordinates[0] == coordinates[2]) {

				coordinates[1] = coordinates[1] + 1 < key.length ? coordinates[1] + 1: 0;
				coordinates[3] = coordinates[3] + 1 < key.length ? coordinates[3] + 1: 0;

				charedText[i] = key[coordinates[0]][coordinates[1]];
				charedText[i + 1] = key[coordinates[2]][coordinates[3]];

				continue;
			}

			if (coordinates[1] == coordinates[3]) {

				coordinates[0] = coordinates[0] + 1 < key.length ? coordinates[0] + 1: 0;
				coordinates[2] = coordinates[2] + 1 < key.length ? coordinates[2] + 1: 0;

				charedText[i] = key[coordinates[0]][coordinates[1]];
				charedText[i + 1] = key[coordinates[2]][coordinates[3]];
				continue;
			}

			charedText[i] = key[coordinates[0]][coordinates[3]];
			charedText[i + 1] = key[coordinates[2]][coordinates[1]];

		}
		
		if (isOdd) {
			int random=(int) Math.random()*(charedText.length-2)+1;
			charedText[random] = (char) (charedText[random] + ('a'-'A'));
		}
		return new String (charedText);
	}

	static String deCode(String text, char[][] key) {
		
		boolean wasOdd=false;
		
		if (!text.equals(text.toUpperCase())) {
			wasOdd=true;
		}
		
		text = text.toUpperCase();

		char[] charedText = text.toCharArray();


		for (int i = 0; i < charedText.length; i += 2) {
			
			int[] coordinates = findChars(charedText[i], charedText[i + 1], key);

			if (coordinates[0] == coordinates[2]) {

				coordinates[1] = coordinates[1] - 1 >= 0 ? coordinates[1] - 1: key[0].length-1;
				coordinates[3] = coordinates[3] - 1 >= 0 ? coordinates[3] - 1: key[0].length-1;

				charedText[i] = key[coordinates[0]][coordinates[1]];
				charedText[i + 1] = key[coordinates[2]][coordinates[3]];

				continue;
			}

			if (coordinates[1] == coordinates[3]) {

				coordinates[0] = coordinates[0] - 1 >= 0 ? coordinates[0] - 1: key.length-1;
				coordinates[2] = coordinates[2] - 1 >= 0 ? coordinates[2] - 1: key.length-1;

				charedText[i] = key[coordinates[0]][coordinates[1]];
				charedText[i + 1] = key[coordinates[2]][coordinates[3]];
				continue;
			}

			charedText[i] = key[coordinates[0]][coordinates[3]];
			charedText[i + 1] = key[coordinates[2]][coordinates[1]];

		}
		
		if (wasOdd) {
			charedText[charedText.length-1] = ' ';
		}
		return new String (charedText);
		
	}
}
