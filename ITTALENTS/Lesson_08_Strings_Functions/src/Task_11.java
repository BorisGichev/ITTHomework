public class Task_11 {

	public static void main(String[] args) {
		int[] array = { 4, 8, 2, 1, 6, 8, 9, 11 };
		printArr(array);
	}

	static void printArr(int arr[]) {

		if (arr.length == 0) {
			System.out.println("You have entered an empty array");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
