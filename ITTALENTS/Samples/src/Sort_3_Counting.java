import java.util.Arrays;

public class Sort_3_Counting {

	public static void main(String[] args) {
		int[] a = { 1, 8, 9, 7, 15, 2, 3, 10, 4, 4, 25, 5, 13, 16, 3, 4,
				9, 3, 3, 20, 5, 26 };

		
		System.out.println(Arrays.toString(countSort(a)));

	}

	static int[] countSort(int[] a) {
		
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];

			}
		}
		
		int [] count=new int[max+1];
		
		for (int i = 0; i < a.length; i++) {
			count[a[i]]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			count[i]+=count[i-1];
		}
		
		int[] sorted=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			count[a[i]]--;
			
			sorted[count[a[i]]]=a[i];
		}
		

		return sorted;
	}

}
