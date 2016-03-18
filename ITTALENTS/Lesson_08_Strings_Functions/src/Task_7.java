import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {
		System.out.println("Please enter words separated by space");
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		words = words.trim();

		int howLong = 0;
		int howLongTemp = 0;
		int index = 0;
		int counter = 1;

		for (int i = 0; i < words.length(); i++) {

			if ((words.charAt(i) == ' ') && (words.charAt(i + 1) != ' ')
					&& (i != (words.length() - 1))) {
				counter++;

			}

			if (words.charAt(i) != ' ') {
				howLongTemp++;
				
			}

			if (words.charAt(i) == ' ') {
				if (howLongTemp > howLong) {

					howLong = howLongTemp;
					index = i;
				}
				howLongTemp = 0;
			}
			
			if (i == (words.length() - 1)) {
				if (howLongTemp > howLong) {

					howLong = howLongTemp;
					index = i+1;
				}
			}
		}

		System.out.print(counter + " words and the longest has " + howLong
				+ " symbols and it is :");

		for (int i = index - howLong; i < index; i++) {
			System.out.print(words.charAt(i));

		}
		sc.close();

	}
}
