public class Task_8 {

	public static void main(String[] args) {
		boolean[][] arrN = { { false, false, false, false },
				{ false, false, false, false }, { false, false, false, false },
				{ false, false, false, false } };
		boolean flag = false;

		for (int i = 0; i < arrN.length; i++) {
			for (int j = 0; j < arrN[i].length; j++) {
				if ((j + i < (arrN.length - 1)) && (arrN[i][j] == true)) {
					flag = true;

				}

			}

		}
		if (flag) {
			System.out.println("There is true in the upper part.");
		}
		else{
			System.out.println("There is NO true in the upper part.");
		}

		for (int m = 0; m < arrN.length; m++) {
			for (int n = 0; n < arrN[m].length; n++) {
				System.out.print(arrN[m][n] + " ");

			}
			System.out.println();
		}

	}

}
