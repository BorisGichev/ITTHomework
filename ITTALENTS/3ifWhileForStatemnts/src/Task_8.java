import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a volume");
		int vol = sc.nextInt();
		int times = vol / 5;

		if (vol % 5 == 0) {
			System.out.println(times + " times with the two buckets");
		}
		if (vol % 5 == 1) {
			System.out
					.println((times - 1) + " times with the 2 litters bucket");
			System.out
					.println((times + 1) + " times with the 3 litters bucket");
		}
		if (vol % 5 == 2) {
			System.out
					.println((times + 1) + " times with the 2 litters bucket");
			System.out.println((times) + " times with the 3 litters bucket");
		}
		if (vol % 5 == 3) {
			System.out.println((times) + " times with the 2 litters bucket");
			System.out
					.println((times + 1) + " times with the 3 litters bucket");
		}
		if (vol % 5 == 4) {
			System.out
					.println((times + 2) + " times with the 2 litters bucket");
			System.out.println((times) + " times with the 3 litters bucket");
		}
		sc.close();
	}

}
