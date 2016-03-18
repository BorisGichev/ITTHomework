public class Task_13 {

	public static void main(String[] args) {
		printArr(combineArr(makeArr(1), makeArr(10)));
	}

	static int[] combineArr(int[] arrOne, int[] arrTwo) {
		if ((arrOne.length == 0) && (arrTwo.length == 0)) {
			System.out.println("You have entered two arrays with zero length");
		}

		int[] arrayNew = new int[arrOne.length + arrTwo.length];

		for (int i = 0; i < arrayNew.length; i++) {
			if (i < arrOne.length) {
				arrayNew[i] = arrOne[i];
			} 
			else {
				arrayNew[i] = arrTwo[i-arrOne.length];
			}
		}
		return arrayNew;
	}

	static int[] makeArr(int length) {

		int[] array = new int[length];

		for (int i = 0, num = 1; i < array.length; i++) {
			array[i] = num;
			num++;
		}
		return array;
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
