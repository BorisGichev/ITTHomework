
public class Task_2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if ((i % 2 == 1) && (i <= 50)) {
				System.out.print(i+" ");
			}

			if ((i % 2 == 0) && (i > 50)) {
				System.out.print(i+" ");
			}
		}

	}

}
