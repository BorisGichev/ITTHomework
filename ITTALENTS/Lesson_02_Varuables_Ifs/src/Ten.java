import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		boolean flag = true;

		while (flag == true) {
			System.out
					.println("Please enter volume of water as a whole number in the range of [10;9999] and I will tell you how many times will take you to move this volume");
			System.out
					.println("if you have two buckets with volume of 2 and 3 liters.");

			Scanner test = new Scanner(System.in);

			System.out.println("Please enter volume:");
			int vol = test.nextInt();
			int left = vol % 5;
			int times = vol / 5;

			if ((vol < 10) || (vol > 9999)) {
				System.out.println("Invalid range, please try again");
				System.out.println();
				continue;
			}

			if (left == 0) {
				System.out.println(times + " times with the bucket of 2 liters");
				System.out.println(times + " times with the bucket of 3 liters");

			}

			if (left == 1)  {
				System.out.println((times-1) + " times with the bucket of 2 liters");
				System.out.println((times+1) + " times with the bucket of 3 liters");
				

			}
			
			if (left == 2) {
				System.out.println(times + " times with the bucket of 2 liters");
				System.out.println(times + " times with the bucket of 3 liters");
				System.out.println("And in addition one bucket of 2 liters");

			}

			if (left == 3) {
				System.out.println(times + " times with the bucket of 2 liters");
				System.out.println(times + " times with the bucket of 3 liters");
				System.out.println("And in addition one bucket of 3 liters");

			}

			if (left == 4) {
				System.out.println((times + 2) + " times with the bucket of 2 liters");
				System.out.println(times  + " times with the bucket of 3 liters");

			}
			test.close();
			flag = false;
		}

	}

}
