import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		System.out.println("Please enter two names delimited by comma.");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.trim();

		int countCommas = 0;

		if ((str.length() == 0)) {
			System.out.println("There is NO chars entered!");
			sc.close();
			return;

		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				countCommas++;
			}
			if ((countCommas > 1)) {
				System.out.println("More than one comma.");
				sc.close();
				return;

			}
		}

		if ((countCommas == 0)) {
			System.out.println("There is NO comma in the  entered string!");
			sc.close();
			return;

		}

		String[] words = str.split(",");

		String nameOneStr = words[0];
		String nameTwoStr = words[1];
		
		String nameOneStrNoSpace = words[0].replaceAll("\\s","");
		String nameTwoStrNospace = words[1].replaceAll("\\s","");
		
		// System.out.println(nameOneStrNoSpace);
		// System.out.println(nameTwoStrNospace);
		// System.out.println(sumASCII(nameOneStr));
		// System.out.println(sumASCII(nameTwoStr));
		
		
		
		if (sumASCII(nameOneStrNoSpace) > sumASCII(nameTwoStrNospace)) {
			System.out.println(nameOneStr);
			sc.close();
			return;

		}

		if (sumASCII(nameOneStrNoSpace) == sumASCII(nameTwoStrNospace)) {
			System.out
					.println("Both names have equal ASCII sum of their symbols.");
			sc.close();
			return;

		}

		else {
			System.out.println(nameTwoStr);

		}
		sc.close();

	}

	static int sumASCII(String word) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += word.charAt(i);

		}
		return sum;

	}

}
