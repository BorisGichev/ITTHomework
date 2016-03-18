public class twenty {

	public static void main(String[] args) {

		for (int i = 1, sumH = 0; sumH <= 45; i++) {

			if (sumH > 45) {
				break;
			}

			for (int sumL = 0, j = i; sumL < 45; j++) {

				if (j == 10) {

					j = 0;

				}

				sumL += j;
				System.out.print(j + " ");

				if ((i == 1) && (j == 9)) {
					System.out.print("0 ");
					continue;
				}

			}
			System.out.println();

			sumH += i;
		}

	}

}
