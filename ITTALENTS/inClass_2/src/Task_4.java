public class Task_4 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 1, 0, 0, 0 };
		int zeros = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeros++;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (i >= zeros) {
				System.out.print(1 + " ");
				continue;

			}
			System.out.print(0 + " ");

		}
	}

}
