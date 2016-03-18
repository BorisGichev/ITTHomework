import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of whole numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();

		if (l <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		int[] arr = new int[l];
		System.out.println("Now let us start entering the array.");

		for (int u = 0; u < l; u++) {
			arr[u] = sc.nextInt();

		}
		// SECOND array
		System.out
				.println("Please enter SECOND array of whole numbers, but for doing that first tell me how long do you want it to be?");
		int lN = sc.nextInt();

		if (lN <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		int[] arrN = new int[lN];
		System.out.println("Now let us start entering the SECOND array.");

		for (int m = 0; m < lN; m++) {
			arrN[m] = sc.nextInt();

		}
		// Compare
		
		if (arr.length != arrN.length) {
			System.out
					.println("The two arrays have DIFFERENT lengths and are NOT EQUAL to one another of course");
		} else {
			for (int i = 0; i < l; i++) {
				if (arr[i] != arrN[i]) {
					System.out
							.println("The two arrays have the same length but are NOT the same");
					sc.close();
					return;
				}
			}
			System.out
					.println("The two arrays have the SAME length and they are the SAME");
		}

		sc.close();
	}

}
