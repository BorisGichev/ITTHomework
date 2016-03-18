import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an array of SEVEN whole numbers.");

		int[] arr = new int[7];
		System.out
				.println("Now let us start entering 7 whole numbers in the array.");

		for (int j = 0; j < 7; j++) {
			arr[j] = sc.nextInt();

		}

		// int[] arr = new int[] { 1, 1, 1, 1, 2, 2, 50 };
		double av = 0;
		for (int q = 0; q < arr.length; q++) {
			av += arr[q];
		}
		av /= arr.length;

		for (double m = 0;; m += 0.001) {
			for (int k = 0; k < arr.length; k++) {
				if (((av - m) < arr[k]) && (arr[k] < av + m)) {
					System.out
							.println("The average sum is "
									+ av
									+ " and the nearest number from the array to it is "
									+ arr[k]);
					sc.close();
					return;
				}
			}

		}
		
	}

}
