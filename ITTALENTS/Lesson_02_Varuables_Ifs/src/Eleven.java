import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		boolean flag = true;

		while (flag == true) {

			Scanner test = new Scanner(System.in);

			System.out.println("Please enter three digit number without the digit zero");
			int num = test.nextInt();

			if ((num < 100) || (num > 999)) {
				System.out.println("Invalid range, please try again");
				System.out.println();
				continue;
			}
			int newNum = num;

			int c = num % 10;
			num /= 10;
			int b = num % 10;
			num /= 10;
			int a = num % 10;

			if ((a == 0) || (b == 0) || (c == 0)) {
				System.out.println("One of your digits is zero, please try again");
				System.out.println();
				continue;
			}

			if (newNum % c == 0) {
				System.out.println("Your number can be divided by " + c);

			}
			if (newNum % b == 0) {
				System.out.println("Your number can be divided by " + b);

			}
			if (newNum % a == 0) {
				System.out.println("Your number can be divided by " + a);

			} else {
				System.out.println("Your number can NOT be divided by neither of the three digits that it is made of!");
			}
			test.close();
			flag = false;
		}

	}

}
