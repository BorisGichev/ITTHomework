import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		System.out.println("Please enter a number in the range [0;24]");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();

		if ((hour > 24) || (hour < 0)) {
			System.out.println("Input hour in not valid");
			sc.close();
			return;
		}
		// I`m using cases just to exercise them!
		switch (hour) {
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Good evening");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Good morning");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println("Good day");
			break;
		default:
			System.out.println("Input hour is not valid");

		}
		sc.close();

	}

}
