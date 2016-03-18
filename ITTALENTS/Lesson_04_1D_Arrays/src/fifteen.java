import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of real numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();

		if (l <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		double[] arr = new double[l];
		System.out.println("Now let us start entering the array.");

		for (int q = 0; q < l; q++) {
			arr[q] = sc.nextDouble();

		}

//		 double[] arr = new double[] { 1.2, 2.9, 3.1, 4.5, 5.5, 1.2, -9,
//		 -12.3,11.5 };

		double max1 = Double.MIN_VALUE;
		int ind1 = 0;
		double max2 = Double.MIN_VALUE;
		int ind2 = 0;
		double max3 = Double.MIN_VALUE;
		double temp = Double.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				temp = arr[i];
			}
			if (arr[i] < 0) {
				temp = -arr[i];
			}

			if ((temp >= -max1) && (max1 < 0)) {
				max1 = arr[i];
				ind1 = i;
			}

			if ((temp >= max1) && (max1 >= 0)) {
				max1 = arr[i];
				ind1 = i;
			}

		}

		for (int j = 0; j < arr.length; j++) {
			if (j == ind1) {
				continue;
			}

			if (arr[j] >= 0) {
				temp = arr[j];
			}
			if (arr[j] < 0) {
				temp = -arr[j];
			}

			if ((temp >= -max2) && (max2 < 0)) {
				max2 = arr[j];
				ind2 = j;
			}

			if ((temp >= max2) && (max2 >= 0)) {
				max2 = arr[j];
				ind2 = j;
			}

		}

		for (int m = 0; m < arr.length; m++) {
			if ((m == ind1) || (m == ind2)) {
				continue;
			}

			if (arr[m] >= 0) {
				temp = arr[m];
			}
			if (arr[m] < 0) {
				temp = -arr[m];
			}

			if ((temp >= -max3) && (max3 < 0)) {
				max3 = arr[m];
			}

			if ((temp >= max3) && (max3 >= 0)) {
				max3 = arr[m];

			}

		}
		System.out.println(max1 + "; " + max2 + "; " + max3);
		sc.close();
	}
}
