import java.util.Arrays;

public class eighteen {

	public static void main(String[] args) {
		int[] arr = new int[] { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8, -3 ,3};
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11, 0,3 };
		int[] arr2 = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= arr1[i]) {
				arr2[i] = arr[i];
			}
			
			if (arr[i] < arr1[i]) {
				arr2[i] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
