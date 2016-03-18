import java.util.Arrays;
import java.util.Scanner;

public class fourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[] { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5,
				-110, 212, 341, 1.2 };
		int count = 0;
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((-2.99 <= arr[i]) && (+2.99 >= arr[i])) {
				count++;
			}

		}

		double[] arrN = new double[count];

		for (int j = 0; j < arr.length; j++) {
			if ((-2.99 <= arr[j]) && (+2.99 >= arr[j])) {
				arrN[ind] = arr[j];
				ind++;
			}

		}
		sc.close();
		System.out.println(Arrays.toString(arrN));

	}

}
