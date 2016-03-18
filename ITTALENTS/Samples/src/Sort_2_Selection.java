import java.util.Arrays;

public class Sort_2_Selection {

	public static void main(String[] args) {
		int[] a = { 1, 8, 9, 7, 25, 2, 3, 10, 4, 54, 64, 5, 213, 16, 53, 14,
				99, 3, 513, 21, 53, 26 };

		System.out.println(Arrays.toString(selSort(a)));

	}

	static int[] selSort(int[] a) {
		
		int start=0;
		int end=a.length-1;

		for (int j = 0; j < (a.length / 2); j++) {

			
			int maxIndex = start;
			int minIndex = start;

			for (int i = start; i <= end; i++) {

				if (a[i] > a[maxIndex]) {

					maxIndex = i;
				}

				if (a[i] < a[minIndex]) {

					minIndex = i;
				}

			}

			int temp = a[maxIndex];
			a[maxIndex] = a[end];
			a[end] = temp;

			if (minIndex==end) {
				minIndex = maxIndex;
			}

			int temp1 = a[minIndex];
			a[minIndex] = a[start];
			a[start] = temp1;
			end--;
			start++;

		}
		return a;

	}
}
