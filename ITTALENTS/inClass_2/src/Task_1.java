
public class Task_1 {

	public static void main(String[] args) {
		int[] arrN = { 4, 1, 3, 4, 0 };

		boolean isPositive = true;

		for (int i = 0; i < arrN.length; i++) {

			if (arrN[i] < 0) {
				isPositive = false;

			}
		}

		if (isPositive == true) {
			System.out.println("Full of positive numbers");
		}

		if (isPositive == false) {
			System.out.println("NOT full of positive numbers");
		}

	}

}
