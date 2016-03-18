import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out
				.println("Please enter three numbers and we will swap their value in the computer memory");
		Scanner test = new Scanner(System.in);

		System.out.println("Please enter a1:");
		int a1 = test.nextInt();
		System.out.println("Please enter a2:");
		int a2 = test.nextInt();
		System.out.println("Please enter a3:");
		int a3 = test.nextInt();

		a1 = a1 + a2;
		a2 = a1 - a2;
		a1 = a1 - a2;

		a2 = a2 + a3;
		a3 = a2 - a3;
		a2 = a2 - a3;
		System.out.println("This is how the variables look in the RAM after swamping: a1="+ a1 + "; a2=" + a2 + "; a3=" + a3);
		test.close();
	}

}
