import java.util.Scanner;


public class Task_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number.");
		int num = sc.nextInt();

		
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num*2-1; col++) {
				if ((col >= num-1-row)&&col<=num-1+row)  {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
