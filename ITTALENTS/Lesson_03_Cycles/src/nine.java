import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first one:");
		int a1 = sc.nextInt();
		System.out.println("Please enter the second one:");
		int a2 = sc.nextInt();
		long sum = 0;
		boolean flag = false;
		if (a1 == a2) {
			System.out.println("The number " + a1 + " is equal to " + a2
					+ " and it is hard to tell if it is between them");
			sc.close();
			return;
		}

		if (a1 > a2) {
			for (; (a2 <= a1); a2++) {

				if (((a2 * a2) % 3) == 0 && (a2 != 0)) {
					System.out.print("skip 3, ");
					continue;
				}
				sum = sum + (a2 * a2);
				if (sum >= 200) {
					break;
				}
				System.out.print(a2 * a2 + ", ");
			}
			sc.close();
			flag=true;
		}

		if ((a2 > a1)&&flag==false) {
			for (; (a1 <= a2); a1++) {

				if (((a1 * a1) % 3) == 0 && (a1 != 0)) {
					System.out.print("skip 3, ");
					continue;
				}
				sum = sum + (a1 * a1);
				if (sum >= 200) {
					System.out.println();
					System.out.println("The sum of the numbers by the power of two is more than 200 so we will stop printing");
					break;
				}
				System.out.print(a1 * a1 + ", ");
			}
			sc.close();
		}
		System.out.println();
	
	}
}
