import java.util.Arrays;



public class sixteen {

	public static void main(String[] args) {
		

		double[] arr = new double[] { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5,
				8.6, 9.1, -4 };
		double sum = 0;
		double av = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < 10; i++) {
			if (arr[i] < -0.231) {
				arr[i] = (i + 1) * (i + 1) + 41.25;
				arr[i] = Math.round(arr[i] * 10000000.0) / 10000000.0;

			}

			else {
				arr[i] *= (i + 1);
				arr[i] = Math.round(arr[i] * 10000000.0) / 10000000.0;
			}

		}

		for (int j = 0; j < 10; j++) {
			if (arr[j] != 0) {
				sum += arr[j];

			}

		}
		av = sum / arr.length;
		av = Math.round(av * 10000000.0) / 10000000.0;
		
		System.out.println(Arrays.toString(arr));
		System.out
				.println("The average of all numbers from the new array not equal to 0 is "
						+ av);
		
	}

}
