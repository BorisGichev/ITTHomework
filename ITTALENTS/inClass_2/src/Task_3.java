import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		System.out.println("Enter char`s");
		char[] arr = new char[l];

		for (int i = 0; i < l; i++) {
			arr[i] = sc.next().charAt(0);
		}

		System.out.println("Now enter the char that we look for");
		char neadle = sc.next().charAt(0);

		boolean found = false;
		int index = 0;
		for (int i = 0; i < l; i++) {
			if (arr[i] == neadle) {
				found = true;
				index = i;
				break;

			}

		}

		if (found == true)

		{
			System.out.println("IS found on " + index);
		}

		if (found == false)

		{
			System.out.println("NOT found");
		}
		sc.close();
	}

}
