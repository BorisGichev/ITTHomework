import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {

		System.out.println("Please enter one number and we will print all three digit numbers, if the sum of their digits equals your number.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter number in the range [2;27]");
		int a1 = test.nextInt();
		
		if ((a1>27)||(a1<2)){
			System.out.print("Input out of range");
			test.close();
			return;
		}
		for (int i = 100; i <= 999; i++) {

			int a = i % 10;
			int b = ((i / 10) % 10);
			int c = ((i / 100) % 10);
			if (a +b +c == a1){
				System.out.print(i + ", ");
			}
				
		}
		test.close();

	}

}
