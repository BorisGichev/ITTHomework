public class Task_7 {

	public static void main(String[] args) {
		int[] arr = { 9, 13, 2, 7, 3, 8, 12, 4, 5, 2, 16 };

		int max1 = arr[0];
		int max2 = arr[0];
		int max3 = arr[0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max1 < arr[j]) {
					max1 = arr[j];
				}
				if ((max2 < arr[j])&&(arr[j]<max1)) {
					max2 = arr[j];
				}
				if ((max3 < arr[j])&&(arr[j]<max2)) {
					max3 = arr[j];
				}
			}
		}

		System.out.println(max1);

		System.out.println(max2);
		System.out.println(max3);
	}

}
