import java.util.Scanner;

public class twentyFive {

	public static void main(String[] args) {
		System.out
				.println("Please enter one number and we will tell you the product of all numbers from 1 to it ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a = sc.nextInt();

		

		int sum = 1;

		if (a >= 1) {
		int i = 1;
		
			do {
				sum = sum * i;
				i++;
			} while (i <= a);
		}

		if (a < 1) {
			int i =-1;
			do {
				sum = sum * i;
				i--;
			} while (i >= a);
		}
		System.out.println(sum);
		sc.close();

	}

}
