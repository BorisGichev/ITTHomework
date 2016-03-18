public class Task_8 {

	public static void main(String[] args) {
		String[] arr = { "hello", "world", "in", "a", "freame" };
		printArr(arr);
	}

	static void printArr(String[] arr) {
		int longest = arr[0].length();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > longest) {
				longest = arr[i].length();
			}
		}

		for (int row = 0; row < arr.length + 2; row++) {
			if (row == 0 || row == arr.length + 1) {
				for (int j = 0; j < longest + 2; j++) {
					System.out.print("*");
				}
				System.out.println();
				continue;
			}

			System.out.print("*");
			System.out.print(arr[row - 1]);
			for (int j = 0; j < longest - arr[row - 1].length(); j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");

		}
	}
}
