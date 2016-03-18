import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		System.out
				.println("Please enter a string of letters and digits and we will tell you the sum of the numbers");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.trim();
		StringBuilder str = new StringBuilder(word);

		// leave only nums and minus
		for (int i = 0; i < str.length(); i++) {
			if ((i == str.length() - 1) && (str.charAt(i) == '-')) {
				str.setCharAt(i, ' ');
				break;
			}

			if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9') || ((str
					.charAt(i) == '-')))) {
				str.setCharAt(i, ' ');
			}

		}
		// check for lonely minus
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == '-') && (str.charAt(i + 1) == ' ')) {
				str.setCharAt(i, ' ');

			}

		}
		// set only one space for delimiter
		while (str.indexOf("  ") >= 0) {
			str.delete(str.indexOf("  "), str.indexOf("  ") + 1);
		}


		word = str.toString();

		String[] numsString = word.split(" ");
		

		int[] nums = new int[numsString.length];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (numsString[i].length() == 0) {
				nums[i] = 0;
				continue;
			}
			nums[i] = Integer.parseInt(numsString[i]);
			System.out.println(nums[i]);
			sum += nums[i];
		}

		System.out.println("The sum is " + sum);
		sc.close();
	}
}
