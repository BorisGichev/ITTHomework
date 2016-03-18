import java.util.Arrays;

public class Sort_1_Bubble {

	public static void main(String[] args) {
		int[] a = { 1, 8, 9, 7, 25, 2, 3, 10, 4, 54, 64, 5, 213, 16, 53, 12,
				99, 3, 513, 21, 53, 26 };

		System.out.println(Arrays.toString(bubSort(a)));

	}

	static int[] bubSort(int[] a) {
		for (int j = 0; j < a.length; j++) {
			boolean sorted = true;
			for (int i = 0; i < a.length - 1 - j; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
					sorted = false;
				}

			}
			if (sorted){
				return a;
			}
		}

		return a;

	}
}
